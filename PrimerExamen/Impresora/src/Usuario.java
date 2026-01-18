import java.util.Random;

public class Usuario implements Runnable {
    private String nombre;
    private Impresora impresora;

    public Usuario(String nombre, Impresora impresora) {
        this.nombre = nombre;
        this.impresora = impresora;
    }

    @Override
    public void run() {
        Random num = new Random();
        for (int i = 0; i < 5; i++) {
            int numRandom = num.nextInt(10);
            try {
                Thread.sleep(numRandom * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            impresora.imprimirDocumento(this.nombre, "Foto");
        }

    }
}
