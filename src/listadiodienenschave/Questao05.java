package listadiodienenschave;

// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, salarioMinimo = 1293.20;

        System.out.println("Informe o seu salário: ");
        salario = input.nextDouble();

        System.out.printf("O salário de R$ %.2f corresponde a %.2f salários mínimos de R$ %.2f", salario, salario / salarioMinimo, salarioMinimo);
    }
}
