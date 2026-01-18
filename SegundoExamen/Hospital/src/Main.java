//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Medico m1=new Medico("Juan");
    CoordinadorUrgencias c1=new CoordinadorUrgencias(m1);
    m1.start();
    c1.start();
}
