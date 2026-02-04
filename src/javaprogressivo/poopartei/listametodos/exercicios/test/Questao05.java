package javaprogressivo.poopartei.listametodos.exercicios.test;

import java.util.Scanner;

public class Questao05 {
    public static double menorNumero(double a, double b){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }

    public static boolean saoIguais(double a, double b){
        return a == b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.println("Informe um número: ");
        num1 = input.nextDouble();

        System.out.println("Informe outro número: ");
        num2 = input.nextDouble();

        if(!saoIguais(num1, num2)){
            System.out.println("Menor número: " + menorNumero(num1, num2));
        } else {
            System.out.println("Não há menor número. Os números são iguais.");
        }
    }
}
