public class Coche implements Runnable {

    private String nombre;
    private Puente puente;

    public Coche(String nombre, Puente puente) {
        this.nombre = nombre;
        this.puente = puente;
    }

    @Override
    public void run() {
        while (true) {
            puente.entrar(this.nombre);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            puente.salir(this.nombre);
        }
    }
}
