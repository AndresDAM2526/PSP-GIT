import java.util.Random;

public class HiloColecta extends Thread{

    private Colecta colecta;
    private String nombre;

    public HiloColecta(String nombre,Colecta colecta){
        this.nombre=nombre;
        this.colecta=colecta;
    }

    public void run(){
        while(true){
            int tiempo=new Random().nextInt(191)+10;
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int cantidadAportar=new Random().nextInt(22)+4;
            if(!colecta.anadir(cantidadAportar)){
                break;
            }
        }
        System.out.println("Se ha terminado la colecta");
    }
}