//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Impresora im=new Impresora();
    Usuario us1= new Usuario("Juan",im);
    Usuario us2= new Usuario("Sara",im);
    Usuario us3= new Usuario("Andrea",im);

    Thread h1=new Thread(us1);
    Thread h2=new Thread(us2);
    Thread h3=new Thread(us3);

    h1.start();
    h2.start();
    h3.start();
}
