public class Cliente implements Runnable{

    private Supermercado supermercado;

    public Cliente(Supermercado supermercado){
        this.supermercado=supermercado;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.supermercado.colocarProducto();
        }
    }
}
