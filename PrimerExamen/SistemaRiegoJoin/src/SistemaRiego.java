public class SistemaRiego implements Runnable {

    private String zona;
    private int duracionRiego;
    private Thread dependencia;

    public SistemaRiego() {
        this.zona = "ZonaGeneral";
        this.duracionRiego = 5;
        this.dependencia = null;
    }

    public SistemaRiego(String zona, int duracionRiego) {
        this.zona = zona;
        this.duracionRiego = duracionRiego;
        this.dependencia = null;
    }

    public void setDependencia(Thread dependencia) {
        this.dependencia = dependencia;
    }

    public void regar() {

        if (this.dependencia != null) {
            System.out.println(this.zona + " debe esperar que termine " + dependencia.getName());
            try {
                dependencia.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(this.zona + " ha comenzado a regarse");
        try {
            Thread.sleep(this.duracionRiego * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.zona + " ha terminado de regarse");

    }

    @Override
    public void run() {
        regar();
    }
}
