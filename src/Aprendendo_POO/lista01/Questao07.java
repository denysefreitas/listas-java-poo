package Aprendendo_POO.lista01;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, soma;
        int u, d, c;

        System.out.println("Informe um número de até 3 dígitos: ");
        a = input.nextInt();
        input.close();

        c = a / 100;
        d = (a - c * 100) / 10;
        u = a - (c * 100) - (d * 10);
        soma = c + d + u;

        System.out.println("A soma dos algarismos do número " + a + " é " + soma);
    }
}
