public class ControlRiego {
    static void main() {
        SistemaRiego s1=new SistemaRiego("Zona-z1",4);
        SistemaRiego s2=new SistemaRiego("Zona-z2",5);

        s1.start();
        s2.start();
    }
}
