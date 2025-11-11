import java.util.Random;

public class Buffer {
    private int valor=0;

    public synchronized void producir(){
        while(valor!=0){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Random random=new Random();
        int numRandom=random.nextInt(9)+1;
        valor=numRandom;
        System.out.println("Se añaden "+valor);
        notifyAll();
    }

    public synchronized void consumir(){
        while(valor==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random random=new Random();
        int numRandom=random.nextInt(9)+1;
        int consumido=Math.min(numRandom,valor);
        valor-=consumido;
        System.out.println("Se consumen "+consumido+". Restante: "+valor);
        notifyAll();
    }
}
