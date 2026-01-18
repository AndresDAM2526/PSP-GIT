public class Repartidor extends Thread{
    private String nombre;
    private Buzon buzon;
    private String paquete;

    public Repartidor(String nombre,Buzon buzon,String paquete){
        this.nombre=nombre;
        this.buzon=buzon;
        this.paquete=paquete;
    }

    @Override
    public void run() {
        buzon.entregarPaquete(this.nombre,this.paquete);
    }
}
