public class Lector2 extends Thread{
    private Biblioteca bi;

    public Lector2(Biblioteca bi){
        this.bi=bi;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bi.devolverLibro();
        }
    }
}
