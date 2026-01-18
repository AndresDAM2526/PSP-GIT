//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    HiloThread primerHilo=new HiloThread();
    primerHilo.run();

    HiloRunnable hiloRunnable=new HiloRunnable();
    Thread segundoHilo=new Thread(hiloRunnable);
    segundoHilo.run();
}

