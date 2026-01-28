package javaprogressivo.estruturas.listawhile.exercicios;
/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, e ao final
mostre qual destes números é o maior.
 */

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade_de_num = 10, num;
        int i = 0;

        System.out.printf("Informe um número (%d de %d): ", i+1, quantidade_de_num);
        num = input.nextInt();
        i++;
        int maior_num = num;
        int menor_num = num;

        while (i < quantidade_de_num){
            System.out.printf("Informe um número (%d de %d): ", i+1, quantidade_de_num);
            num = input.nextInt();
            i++;

            if(num > maior_num){
                maior_num = num;
            }
            if(num < menor_num){
                menor_num = num;
            }
        }

        System.out.printf("\nMenor número: %d \nMaior número: %d", menor_num, maior_num);
    }
}
