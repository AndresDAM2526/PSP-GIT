public class MedicoB extends Thread{
    private String nombre;
    private Respirador respirador;

    public MedicoB(String nombre,Respirador respirador){
        this.nombre=nombre;
        this.respirador=respirador;
    }

    @Override
    public void run(){
        while(true){
            respirador.usar();
        }
    }
}
