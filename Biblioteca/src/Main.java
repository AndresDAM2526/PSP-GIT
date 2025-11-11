//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Biblioteca b=new Biblioteca();
    Lector1 l1=new Lector1(b);
    Lector2 l2=new Lector2(b);

    l1.start();
    l2.start();
}
