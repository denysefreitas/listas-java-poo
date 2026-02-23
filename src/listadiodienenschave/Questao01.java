package listadiodienenschave;

// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();
        System.out.println("Informe outro número: ");
        c = input.nextInt();

        soma = a + b;
        System.out.printf("%d + %d = %d%n", a, b, soma);

        if((a + b) > c){
            System.out.printf("A soma de %d + %d é igual a %d. Logo, a soma é maior do que %d%n", a, b, soma, c);
        } else {
            System.out.printf("A soma de %d + %d é igual a %d. Logo, a soma é menor do que %d", a, b, soma, c);
        }
    }
}
