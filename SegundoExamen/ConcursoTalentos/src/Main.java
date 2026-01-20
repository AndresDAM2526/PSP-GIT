//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Escenario escenario=new Escenario();
    Artista a1=new Artista("Mago Pepe",escenario);
    Thread MagoPepe= new Thread(a1);
    Jurado jurado= new Jurado(MagoPepe);

    MagoPepe.start();
    jurado.start();
}
