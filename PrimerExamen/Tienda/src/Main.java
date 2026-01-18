//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Buffer buffer=new Buffer();
    Consumidor c1=new Consumidor(buffer);
    Productor p1=new Productor(buffer);

    c1.start();
    p1.start();
}
