public class Empleado extends Thread{
    private String nombre;
    private Cafetera cafetera;

    public Empleado(String nombre,Cafetera cafetera){
        this.nombre=nombre;
        this.cafetera=cafetera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cafetera.servirCafe(this.nombre);
        }
    }
}
