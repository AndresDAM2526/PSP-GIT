public class Procesado implements Runnable {
    @Override
    public void run() {
        System.out.println("Se empieza el procesado");
        int progreso = 5;
        while (progreso <= 100) {
            System.out.println("Progreso procesado" + progreso);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progreso += 20;
        }
        System.out.println("Se finaliza el progreso");
    }
}
