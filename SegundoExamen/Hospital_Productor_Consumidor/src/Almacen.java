public class Almacen {
    private int tanques=0;
    private final int MAX=5;

    public synchronized void producir(){
        while (tanques==MAX){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tanques+=1;
        System.out.println("El producto ha generado 1");
        notifyAll();
    }

    public synchronized void consumir(){
        while(tanques==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tanques-=1;
        System.out.println("El consumir ha gastado 1");
        notifyAll();
    }
}
