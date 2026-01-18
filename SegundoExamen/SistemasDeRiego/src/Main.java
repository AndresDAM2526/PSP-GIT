//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        SistemaRiego z1= new SistemaRiego("Zona-z1",3);
        SistemaRiego z2= new SistemaRiego("Zona-z2",4);
        SistemaRiego z3=new SistemaRiego("Zona-z3",2);

        z1.start();
        z2.start();
        z3.start();
}
