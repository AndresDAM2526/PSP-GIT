//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SistemaRiego s1 = new SistemaRiego("Zona-z1", 3);
    Thread z1 = new Thread(s1);
    SistemaRiego s2 = new SistemaRiego("Zona-z2", 4);
    Thread z2 = new Thread(s2);
    SistemaRiego s3 = new SistemaRiego("Zona-z3", 2);
    Thread z3 = new Thread(s3);
    s3.setDependencia(z2);

    z1.start();
    z2.start();
    z3.start();

}
