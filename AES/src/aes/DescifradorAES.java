/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author williaman.corgar
 */
public class DescifradorAES {

    public static void main(String[] args) {
        final String NOMBRE_FICHERO = "mensaje_cifrado.txt";
        final String PASSWORD = "Confucio";
        String donde = System.getProperty("os.name");
        donde = donde.substring(0, 3);
        String home = System.getProperty("user.home");
        String ubicacion = "";
        if (donde.equals("Mac")) {
            ubicacion = home + "/Documents" + NOMBRE_FICHERO;
        } else if (donde.equals("Win")) {
            ubicacion = home + "\\Mis documentos\\" + NOMBRE_FICHERO;
        } else {
            ubicacion = NOMBRE_FICHERO;
        }
        try {
            File fichero = new File(ubicacion);
            Key clave = ManejadorAES.obtenerClave(PASSWORD);
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            
        } catch (Exception e) {
        }
    }

}
