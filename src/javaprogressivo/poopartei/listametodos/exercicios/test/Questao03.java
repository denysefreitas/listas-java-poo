package javaprogressivo.poopartei.listametodos.exercicios.test;

/*
Usando os 3 métodos acima, crie um aplicativo que calcula as raízes de uma equação do 2o grau:
ax² + bx + c=0
Para ela existir, o coeficiente 'a' deve ser diferente de zero.
Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas
e da forma: x + iy
 */

import java.util.Scanner;

public class Questao03 {
    public static boolean isPossible(double a){
        return a != 0;
    }

    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static void calcularRaizes(double a, double b, double c){
        double delta = calcularDelta(a, b, c);
        double r1, r2;

        if(delta < 0){
            r1 = (-b + Math.sqrt(-delta)) / (4*a);
            r2 = (-b - Math.sqrt(-delta)) / (4*a);
            System.out.printf("As duas raízes são complexas e iguais a %.2fi e %.2fi", r1, r2);
        } else {
            r1 = (-b + Math.sqrt(delta))/(2*a);
            r2 = (-b - Math.sqrt(delta))/(2*a);

            if(delta == 0){
                System.out.printf("As duas raízes são reais, iguais entre si e de valor %.2f", r1);
            } else {
                System.out.printf("As duas raízes são reais e iguais a %.2f e %.2f", r1, r2);
            }
        }
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

            calcularRaizes(a, b, c);
        } else {
            System.out.println("Você informou um parâmetro inesperado. O programa não será executado.");
        }
    }
}
