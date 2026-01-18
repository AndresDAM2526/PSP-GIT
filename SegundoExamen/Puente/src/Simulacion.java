public class Simulacion {
    static void main() {
        Puente puente = new Puente();
        for (int i = 0; i < 5; i++) {
            new Thread(new Coche("Seat" + i, puente)).start();
        }
    }
}
