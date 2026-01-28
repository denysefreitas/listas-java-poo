package javaprogressivo.estruturas.listaifelse.exercicios;
/*
Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar
Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if.
 */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.printf("O número %d é par", num);
        } else {
            System.out.printf("O número %d é ímpar", num);
        }
    }
}
