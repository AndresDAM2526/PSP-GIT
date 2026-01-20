public class Escenario {
    private int actuacionesRealizadas=0;

    public synchronized void actuar(String nombre){
        System.out.println("Artista "+nombre+" empieza su show");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Me han echado del escenario");
        }
        actuacionesRealizadas++;
        System.out.println("Show de "+nombre+" terminado. Llevamos "+actuacionesRealizadas);
    }
}
