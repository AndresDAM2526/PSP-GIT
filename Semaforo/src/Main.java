
void main() {
    Semaforo semaforo=new Semaforo();
    Peaton p1=new Peaton("Juan",semaforo);
    Peaton p2=new Peaton("Sara",semaforo);
    Peaton p3=new Peaton("Luis",semaforo);
    Peaton p4=new Peaton("Pedro",semaforo);
    Peaton p5=new Peaton("Marta",semaforo);
    Peaton p6=new Peaton("Carla",semaforo);

    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    p6.start();

}
