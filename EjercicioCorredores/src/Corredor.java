import java.util.Random;

public class Corredor extends Thread {
    private String nombre;
    private int distancia;

    public Corredor(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    @Override
    public void run() {
        int distanciaRecorrida = 0;
        System.out.println("El corredor "+this.nombre+" comienza la carrera");
        while (distanciaRecorrida < this.distancia) {
            Random num = new Random();
            try {
                Thread.sleep((num.nextInt(9)) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distanciaRecorrida += 10;
            System.out.println("El corredor " + this.nombre + " ha recorrido " + distanciaRecorrida);
        }
        System.out.println("El corredor "+this.nombre+" ha terminado");

    }
}
