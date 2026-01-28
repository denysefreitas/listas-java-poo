package javaprogressivo.estruturas.listawhile.exercicios;

import java.util.Scanner;

/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, e ao final
mostre os dois maiores números digitados pelo usuário.
 */
public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade_de_num = 10, num;
        int i = 0;

        System.out.printf("Informe um número (%d de %d): ", i+1, quantidade_de_num);
        num = input.nextInt();
        i++;
        int primeiro_maior = num;
        int segundo_maior = num;

        while (i < quantidade_de_num){
            System.out.printf("Informe um número (%d de %d): ", i+1, quantidade_de_num);
            num = input.nextInt();
            i++;

            if(num > primeiro_maior){
                segundo_maior = primeiro_maior;
                primeiro_maior = num;
            } else {
                if(num > segundo_maior){
                    segundo_maior = num;
                }
            }

        }

        System.out.printf("\nPrimeiro maior número: %d \nSegundo maior número: %d", primeiro_maior, segundo_maior);
    }
}
