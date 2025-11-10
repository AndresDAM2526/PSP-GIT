public class Cafetera {
    private int agua;
    private final int MAX_AGUA = 40;
    private boolean vacia=false;

    public Cafetera() {
        this.agua = MAX_AGUA;
    }

    public synchronized void servirCafe(String empleado) {
        while (vacia) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se sirve un cafe a " + empleado);
        this.agua -= 10;
        System.out.println("Agua restante " + this.agua);
        if(this.agua==0){
            vacia=true;
        }
        notifyAll();
    }

    public synchronized void llenarAgua() {
        while (!vacia) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se procede a llenar el agua de la cafetera");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.agua=MAX_AGUA;
        vacia=false;
        System.out.println("Agua llena");
        notifyAll();

    }
}
