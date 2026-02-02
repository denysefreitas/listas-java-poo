package javaprogressivo.estruturas.listalacos.exercicios;
/*
Escreva um programa em Java que recebe 'n' números do usuário, e recebe o número 'n' também, e determine qual destes números é o menor.
 */

import java.util.Scanner;

public class Questao00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num, menor;

        System.out.println("Informe uma quantidade de números: ");
        n = input.nextInt();

        if(n <= 0){
            System.out.println("Você informou uma quantidade negativa ou zero. O programa não será executado.");
        } else {
            System.out.printf("Agora, você deve escolher os números da sua sequência de %d números.\nInforme um número (1/%d): ", n, n);
            num = input.nextInt();
            menor = num;

            for (int i = 1; i < n; i++) {
                System.out.printf("Informe um novo número (%d/%d): ", i + 1, n);
                num = input.nextInt();

                if(num < menor){
                    menor = num;
                }
            }

            input.close();
            System.out.println("Menor número da sequência: " + menor);
        }
    }
}
