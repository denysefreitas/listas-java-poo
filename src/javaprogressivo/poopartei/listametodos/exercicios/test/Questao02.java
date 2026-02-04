package javaprogressivo.poopartei.listametodos.exercicios.test;
/*
 Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac'
 */

import java.util.Scanner;

public class Questao02 {

    public static boolean isPossible(double a){
        return a != 0;
    }

    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("Equação do 2º grau: ax² + bx + c=0");
        System.out.println("Informe o valor do coeficiente 'a': ");
        a = input.nextDouble();

        if (isPossible(a)) {
            System.out.println("Informe o valor do coeficiente 'b': ");
            b = input.nextDouble();

            System.out.println("Informe o valor do coeficiente 'c': ");
            c = input.nextDouble();

            System.out.println("Delta: " + calcularDelta(a, b, c));
        } else {
            System.out.println("Você informou um parâmetro inesperado. O programa não será executado.");
        }
    }
}
