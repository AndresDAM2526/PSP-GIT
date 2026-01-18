public class CoordinadorUrgencias extends Thread{
    private Medico medico;

    public CoordinadorUrgencias(Medico medico){
        this.medico=medico;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        medico.interrupt();
    }
}
