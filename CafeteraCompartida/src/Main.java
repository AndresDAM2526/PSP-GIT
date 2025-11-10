//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cafetera cafetera=new Cafetera();
    Empleado e1= new Empleado("Pedro",cafetera);
    Empleado e2= new Empleado("Andrea",cafetera);
    Empleado e3= new Empleado("Sara",cafetera);
    Empleado e4= new Empleado("Maria",cafetera);
    Empleado e5= new Empleado("Luis",cafetera);
    Empleado e6= new Empleado("Juan",cafetera);
    Empleado e7= new Empleado("Jose",cafetera);
    Encargado encargado=new Encargado(cafetera);

    e1.start();
    e2.start();
    e3.start();
    e4.start();
    e5.start();
    e6.start();
    e7.start();
    encargado.start();

}
