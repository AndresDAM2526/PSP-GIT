public class Coche extends Thread{
    private Aparcamiento aparcamiento;
    private String matricula;

    public Coche(String matricula,Aparcamiento aparcamiento){
        this.matricula=matricula;
        this.aparcamiento=aparcamiento;
    }

    public void run(){
        int miPlaza=aparcamiento.entrar(this.matricula);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        aparcamiento.salir(miPlaza);
    }
}
