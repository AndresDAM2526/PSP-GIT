public class Productor extends Thread{
    public int producido=1;
    private Contenedor contenedor;

    public Productor(Contenedor contenedor){
        this.contenedor=contenedor;
    }
    public void run(){
        while(true){

            contenedor.producir(producido);
            System.out.println("El productor ha añadido "+producido);
            producido++;
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}