public class MedicoA extends Thread{
    private String nombre;
    private Respirador respirador;

    public MedicoA(String nombre,Respirador respirador){
        this.nombre=nombre;
        this.respirador=respirador;
    }

    @Override
    public void run(){
        while(true){
            respirador.liberar();
        }
    }
}
