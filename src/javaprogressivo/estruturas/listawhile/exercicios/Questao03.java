package javaprogressivo.estruturas.listawhile.exercicios;
/*
Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_inicial = 1;
        int num_atual = num_inicial;
        int limite = 3;

        System.out.println("Informe um número inteiro (diferente de 1): ");
        int num_max = input.nextInt();
        input.close();

        if(num_max == num_inicial){
            System.out.println("Você informou o número 1, portanto, o programa não vai executar");
        } else {
            int num_divisor = 2;
            while(num_divisor <= limite){
                System.out.printf("\nLista de números divisíveis por %d de %d até %d:\n", num_divisor, num_inicial, num_max);

                while (num_atual <= num_max){
                    if(num_atual % num_divisor == 0){
                        System.out.printf("%d ", num_atual);
                    }
                    num_atual++;
                }

                System.out.print("\n");
                num_atual = num_inicial;
                num_divisor++;
            }
        }


    }
}
