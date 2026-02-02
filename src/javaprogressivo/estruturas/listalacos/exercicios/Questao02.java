package javaprogressivo.estruturas.listalacos.exercicios;

/*
Faça um programa em Java que recebe um inteiro do usuário e calcula seu fatorial.
O fatorial de 'n' é dado por:
n*(n-1)*(n-2)...*3*2*1
e é representado por n!
 */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long fatorial = 1;

        System.out.println("Informe o número natural para que seja calculado o seu fatorial: ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("Você informou uma quantidade negativa ou zero. O programa não será executado.");
        } else{
            for (int i = 0; i < n; i++) {
                fatorial *= (n - i);
            }
            System.out.printf("%d! = %d", n, fatorial);
        }
    }
}
