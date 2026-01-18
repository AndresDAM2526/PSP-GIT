public class Corredor extends Thread {
    private String nombre;
    private Thread predecesor;

    public Corredor(String nombre) {
        this.nombre = nombre;
        this.predecesor = null;
    }

    public void setPredecesor(Thread predecesor) {
        this.predecesor = predecesor;
    }

    public void run() {
        if (predecesor != null) {
            try {
                this.predecesor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Corredor "+this.nombre+" recibe el testigo y empieza a correr");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Corredor "+this.nombre+" ha terminado su tramo");
    }
}
