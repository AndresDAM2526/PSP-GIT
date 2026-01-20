public class TunelDeLavado {
    private boolean ocupado;
    private int contador;

    public synchronized void entrar(String nombre){
        while(ocupado){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        ocupado=true;
        System.out.println("Coche "+nombre+" entrando al túnel");
        notifyAll();
    }

    public synchronized void salir(String nombre){
        ocupado=false;
        contador++;
        System.out.println("Coche "+nombre+" saliendo. Total hoy "+contador);
        notifyAll();
    }
}
