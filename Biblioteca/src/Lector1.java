public class Lector1 extends Thread{
    private Biblioteca bi;

    public Lector1(Biblioteca bi){
        this.bi=bi;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bi.tomarLibro();
        }
    }
}
