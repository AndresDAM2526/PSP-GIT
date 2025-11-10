import java.util.Random;

public class Cliente implements Runnable{

    private String nombre;
    private CajaRegistradora caja;

    public Cliente(String nombre,CajaRegistradora caja){
        this.nombre=nombre;
        this.caja=caja;
    }


    @Override
    public void run() {
        Random num=new Random();
        for (int i = 0; i < 3; i++) {
            caja.pagar(this.nombre,num.nextInt(100));
        }
    }
}
