package javaprogressivo.pooparteii.listathis.exemplos.test;

import javaprogressivo.pooparteii.listathis.exemplos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario00  = new Funcionario();
        Funcionario funcionario01 = new Funcionario("Denyse", 111, 2000);

        funcionario01.exibir();
    }
}
