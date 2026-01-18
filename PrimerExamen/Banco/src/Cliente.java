import java.util.Random;

public class Cliente implements Runnable {
    private CuentaBancaria cuenta;

    private String nombre;

    public Cliente(String nombre, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int numRandom = random.nextInt(100) + 1;
            cuenta.retirarDinero(this.nombre, numRandom);
        }

    }
}
