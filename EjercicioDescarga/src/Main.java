//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Descarga f1= new Descarga("Archivo1.mp4",100);
    Descarga f2=new Descarga("Foto.png",100);
    Thread hilo1=new Thread(f1);
    Thread hilo2=new Thread(f2);

    hilo1.start();
    hilo2.start();
}
