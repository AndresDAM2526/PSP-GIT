public class Urgencias {
    public static void main(String[] args){
        Respirador res=new Respirador();
        MedicoA m1=new MedicoA("Pedro",res);
        MedicoB m2= new MedicoB("Sara",res);

        m1.start();
        m2.start();
    }
}
