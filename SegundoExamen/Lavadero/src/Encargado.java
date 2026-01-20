public class Encargado extends Thread {
    private Thread coche;

    public Encargado(Thread coche) {
        this.coche = coche;
    }

    @Override
    public void run() {
        if (coche != null) {
            try {
                coche.join();
                System.out.println("Encargado: Todos los coches lavados.Cerrando lavadero");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
