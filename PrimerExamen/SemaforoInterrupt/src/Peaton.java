public class Peaton extends Thread{
    private String nombre;
    private Semaforo semaforo;

    public Peaton(String nombre,Semaforo semaforo){
        this.nombre=nombre;
        this.semaforo=semaforo;
    }

    @Override
    public void run() {
        while(true){
            semaforo.cruzar();
        }
    }
}
