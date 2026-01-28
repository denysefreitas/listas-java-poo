package javaprogressivo.base.listaoperacoes.exemplos;
// 1. Crie um programa que recebe suas três notas (colégio, faculdade) e calcule a média final.

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;
        int quantidade_notas = 3;

        System.out.println("Informe sua primeira nota: ");
        n1 = input.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        n2 = input.nextDouble();

        System.out.println("Informe sua terceira nota: ");
        n3 = input.nextDouble();
        input.close();

        System.out.printf("A média das suas notas é %.2f", (n1+n2+n3)/3);
    }
}
