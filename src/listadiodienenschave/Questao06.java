package listadiodienenschave;

// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, taxa = 5;

        System.out.println("Informe um número: ");
        num = input.nextDouble();

        System.out.println(num * ((taxa / 100) + 1));
    }
}
