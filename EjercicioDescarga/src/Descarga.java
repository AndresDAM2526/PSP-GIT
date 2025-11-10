import java.util.Random;

public class Descarga implements Runnable{

    private String nombreFichero;
    private int tamanio;

    public Descarga(String nombreFichero, int tamanio){
        this.nombreFichero=nombreFichero;
        this.tamanio=tamanio;
    }
    @Override
    public void run() {
        Random numRandom=new Random();
        int descargado=0;
        System.out.println("Se empieza a descargar el fichero "+this.nombreFichero);
        while (descargado<tamanio){
            descargado+=10;
            System.out.println(this.nombreFichero+" descarga-> "+descargado);
            try {
                Thread.sleep(numRandom.nextInt(10)*1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.nombreFichero+" ha terminado de descargarse.");
    }
}
