package javaprogressivo.pooparteii.listacomposicao.exemplos.test;

import javaprogressivo.pooparteii.listacomposicao.exemplos.domain.Funcionario;
import javaprogressivo.pooparteii.listacomposicao.exemplos.domain.Hora;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Hora horaChegada = new Hora(8, 3, 1);
        Hora horaSaida = new Hora(10, 34, 2);
        Funcionario funcionario01 = new Funcionario("Denyse", horaChegada, horaSaida);

        System.out.printf("DADOS DO FUNCIONÁRIO(A) %s\n---------------------\n", funcionario01.getNome());
        System.out.println("Hora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.2f", funcionario01.getTempoTrabalhado());
    }
}
