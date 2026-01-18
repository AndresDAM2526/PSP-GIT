public class Decrementar extends Thread{
    private Contador contador;

    public Decrementar(Contador contador){
        this.contador=contador;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contador.decrementar();
        }

    }
}
