package javaprogressivo.estruturas.listafor.exercicios;

/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre qual destes números é o maior.
 */

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qnt_num = 10, num, maior = 0;

        for (int i = 0; i < qnt_num; i++) {
            System.out.println("Informe um número: ");
            num = input.nextInt();

            if(i == 0){
                maior = num;
            }

            if(num > maior){
                maior = num;
            }
        }

        System.out.printf("Maior número: %d", maior);
    }
}
