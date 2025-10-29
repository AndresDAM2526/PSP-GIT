package org.example;

public class DeterminaSeccionCritica extends Thread{
    private int contador;
    private static int acumulador;
    private void ajustaContador(){this.contador-=500;}
    private void ajustaAcumulador(){this.acumulador-=500;}

    public void run(){
        for (int i = 0; i < 1000; i++) {
            contador++;
            System.out.println("Contador:"+contador);
            acumulador++;
            System.out.println("Aculumador:"+acumulador);
            if(contador==600) ajustaContador();
            if(acumulador==600) ajustaAcumulador();
        }
    }

    static void main() {
        for (int i = 0; i < 10; i++) {
            new DeterminaSeccionCritica().start();
        }
    }
}
