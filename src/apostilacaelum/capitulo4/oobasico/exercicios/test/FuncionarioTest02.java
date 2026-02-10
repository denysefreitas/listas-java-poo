package apostilacaelum.capitulo4.oobasico.exercicios.test;
// Questão 4

import apostilacaelum.capitulo4.oobasico.exercicios.domain.Funcionario;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Denyse", 2500, "1107");
        Funcionario funcionario02 = new Funcionario("Denyse", 2500, "1107");

        if(funcionario01.equals(funcionario02)){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
