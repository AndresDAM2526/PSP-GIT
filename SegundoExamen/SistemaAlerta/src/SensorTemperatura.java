public class SensorTemperatura extends Thread{
    public Servidor servidor;
    public SensorTemperatura(Servidor servidor){
        this.servidor=servidor;
    }

    public void run(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        servidor.interrupt();
    }
}
