package apostilacaelum.capitulo4.oobasico.fixando.programa02.test;

import apostilacaelum.capitulo4.oobasico.fixando.programa02.domain.Porta;

public class PortaTest01 {
    public static void main(String[] args) {
        Porta porta = new Porta("Azul", 2, 3, 1.5);

        porta.imprime();
        porta.conferirPorta();
        porta.abre();
        porta.conferirPorta();
        porta.fecha();
        porta.conferirPorta();
    }
}
