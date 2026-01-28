package javaprogressivo.estruturas.listawhile.exercicios;
/*
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

Por fim, o programa mostra a média, aritmética, da turma.
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        double nota = 0, soma = 0;

        System.out.println("Informe a quantidade de alunos da sala:");
        int quantidade_alunos = input.nextInt();

        if(quantidade_alunos <= 0){
            System.out.println("Você informou um número negativo ou o zero. O programa não será executado.");
        } else {
            while(i < quantidade_alunos){
                System.out.printf("Informe a nota %d (0 a 10): ", i+1);
                nota = input.nextDouble();

                if(nota < 0 || nota > 10){
                    break;
                } else {
                    soma += nota;
                    i++;
                }
            }

            if(nota < 0 || nota > 10){
                System.out.println("Você informou uma nota fora do limite informado. O programa não será executado.");
            } else {
                double media = soma/quantidade_alunos;
                System.out.printf("A média aritmética da turma é de %.2f", media);
            }
        }
    }
}
