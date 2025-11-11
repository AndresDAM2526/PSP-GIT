public class SistemaRiego extends Thread{
    private String zona;
    private int duracionRiego;

    public SistemaRiego(){
        this.zona="ZonaGeneral";
        this.duracionRiego=5;
    }
    public SistemaRiego(String zona,int duracionRiego){
        this.zona=zona;
        this.duracionRiego=duracionRiego;
    }

    public void regar(){
        System.out.println(this.zona+" ha empezado a regarse.");
        try {
            Thread.sleep(this.duracionRiego*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.zona+" ha terminado de regarse");
    }

    @Override
    public void run() {
        regar();
    }
}
