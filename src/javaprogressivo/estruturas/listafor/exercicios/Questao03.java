package javaprogressivo.estruturas.listafor.exercicios;
/*
Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_inicial = 1;
        int inicio_divisor = 2;
        int limite = 3;

        System.out.println("Informe um número inteiro (diferente de 1): ");
        int num_max = input.nextInt();
        input.close();

        if(num_max == num_inicial){
            System.out.println("Você informou o número 1, portanto, o programa não vai executar");
        } else {
            for (int i = inicio_divisor; i <= limite; i++) {
                System.out.printf("\nLista de números divisíveis por %d de %d até %d:\n", i, num_inicial, num_max);

                for (int j = num_inicial; j < num_max; j++) {
                    if(j % i == 0){
                        System.out.printf("%d \n", j);
                    }
                }
            }
        }
    }
}
