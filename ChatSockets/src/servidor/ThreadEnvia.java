/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author williaman.corgar
 */
public class ThreadEnvia implements Runnable {

    private final PrincipalChat main;
    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;

    public ThreadEnvia(PrincipalChat main, Socket conexion) {
        this.main = main;
        this.conexion = conexion;

        main.campoTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mensaje = event.getActionCommand();
                enviarDatos(mensaje);
                main.campoTexto.setText("");

            }
        });
    }

    private void enviarDatos(String mensaje) {
        try {
            salida.writeObject("Servidor>>> " + mensaje);
            salida.flush();
            main.mostrarMensaje("Servidor>>> " + mensaje);
        } catch (IOException iOException) {
            main.mostrarMensaje("Error escribiendo mensaje");
        }
    }

    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }

    @Override
    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
        } catch (SocketException ex) {
        } catch (IOException iOException) {
            iOException.printStackTrace();
        } catch (NullPointerException ex) {
        }
    }

}
