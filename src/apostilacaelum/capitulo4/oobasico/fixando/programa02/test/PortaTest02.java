package apostilacaelum.capitulo4.oobasico.fixando.programa02.test;

import apostilacaelum.capitulo4.oobasico.fixando.programa02.domain.Porta;

public class PortaTest02 {
    public static void main(String[] args) {
        Porta porta = new Porta("Preta", 2.5, 3.1, 1.5);

        porta.imprime();
        System.out.println();

        porta.pinta("Rosa");
        porta.setDimensaoX(3.2);
        porta.setDimensaoZ(2.9);

        porta.imprime();
    }
}
