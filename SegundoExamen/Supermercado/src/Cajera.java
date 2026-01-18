public class Cajera implements Runnable{

    private Supermercado supermercado;

    public Cajera(Supermercado supermercado){
        this.supermercado=supermercado;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.supermercado.cobrarProducto();
        }
    }
}
