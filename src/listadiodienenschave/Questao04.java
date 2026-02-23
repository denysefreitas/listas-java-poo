package listadiodienenschave;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.println("Informe um número: ");
        a = input.nextInt();

        System.out.println("Antecessor: " + (a - 1));
        System.out.println("Sucessor: " + (a + 1));
    }
}
