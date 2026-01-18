public class Oficina {
    static void main() {
        Impresora impresora=new Impresora();
        EmpleadoRecogida e1=new EmpleadoRecogida(impresora);
        EmpleadoEnvio e2= new EmpleadoEnvio(impresora);
        e1.start();
        e2.start();
    }
}
