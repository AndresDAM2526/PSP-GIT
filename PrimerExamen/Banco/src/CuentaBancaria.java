public class CuentaBancaria {
    public  int saldo;

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void retirarDinero(String nombreCliente, int cantidad){
            System.out.println(nombreCliente+ " intenta retirar: "+cantidad);
            if(cantidad>saldo){
                System.out.println("Fondos insuficientes");
            }else {
                saldo-=cantidad;
                System.out.println(nombreCliente+" ha retirado "+cantidad+". Saldo restantes: "+saldo);
            }
    }
}
