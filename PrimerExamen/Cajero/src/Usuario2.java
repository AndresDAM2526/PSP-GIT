import java.util.Random;

public class Usuario2 extends Thread{

    private Cajero cajero;

    public Usuario2(Cajero cajero){
        this.cajero=cajero;
    }

    @Override
    public void run() {
        Random num=new Random();
        for (int i = 0; i < 10; i++) {
            int d=num.nextInt(100);
            cajero.depositar(d);
        }
    }
}
