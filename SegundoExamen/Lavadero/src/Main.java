//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TunelDeLavado tunel=new TunelDeLavado();
    Coche c1=new Coche("Coche 1",tunel);
    Thread coche1= new Thread(c1);
    Coche c2=new Coche("Coche 2",tunel);
    Thread coche2= new Thread(c2);
    Coche c3=new Coche("Coche 3",tunel);
    Thread coche3= new Thread(c3);

    coche1.start();
    coche2.start();
    coche3.start();
    Encargado encargado= new Encargado(coche3);
    encargado.start();
}
