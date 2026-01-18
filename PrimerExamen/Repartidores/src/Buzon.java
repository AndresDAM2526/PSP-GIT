public class Buzon {
    public synchronized void entregarPaquete(String nombreRepartidor, String paquete) {
        System.out.println(nombreRepartidor + " esta en el buzón");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombreRepartidor + " ha dejado " + paquete + " en el buzón");
    }
}
