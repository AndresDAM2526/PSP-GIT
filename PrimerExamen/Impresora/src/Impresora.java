public class Impresora {
    public synchronized void imprimirDocumento(String nombreUsuario,String documento){
        System.out.println("Se empieza a imprimir el documento de "+nombreUsuario);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Se termina la impresión de "+nombreUsuario);
    }
}
