
void main() {
    Descargar descargar=new Descargar();
    Procesado procesadoRunnable= new Procesado();
    Thread procesado=new Thread(procesadoRunnable);
    Notificacion notificacion=new Notificacion();
    descargar.start();
    procesado.start();
    notificacion.start();
}
