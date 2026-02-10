package apostilacaelum.capitulo4.oobasico.exercicios.test;

import apostilacaelum.capitulo4.oobasico.exercicios.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Denyse", "111");

        funcionario01.setSalario(2000);
        funcionario01.imprime();
    }
}
