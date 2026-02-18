package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

/*
Faça um aplicativo Java que peça o nome do aluno, receba duas notas e depois retorne todas essas informações junto com a média dele
 */

import java.util.Scanner;

public class ExemploArray02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double []notas = new double[2];
        double soma = 0;
        String nome;

        System.out.println("Informe o nome do aluno: ");
        nome = input.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dº nota do(a) aluno(a) '%s':%n", i + 1, nome);
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        System.out.printf("A média do(a) aluno(a) '%s' foi de %.2f", nome, soma / notas.length);
    }
}
