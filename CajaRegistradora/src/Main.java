//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CajaRegistradora cajaRegistradora=new CajaRegistradora();
    new Thread(new Cliente("Juan",cajaRegistradora)).start();
    new Thread(new Cliente("Andrea",cajaRegistradora)).start();
    new Thread(new Cliente("Luis",cajaRegistradora)).start();

}
