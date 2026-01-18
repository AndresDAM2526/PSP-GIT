public class EmpleadoRecogida extends Thread {
    private Impresora impresora;

    public EmpleadoRecogida(Impresora impresora) {
        this.impresora = impresora;
    }

    public void run() {
        while (true) {
            impresora.recoger();
        }
    }
}
