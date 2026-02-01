package javaprogressivo.estruturas.listafor.exercicios;

/*
0. Programa em Java dos patinhos da Xuxa
Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

n patinhos foram passear
Além das montanhas
Para brincar
A mamãe gritou: Quá, quá, quá, quá
Mas só n-1 patinhos voltaram de lá.


Que se repete até nenhum patinho voltar de lá.
Ao final, todos os patinhos voltam:

A mamãe patinha foi procurar
Além das montanhas
Na beira do mar
A mamãe gritou: Quá, quá, quá, quá
E os n patinhos voltaram de lá.

Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
 */

import java.util.Scanner;

public class Questao00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int num_patinhos_total = input.nextInt();
        input.close();

        if(num_patinhos_total <= 0){
            System.out.println("Você informou um número negativo ou zero. O programa não será executado.");
        } else {
            for (int i = num_patinhos_total; i > 0; i--) {
                System.out.printf("%d patinhos foram passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, quá\n" +
                        "Mas só %d patinhos voltaram de lá.\n\n", i, i-1);
            }

            System.out.printf("A mamãe patinha foi procurar\n" +
                    "Além das montanhas\n" +
                    "Na beira do mar\n" +
                    "A mamãe gritou: Quá, quá, quá, quá\n" +
                    "E os %d patinhos voltaram de lá.", num_patinhos_total);
        }
    }
}
