public class Jurado extends Thread{
    private Thread artista;

    public Jurado(Thread artista){
        this.artista=artista;
    }

    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(artista.isAlive()){
            artista.interrupt();
        }else {
            System.out.println("Buen trabajo, el concurso ha finalizado");
        }
    }
}
