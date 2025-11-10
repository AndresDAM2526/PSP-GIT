public class Semaforo {
    public synchronized void cruzar(String nombre) {
        System.out.println(nombre + "puede cruzar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + "ha cruzado");
    }
}
