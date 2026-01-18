public class SistemaRiego extends Thread {
    private String zona;
    private int duracionRiego;

    public SistemaRiego() {
        this.zona = "ZonaGeneral";
        this.duracionRiego = 5;
    }

    public SistemaRiego(String zona, int duracionRiego) {
        this.zona = zona;
        this.duracionRiego = duracionRiego;
    }

    public void regar() {

        System.out.println("Se va a regar la zona " + this.zona);
        try {
            sleep(duracionRiego * 1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("La zona " + this.zona + " ha terminado de regarse");

    }

    @Override
    public void run() {
        regar();
    }
}
