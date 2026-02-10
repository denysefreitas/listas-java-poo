package apostilacaelum.capitulo4.oobasico.fixando.programa03.test;

import apostilacaelum.capitulo4.oobasico.fixando.programa03.domain.Casa;
import apostilacaelum.capitulo4.oobasico.fixando.programa03.domain.Porta;

public class CasaTest01 {
    public static void main(String[] args) {
        Porta porta1 = new Porta("Amarelo", 2.5, 4.3, 3.1);
        Porta porta2 = new Porta("Azul", 2, 2.3, 3.8);
        Porta porta3 = new Porta("Branco", 1.5, 2.9, 3.6);
        Casa casa = new Casa(porta1, porta2, porta3);

        System.out.printf("Há %d portas abertas na casa%n", casa.quantasPortasEstaoAbertas());

        porta1.abre();
        System.out.printf("Há %d portas abertas na casa%n", casa.quantasPortasEstaoAbertas());

        porta1.fecha();
        porta2.abre();
        porta3.abre();
        System.out.printf("Há %d portas abertas na casa%n", casa.quantasPortasEstaoAbertas());
    }
}
