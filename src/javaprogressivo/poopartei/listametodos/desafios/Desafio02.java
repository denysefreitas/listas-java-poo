package javaprogressivo.poopartei.listametodos.desafios;

/*
Escreva um programa em Java que recebe dois inteiros e retorna o MDC, máximo divisor comum.
 */

import java.util.Scanner;

public class Desafio02 {
    public static int calcularMdc(int a, int b){
        if(b == 0){
            return a;
        }
        return calcularMdc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();

        System.out.printf("MDC (%d, %d) = %d", a, b, calcularMdc(a, b));
    }
}
