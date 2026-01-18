public class Peaton extends Thread{
    private String nombre;
    private Semaforo semaforo;

    public Peaton(String nombre,Semaforo semaforo){
        this.nombre=nombre;
        this.semaforo=semaforo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            semaforo.cruzar(this.nombre);
        }
    }
}
