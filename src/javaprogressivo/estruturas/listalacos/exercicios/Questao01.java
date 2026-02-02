package javaprogressivo.estruturas.listalacos.exercicios;

/*
Escreva um programa em Java que recebe um inteiro 'n' do usuário e calcula o produto dos números pares e o produtos dos números ímpares, de 1 até n
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, produto_pares = 1, produto_impares = 1;

        System.out.println("Informe a quantidade de números: ");
        n = input.nextInt();

        if(n <= 0){
            System.out.println("Você informou uma quantidade negativa ou zero. O programa não será executado.");
        } else {
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 0){
                    produto_pares *= i;
                }
                if(i % 3 == 0){
                    produto_impares *= i;
                }
            }

            System.out.println("Produto dos números pares: " + produto_pares);
            System.out.println("Produto dos números ímpares: " + produto_impares);
        }
    }
}
