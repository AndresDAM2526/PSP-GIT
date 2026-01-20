public class Artista implements Runnable {

    private String nombre;
    private Escenario escenario;

    public Artista(String nombre, Escenario escenario) {
        this.nombre = nombre;
        this.escenario = escenario;
    }

    @Override
    public void run() {
        if (Thread.interrupted()) {
            System.out.println("Me han echado del escenario");
            return;
        }
        for (int i = 0; i < 3; i++) {
            escenario.actuar("Participante " + i);
        }


    }
}
