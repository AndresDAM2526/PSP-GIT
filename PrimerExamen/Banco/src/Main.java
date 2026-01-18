//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaBancaria cuenta=new CuentaBancaria(100);
    Cliente c1=new Cliente("Juan",cuenta);
    Cliente c2=new Cliente("Sara",cuenta);
    Cliente c3=new Cliente("Andrea",cuenta);

    Thread cliente1=new Thread(c1);
    Thread cliente2=new Thread(c2);
    Thread cliente3=new Thread(c3);

    cliente1.start();
    cliente2.start();
    cliente3.start();
}

