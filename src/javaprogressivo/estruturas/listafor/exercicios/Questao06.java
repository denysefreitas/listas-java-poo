package javaprogressivo.estruturas.listafor.exercicios;
/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre os dois maiores números digitados pelo usuário.
 */


import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qnt_num = 10, num, primeiro_maior = 0, segundo_maior = -999999;

        for (int i = 0; i < qnt_num; i++) {
            System.out.println("Informe um número: ");
            num = input.nextInt();

            if(i == 0){
                primeiro_maior = num;
            }

            if(num > primeiro_maior){
                segundo_maior = primeiro_maior;
                primeiro_maior = num;
            } else {
                if(num > segundo_maior){
                    segundo_maior = num;
                }
            }
        }

        System.out.printf("Primeiro maior número: %d\nSegundo maior número: %d", primeiro_maior, segundo_maior);
    }
}
