//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Aparcamiento aparcamiento=new Aparcamiento();
    String matricula="M";
    int i =1;
    while (true) {

        Coche c= new Coche(matricula+i++,aparcamiento);
        c.start();

    }
}
