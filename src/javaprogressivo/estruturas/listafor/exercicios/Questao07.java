package javaprogressivo.estruturas.listafor.exercicios;

/* Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Para lado igual a 5:
*****
*****
*****
*****
*****
 */

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado (1 a 20):");
        int lado = input.nextInt();

        if(lado < 1 || lado > 20){
            System.out.println("Você informou um valor fora do limite informado. O programa não será executado.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
