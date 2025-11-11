public class Respirador {
    private boolean enUso=false;

    public synchronized void liberar(){
        while(!enUso){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Se libera el respirador");
        enUso=false;
        notifyAll();
    }

    public synchronized void usar(){
        while(enUso){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Respirador ocupado");
        enUso=true;
        notifyAll();
    }
}
