package javaprogressivo.estruturas.listafor.exercicios;
/*
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

Por fim, o programa mostra a média, aritmética, da turma.
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota = 0, soma = 0, media = 0;

        System.out.println("Informe a quantidade de alunos da sua sala: ");
        int qnt_alunos = input.nextInt();

        if(qnt_alunos <= 0){
            System.out.println("Você informou uma quantidade inválida. O programa não será executado.");
        } else {
            for (int i = 0; i < qnt_alunos; i++) {
                System.out.println("Informe a nota do aluno(a): ");
                nota = input.nextFloat();

                if(nota < 0 || nota > 10){
                    break;
                } else{
                    soma += nota;
                }
            }
            media = soma / qnt_alunos;
        }

        if (nota < 0 || nota > 10){
            System.out.println("Você informou uma nota inválida. O programa não será executado.");
        } else {
            if(qnt_alunos > 0){
                System.out.printf("A média da turma é de %.2f pontos", media);
            }
        }
    }
}
