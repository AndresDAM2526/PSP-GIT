/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author williaman.corgar
 */
public class PrincipalChat extends JFrame {
    
    public JTextField campoTexto;
    public JTextArea areaTexto;
    private static ServerSocket servidor;
    private static Socket conexion;
    private static String ip = "127.0.0.1";
    
    public static PrincipalChat main;
    
    public PrincipalChat() {
        super("Servidor");
        campoTexto = new JTextField();
        campoTexto.setEditable(false);
        add(campoTexto, BorderLayout.NORTH);
        
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        areaTexto.setBackground(Color.ORANGE);
        areaTexto.setForeground(Color.BLACK);
        campoTexto.setForeground(Color.BLACK);
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem salir = new JMenuItem("Salir");
        menuArchivo.add(salir);
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menuArchivo);
        
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setSize(300, 320);
        setVisible(true);
    }
    
    public void mostrarMensaje(String mensaje) {
        areaTexto.append(mensaje + "\n");
    }
    
    public void habilitarTexto(boolean editable) {
        campoTexto.setEditable(editable);
    }
    
    public static void main(String[] args) {
        PrincipalChat main = new PrincipalChat();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            servidor = new ServerSocket(1111, 100);
            main.mostrarMensaje("Esperando cliente...");
            while (true) {
                try {
                    conexion = servidor.accept();
                    main.mostrarMensaje("Conectado a :" + conexion.getInetAddress().getHostName());
                    main.habilitarTexto(true);
                    executor.execute(new ThreadRecibe(main, conexion));
                    executor.execute(new ThreadEnvia(main, conexion));
                } catch (Exception e) {
                }
                
            }
        } catch (IOException ex) {
            
        }
        executor.shutdown();
    }
    
}
