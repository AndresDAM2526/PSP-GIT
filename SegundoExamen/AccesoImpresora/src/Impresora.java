public class Impresora{
    private volatile boolean ejecutandoImprimir=false;
    private boolean papelEnBandeja=false;

    public synchronized void imprimir(){
        while(papelEnBandeja){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        papelEnBandeja=true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Documento [doc] impreso en la bandeja");
        notifyAll();
    }

    public synchronized void recoger(){
        while (!papelEnBandeja){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        papelEnBandeja=false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Documento recogido por el usuario");
        notifyAll();

    }
}
