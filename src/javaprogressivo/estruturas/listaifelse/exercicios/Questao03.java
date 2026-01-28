package javaprogressivo.estruturas.listaifelse.exercicios;
/*
Crie um programa, em Java, que receba os coeficientes de uma equação do 2o grau e retorne suas raízes.

Um equação do segundo grau é uma equação onde:
ax² + bx + c = 0 , com 'a' diferente de 0
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double delta, r1, r2;

        System.out.println("Informe o valor do coeficiente 'a': ");
        double a = input.nextFloat();

        if (a == 0) {
            System.out.println("Você informou um valor matematicamente impossível. O programa não será executado.");
        } else {
            System.out.println("Informe o valor do coeficiente 'b': ");
            double b = input.nextFloat();

            System.out.println("Informe o valor do coeficiente 'c': ");
            double c = input.nextFloat();

            delta = (b * b) - 4 * a * c;

            if(delta >= 0){
                r1 = (-b + Math.sqrt(delta))/(2*a);
                r2 = (-b - Math.sqrt(delta))/(2*a);

                if(delta == 0){
                    System.out.printf("As duas raízes são reais, iguais entre si e de valor %.2f", r1);
                } else {
                    System.out.printf("As duas raízes são reais e iguais a %.2f e %.2f", r1, r2);
                }
            } else {
                r1 = (-b + Math.sqrt(-delta))/(2*a);
                r2 = (-b - Math.sqrt(-delta))/(2*a);

                System.out.printf("As duas raízes são complexas e iguais a %.2fi e %.2fi", r1, r2);
            }
        }
    }
}
