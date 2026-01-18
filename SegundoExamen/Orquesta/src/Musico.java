public class Musico implements Runnable {
    private String instrumento;
    private int tiempoAfinar;
    private Thread companero;

    public Musico(String instrumento, int tiempoAfinar) {
        this.instrumento = instrumento;
        this.tiempoAfinar = tiempoAfinar;
        this.companero = null;
    }

    public void setCompanero(Thread companero) {
        this.companero = companero;
    }

    @Override
    public void run() {
        if (this.companero != null) {
            try {
                companero.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El músico ha empezado a afinar el " + this.instrumento);
        try {
            Thread.sleep(this.tiempoAfinar * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El musico ha terminado de afinar");

    }
}
