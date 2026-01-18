public class Servidor extends Thread{
    public void run(){
        while(true){
            try {
                System.out.println("Servidor operando y procesando datos");
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println("¡ALERTA! Apagado de emergencia detectado.Guardando log de errores");
                break;
            }
        }
    }
}
