//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cajero caj=new Cajero();
    Usuario u1=new Usuario(caj);
    Usuario2 u2=new Usuario2(caj);

    u1.start();
    u2.start();
}
