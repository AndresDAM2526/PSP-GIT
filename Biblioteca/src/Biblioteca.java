public class Biblioteca {
    private boolean libroDisponible = false;

    public synchronized void tomarLibro() {
        while (!libroDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("se presta el libro");
        libroDisponible = false;
        notifyAll();
    }

    public synchronized void devolverLibro() {
        while (libroDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se devuelve el libro");
        libroDisponible = true;
        notifyAll();
    }
}
