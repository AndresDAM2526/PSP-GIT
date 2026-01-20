public class Aparcamiento {
    public final String[] plazas;
    public static final int MAX_COCHES = 3;

    public Aparcamiento() {
        this.plazas = new String[MAX_COCHES];
    }

    public boolean hayPlazaLibres() {
        for (String plaza : plazas) {
            if (plaza == null) {
                return true;
            }
        }
        return false;
    }

    public int plazaLibre() {
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public synchronized int entrar(String matricula) {
        while (!hayPlazaLibres()) {
            try {
                wait();
                System.out.println(matricula + "está esperando");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int plazaLibre = plazaLibre();
        plazas[plazaLibre] = matricula;
        System.out.println(matricula + " ha encontrado plaza");
        return plazaLibre;
    }

    public synchronized void salir(int numPlaza) {
        String matricula = plazas[numPlaza];
        plazas[numPlaza] = null;
        System.out.println(matricula + " sale");
        notifyAll();
    }
}
