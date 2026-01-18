public class Productor extends Thread{
    private Almacen almacen;

    public Productor(Almacen almacen){
        this.almacen=almacen;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            almacen.producir();
        }

    }
}
