package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

import java.util.Scanner;

public class ExemploArray01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double []notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dº nota:%n", i + 1);
            notas[i] = input.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%dº nota: %.2f%n", i + 1, notas[i]);
        }
    }
}