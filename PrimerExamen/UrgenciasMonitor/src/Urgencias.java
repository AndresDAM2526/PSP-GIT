public class Urgencias {
    static void main() {
        Respirador respirador=new Respirador();
        MedicoA m1=new MedicoA(respirador);
        MedicoB m2=new MedicoB(respirador);
        m1.start();
        m2.start();
    }
}
