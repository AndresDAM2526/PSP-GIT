public class PlantaProduccion extends Thread {
    private Almacen almacen;


    public PlantaProduccion(Almacen almacen) {
        this.almacen = almacen;
    }

    public void run() {
        while (!isInterrupted()) {
            almacen.producir();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Planta cerrada por mantenimiento");

            }


        }
    }


}
