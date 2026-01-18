public class ControlRiego {
    static void main() {
        SistemaRiego sistema1=new SistemaRiego("Zona-z1",3);
        SistemaRiego sistema2=new SistemaRiego("Zona-z2",4);
        SistemaRiego sistema3=new SistemaRiego("Zona-z3",2);

        Thread z1=new Thread(sistema1);
        Thread z2=new Thread(sistema2);
        Thread z3=new Thread(sistema3);


        sistema3.setDependencia(z2);

        z1.start();
        z2.start();
        z3.start();
    }
}
