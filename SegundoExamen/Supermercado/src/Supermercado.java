public class Supermercado {
    private int productoActuales = 0;
    private final int CAPACIDAD_MAX = 3;

    public synchronized void colocarProducto() {
        while (productoActuales == CAPACIDAD_MAX) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
        productoActuales += 1;
        System.out.println("Producto colocado. Total " + productoActuales);
        notifyAll();
    }

    public synchronized void cobrarProducto() {
        while (productoActuales == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        productoActuales -= 1;
        System.out.println("Producto cobrado. Total " + productoActuales);
        notifyAll();
    }
}
