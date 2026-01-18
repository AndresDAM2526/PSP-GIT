public class MedicoB extends Thread {
    private Respirador respirador;

    public MedicoB(Respirador respirador) {
        this.respirador = respirador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            respirador.liberar();
        }

    }
}
