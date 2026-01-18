public class Incrementar extends Thread{
    private Contador contador;

    public Incrementar(Contador contador){
        this.contador=contador;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contador.incrementar();
        }

    }
}
