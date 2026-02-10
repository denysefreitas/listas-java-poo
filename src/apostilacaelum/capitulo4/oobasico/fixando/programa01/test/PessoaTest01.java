package apostilacaelum.capitulo4.oobasico.fixando.programa01.test;

import apostilacaelum.capitulo4.oobasico.fixando.programa01.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Denyse", 20);

        pessoa1.imprime();
        System.out.println("Ano seguinte!");
        pessoa1.fazAniversario();
        pessoa1.imprime();
    }
}
