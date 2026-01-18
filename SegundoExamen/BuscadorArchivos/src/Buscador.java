public class Buscador extends Thread {
    private volatile boolean encontrado = false;
    private int numCarpeta = 1;

    public void run() {
        while (!encontrado) {
            System.out.println("Buscando en carpeta " + numCarpeta);
            if (numCarpeta == 10) {
                encontrado = true;
                System.out.println("Carpeta encontrada con exito");
                break;
            }
            numCarpeta++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Has tardado demasiado");
                break;
            }

        }
    }
}
