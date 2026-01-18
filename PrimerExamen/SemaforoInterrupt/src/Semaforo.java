public class Semaforo {
    private String estado;

    public Semaforo(String estado){
        this.estado=estado;
    }

    public synchronized void cruzar(){
        while(!estado.equals("VERDE")){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cruzando la calle");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public synchronized void cambiar(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(this.estado.equals("ROJO")){
            this.estado="VERDE";
        }else{
            this.estado="ROJO";
        }
        System.out.println("Semaforo cambio a "+estado);
        notifyAll();

    }


}
