import static java.lang.Thread.sleep;

public class SistemaRiego implements Runnable {
    public String zona;
    public int duracionRiego;
    public Thread dependencia;

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
            System.out.println(this.zona + " debe esperar a que termine " + dependencia.getName());
            try {
                dependencia.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Se va a empezar a regar la zona " + this.zona);
        try {
            sleep(duracionRiego * 1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("Se ha terminado de regar la zona " + this.zona);
    }

    @Override
    public void run() {
        regar();
    }
}
