import java.util.Random;

public class Coche implements Runnable {
    private String nombre;
    private TunelDeLavado tunelDeLavado;

    public Coche(String nombre, TunelDeLavado tunelDeLavado) {
        this.nombre = nombre;
        this.tunelDeLavado = tunelDeLavado;
    }

    @Override
    public void run() {
        tunelDeLavado.entrar(this.nombre);
        try {
            Thread.sleep((new Random().nextInt(3) + 1) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tunelDeLavado.salir(this.nombre);
    }
}
