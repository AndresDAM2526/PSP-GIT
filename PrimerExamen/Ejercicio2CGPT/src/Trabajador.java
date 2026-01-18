public class Trabajador extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Trabajando...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("He sido interrumpido");
        }

    }
}
