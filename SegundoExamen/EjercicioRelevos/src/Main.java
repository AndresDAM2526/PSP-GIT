//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Corredor c1= new Corredor("Pedro");
    Corredor c2= new Corredor("Sara");
    Corredor c3=new Corredor("Juan");

    c2.setPredecesor(c1);
    c3.setPredecesor(c2);

    c3.start();
    c2.start();
    c1.start();
}
