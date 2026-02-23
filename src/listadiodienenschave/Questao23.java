package listadiodienenschave;

// Questão 21 duplicada -> renomeada para 23
// Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorAula, percentualInss, salarioLiquido;
        int aulas;

        System.out.println("Informe o valor da aula: ");
        valorAula = input.nextDouble();
        System.out.println("Informe a quantidade de aulas lecionadas este mês: ");
        aulas = input.nextInt();
        System.out.println("Informe o percentual da contribuição ao INSS: ");
        percentualInss = input.nextDouble() / 100;

        salarioLiquido = (valorAula * aulas) * (1 - percentualInss);
        System.out.printf("O salário líquido do(a) professor(a) é de R$%.2f", salarioLiquido);
    }
}
