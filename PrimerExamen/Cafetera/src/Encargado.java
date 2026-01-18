public class Encargado extends Thread{

    private Cafetera cafetera;

    public Encargado(Cafetera cafetera){
        this.cafetera=cafetera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cafetera.rellenarAgua();
        }
    }
}
