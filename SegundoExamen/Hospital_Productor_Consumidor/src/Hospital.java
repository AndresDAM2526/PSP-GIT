public class Hospital extends Thread {
    public volatile boolean emergencia = false;
    private Almacen almacen;

    public Hospital(Almacen almacen) {
        this.almacen = almacen;
    }

    public void activarEmergencia() {
        this.emergencia=true;
    }

    public void run() {
        while (!emergencia) {
            almacen.consumir();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hospital usando generadores propios");

    }
}
