public class Persona extends Thread{

    private Cafetera cafetera;

    public Persona(Cafetera cafetera){
        this.cafetera=cafetera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cafetera.servirCafe();
        }
    }
}
