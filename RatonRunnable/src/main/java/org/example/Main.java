package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Raton fievel=new Raton("Fievel",4);
        Raton jerry=new Raton("Jerry",5);
        Raton pinky=new Raton("Pinky",3);
        Raton mickey=new Raton("Mickey",6);

        /*
        Thread hilo1=new Thread(fievel);
        Thread hilo2=new Thread(jerry);
        Thread hilo3=new Thread(pinky);
        Thread hilo4=new Thread(mickey);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        */

        new Thread(fievel).start();
        new Thread(jerry).start();
        new Thread(pinky).start();
        new Thread(mickey).start();
    }
}
