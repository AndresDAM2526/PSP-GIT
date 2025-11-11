public class Cajero {
    private int saldo = 0;


    public synchronized void depositar(int cantidad) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se introducen en el cajero " + cantidad + " euros");
        saldo+=cantidad;
        notifyAll();
    }

    public synchronized void retirar(int cantidad) {

        while (cantidad > saldo) {
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
        System.out.println("Se retiran " + cantidad + " euros. Cantidad restante:" + (saldo - cantidad));
        saldo-=cantidad;
        notifyAll();
    }
}
