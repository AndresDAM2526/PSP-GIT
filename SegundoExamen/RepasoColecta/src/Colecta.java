public class Colecta {
    private int cantidadAcumulada;
    private final int MAXIMO_DINERO = 2000;

    public synchronized boolean anadir(int cantidadAportada) {
        int restante = MAXIMO_DINERO - this.cantidadAcumulada;

        if (restante <= 0) {
            return false;
        }

        if (cantidadAportada > restante) {
            System.out.println("Se intento aportar " + cantidadAportada + " pero solo quedan " + restante);
            return true;
        }

        this.cantidadAcumulada += cantidadAportada;
        System.out.println("Se aportaron " + cantidadAportada+" faltan "+restante);
        return this.cantidadAcumulada < MAXIMO_DINERO;
    }
}