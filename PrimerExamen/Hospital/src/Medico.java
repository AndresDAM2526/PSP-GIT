public class Medico extends Thread{
    private String nombre;

    public Medico(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Estoy atendiendo pacientes sin parar");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Me han llamado para una reunión urgente");
            }
        }
    }
}
