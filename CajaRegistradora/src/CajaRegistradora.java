public class CajaRegistradora {

    public synchronized void pagar(String nombreCliente, int cantidad) {
        System.out.println(nombreCliente + " va a pagar " + cantidad);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombreCliente + " ha pagado");
    }
}
