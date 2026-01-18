public class Fabrica {
    static void main() {
        BrazoRobotico rN1= new BrazoRobotico("Soldadura",4);
        Thread R1= new Thread(rN1);

        BrazoRobotico rN2= new BrazoRobotico("Pintura",3);
        Thread R2=new Thread(rN2);
        BrazoRobotico rN3= new BrazoRobotico("Control calidad",2);
        Thread R3= new Thread(rN3);

        rN2.setRobot(R1);
        rN3.setRobot(R2);

        R1.start();
        R2.start();
        R3.start();





    }
}
