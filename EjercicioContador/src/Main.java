//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Contador con=new Contador();
    Incrementar i=new Incrementar(con);
    Decrementar d=new Decrementar(con);

    i.start();
    d.start();
}
