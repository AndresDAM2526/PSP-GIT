public class Director implements Runnable {
    private Thread musico;

    public Director() {
        this.musico = null;
    }

    public void setCompanero(Thread musico) {
        this.musico = musico;
    }

    @Override
    public void run() {
        if (musico != null) {
            try {
                musico.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Comienza el primer gran golpe de batuta");

    }
}
