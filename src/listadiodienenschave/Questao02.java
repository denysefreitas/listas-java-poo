package listadiodienenschave;

// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;

        System.out.println("Informe um número: ");
        n = input.nextDouble();

        if(n % 2 == 0){
            System.out.printf("O número %.2f é par e ", n);
        } else {
            System.out.printf("O número %.2f é ímpar e ", n);
        }

        if(n < 0){
            System.out.println("negativo");
        } else {
            System.out.println("positivo ou nulo");
        }
    }
}
