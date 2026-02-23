package listadiodienenschave;

// Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, aux;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();

        System.out.printf("A = %d\tB = %d%n", a, b);
        System.out.println("Invertendo os números...");

        aux = a;
        a = b;
        b = aux;

        System.out.printf("A = %d\tB = %d%n", a, b);
    }
}
