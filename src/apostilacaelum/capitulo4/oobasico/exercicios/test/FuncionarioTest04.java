package apostilacaelum.capitulo4.oobasico.exercicios.test;
// Questão 6

import apostilacaelum.capitulo4.oobasico.exercicios.domain.Data;
import apostilacaelum.capitulo4.oobasico.exercicios.domain.Funcionario;

public class FuncionarioTest04 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Denyse", 2500, "1107");
        Funcionario funcionario02 = new Funcionario("Denyse", 2500, "1107");
        Data dataEntrada = new Data(31, 12, 890);
        funcionario01.setDataEntrada(dataEntrada);

        funcionario01.imprime();
        funcionario02.imprime();
    }
}
