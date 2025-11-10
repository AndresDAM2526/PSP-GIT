//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Almacen almacen=new Almacen(5);
    Productor p1=new Productor(almacen);
    Consumidor c1=new Consumidor(almacen);

    p1.start();
    c1.start();
}
