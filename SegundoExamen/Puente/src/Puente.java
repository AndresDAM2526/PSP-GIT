public class Puente {
    private boolean ocupado=false;

    public synchronized void entrar(String coche){
        while(ocupado){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        ocupado=true;
        System.out.println("Coche "+ coche+" entrando al puente");
        notifyAll();
    }

    public synchronized void salir(String coche){
        ocupado=false;
        System.out.println("Coche "+coche+" saliendo del puente");
        notifyAll();
    }

}
