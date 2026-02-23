package listadiodienenschave;

// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, soma = 0;
        int qntNotas = 3;

        for (int i = 0; i < qntNotas; i++) {
            System.out.printf("Informe sua %dº nota: ", i + 1);
            nota = input.nextDouble();
            soma += nota;
        }

        System.out.printf("Média: %.2f", soma / qntNotas);
    }
}
