public class Respirador {
    private boolean enUso=false;

    public synchronized void liberar(){
        while(!enUso){
            try {
               wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        enUso=false;
        System.out.println("Respirador libre");
        notifyAll();
    }

    public synchronized void usar(){
        while(enUso){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        enUso=true;
        System.out.println("Respirador ocupador");
        notifyAll();
    }
}
