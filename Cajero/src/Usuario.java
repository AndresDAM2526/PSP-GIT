import java.util.Random;

public class Usuario extends Thread{

    private Cajero cajero;

    public Usuario(Cajero cajero){
        this.cajero=cajero;
    }

    @Override
    public void run() {
        Random num= new Random();
        for (int i = 0; i < 10; i++) {
            int numR=num.nextInt(50);
            cajero.retirar(numR);
        }
    }
}
