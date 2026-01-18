public class EmpleadoEnvio extends Thread {
    private Impresora impresora;

    public EmpleadoEnvio(Impresora impresora) {
        this.impresora = impresora;
    }

    public void run() {
        while (true) {
            impresora.imprimir();
        }
    }
}
