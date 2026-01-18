public class Cafetera {
    private int capacidadActual = 0;
    private int capacidadMaxima;

    public Cafetera(int capacidad) {
        this.capacidadMaxima = capacidad;
    }

    public synchronized void servirCafe() {
        while (capacidadActual == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        capacidadActual -= 10;
        System.out.println("se sirve un cafe,agua restante: "+capacidadActual);

        notifyAll();

    }

    public synchronized void rellenarAgua() {
        while (capacidadActual != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        capacidadActual = capacidadMaxima;
        System.out.println("Se procede a rellenar el agua");
        notifyAll();

    }
}
