//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Supermercado supermercado=new Supermercado();
    Cliente cR1= new Cliente(supermercado);
    Thread C1=new Thread(cR1);
    Cajera Cj1=new Cajera(supermercado);
    Thread C2=new Thread(Cj1);

    C1.start();
    C2.start();
}
