public class BrazoRobotico implements Runnable {
    private String nombre;
    private int tiempoProceso;
    private Thread robotPrevio;

    public BrazoRobotico(String nombre, int tiempoProceso) {
        this.nombre = nombre;
        this.tiempoProceso = tiempoProceso;
        this.robotPrevio = null;
    }

    public void setRobot(Thread robotPrevio) {
        this.robotPrevio = robotPrevio;
    }


    public void ensamblar() {
        if (robotPrevio != null) {
            try {
                this.robotPrevio.join();
            } catch (InterruptedException e) {
                e.getStackTrace();
            }

        }
        System.out.println("Robot " + this.nombre + " comenzando ensamblaje");
        try {
            Thread.sleep(tiempoProceso*1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("Robot " + this.nombre + " ha finalizado su pieza");

    }

    @Override
    public void run() {
        ensamblar();
    }
}
