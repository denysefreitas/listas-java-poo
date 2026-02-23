package listadiodienenschave;

// Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, quociente, resto;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();

        quociente = a / b;
        resto = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
