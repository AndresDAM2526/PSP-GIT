public class App {
    static void main() {
        Thread c1=new Thread(new Contador());
        Thread c2=new Thread(new Contador());
        Thread c3=new Thread(new Contador());
        Thread c4=new Thread(new Contador());

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
