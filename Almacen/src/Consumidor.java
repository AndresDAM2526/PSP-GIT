public class Consumidor extends Thread{
    private Almacen almacen;

    public Consumidor(Almacen almacen){
        this.almacen=almacen;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            almacen.consumir();
        }
    }
}
