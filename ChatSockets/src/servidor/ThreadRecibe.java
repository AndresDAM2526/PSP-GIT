/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author williaman.corgar
 */
public class ThreadRecibe implements Runnable {
    
    private final PrincipalChat main;
    private ObjectInputStream entrada;
    private String mensaje;
    private Socket cliente;
    
    public ThreadRecibe(PrincipalChat main, Socket cliente) {
        this.main = main;
        this.cliente = cliente;
    }
    
    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }
    
    @Override
    public void run() {
        try {
            entrada = new ObjectInputStream(cliente.getInputStream());
        } catch (IOException ex) {
        }
        do {
            try {
                mensaje = (String) entrada.readObject();
                main.mostrarMensaje(mensaje);
            } catch (EOFException eOFException) {
                main.mostrarMensaje("Fin de la conexión");
                break;
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
                main.mostrarMensaje("Objeto desconocido");
            }
        } while (!mensaje.equals("Servidor>>> TERMINATE"));
        try {
            entrada.close();
            cliente.close();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        main.mostrarMensaje("Fin de la conexión");
        System.exit(0);
    }
    
}
