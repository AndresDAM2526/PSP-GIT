import java.util.Random;

public class Contador {
    private int contador=0;
    private boolean vacio=true;

    public synchronized void incrementar(){
        while (!vacio){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Random num=new Random();
        int numRan=num.nextInt(10);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contador+=numRan;
        System.out.println("Se suma "+numRan+" al contador, valor actual: "+contador);
        vacio=false;
        notify();
    }

    public synchronized void decrementar(){
        while(vacio){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contador--;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se resta 1 al contador, valor actual: "+contador);
        if(contador==0){
            vacio=true;
        }
        notify();
    }
}
