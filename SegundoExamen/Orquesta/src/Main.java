//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Musico ms1=new Musico("Flauta",1);
    Musico ms2=new Musico("Piano",3);
    Musico ms3=new Musico("Violín",2);
    Director dir=new Director();

    Thread dirT=new Thread(dir);
    Thread flauta=new Thread(ms1);
    Thread piano= new Thread(ms2);
    Thread violin= new Thread(ms3);

    ms1.setCompanero(piano);
    ms2.setCompanero(violin);
    dir.setCompanero(flauta);

    violin.start();
    piano.start();
    flauta.start();
    dirT.start();

}
