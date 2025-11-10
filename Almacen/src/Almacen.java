public class Almacen {
    private int producto;
    private boolean vacio;

    public Almacen(int producto){
        this.producto=producto;
        this.vacio=false;
    }

    public synchronized void producir(){
        while (!vacio){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.producto+=2;
        vacio=false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producido "+this.producto);
        notifyAll();
    }

    public synchronized void consumir(){
        while(vacio){
            try {
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
        this.producto-=1;
        System.out.println("Restante "+this.producto);
        if(this.producto==0){
            vacio=true;
        }
        notifyAll();
    }
}
