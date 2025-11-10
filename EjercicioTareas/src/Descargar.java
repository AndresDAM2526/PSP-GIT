public class Descargar extends Thread {
    @Override
    public void run() {
        System.out.println("Se empieza a descargar el fichero");
        int progreso = 5;
        while (progreso <= 100) {
            System.out.println("Progreso descarga " + progreso);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progreso += 20;
        }
        System.out.println("Se finaliza la descarga");
    }
}
