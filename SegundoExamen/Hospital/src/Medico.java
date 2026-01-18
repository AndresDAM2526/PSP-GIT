public class Medico extends Thread{
    private String nombre;

    public Medico(String nombre){
        this.nombre=nombre;
    }

    public void run(){
        while (true){
            try {
                System.out.println("Estoy trabajando sin parar");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Me han llamado para una reunión urgente");
            }

        }
    }
}
