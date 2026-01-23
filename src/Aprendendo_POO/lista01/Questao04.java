package Aprendendo_POO.lista01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, fatorial = 1;

        System.out.println("Informe um número:");
        a = input.nextInt();
        input.close();

        for (int i = a; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial do número " + a + " é " + fatorial);
    }
}
