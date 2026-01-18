public class CoordinadorUrgencias extends Thread{
    private String nombre;
    private Medico doctor;

    public CoordinadorUrgencias(Medico medico){
        this.doctor=medico;
    }

    public void  run(){
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doctor.interrupt();
    }
}
