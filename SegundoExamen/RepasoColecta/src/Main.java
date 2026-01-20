void main() {
    Colecta colecta=new Colecta();

    HiloColecta[] hilos=new HiloColecta[4];

    for (int i = 0; i < hilos.length; i++) {
        hilos[i]=new HiloColecta("Persona-"+i,colecta);
        hilos[i].start();
    }

    for (HiloColecta hilo : hilos) {
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}