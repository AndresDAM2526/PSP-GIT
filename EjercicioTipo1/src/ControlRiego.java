public class ControlRiego {
    static void main() {
        SistemaRiego r1=new SistemaRiego("Jardin",3);
        SistemaRiego r2=new SistemaRiego("Piscina",5);

        r1.start();
        r2.start();
    }
}
