//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Almacen almacen = new Almacen();
    PlantaProduccion planta = new PlantaProduccion(almacen);
    Hospital hospital = new Hospital(almacen);

    planta.start();
    hospital.start();

    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    planta.interrupt();
   hospital.activarEmergencia();
}
