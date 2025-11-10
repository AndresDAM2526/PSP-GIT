//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Buzon buzon=new Buzon();
    Repartidor r1=new Repartidor("Juan",buzon,"Ropa");
    Repartidor r2=new Repartidor("Sara",buzon,"Electronica");
    Repartidor r3=new Repartidor("Luisa",buzon,"Calzado");
    Repartidor r4=new Repartidor("Marta",buzon,"Sombrero");
    Repartidor r5=new Repartidor("Angel",buzon,"Ordenador");

    r1.start();
    r2.start();
    r3.start();
    r4.start();
    r5.start();
}
