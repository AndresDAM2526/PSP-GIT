import java.util.ArrayList;

public class Contenedor {
    private ArrayList<Integer> contenedor = new ArrayList<>();

    public synchronized void producir(int producido) {
        contenedor.add(producido);
        notifyAll();
    }

    public synchronized int consumido(){
        while(contenedor.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int consumido=contenedor.remove(0);
        return consumido;
    }
}