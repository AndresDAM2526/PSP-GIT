//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Semaforo semaforo=new Semaforo("ROJO");
    Peaton p1=new Peaton("Juan",semaforo);
    Peaton p2=new Peaton("Sara",semaforo);
    Peaton p3=new Peaton("Andrea",semaforo);

    p1.start();
    p2.start();
    p3.start();
}
