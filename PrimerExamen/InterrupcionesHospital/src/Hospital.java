public class Hospital {
    static void main() {
        Medico m1 = new Medico("Pedro");
        CoordinadorUrgencias c1 = new CoordinadorUrgencias("Sara", m1);
        m1.start();
        c1.start();
    }
}
