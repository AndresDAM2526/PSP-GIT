public class Medico extends Thread{
    private String nombre;

    public Medico(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Estoy atendiendo pacientes");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Llamada para una reunión urgente");
            }
        }
    }
}
