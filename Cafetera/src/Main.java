//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cafetera cafe=new Cafetera(50);
    Persona p1=new Persona(cafe);
    Encargado e=new Encargado(cafe);

    p1.start();
    e.start();
}
