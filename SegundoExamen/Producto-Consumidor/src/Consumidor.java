public class Consumidor extends Thread {
    private Contenedor contenedor;

    public Consumidor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public void run() {
        while (true) {
            int consumido = contenedor.consumido();
            System.out.printf("El consumidor ha gastado " + consumido);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}