package javaprogressivo.poopartei.listametodos.exercicios.test;
// Crie um método que receba 2 números e retorne o maior valor.

import java.util.Scanner;

public class Questao04 {

    public static double maiorNumero(double a, double b){
        if (a > b){
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
            System.out.println("Maior número: " + maiorNumero(num1, num2));
        } else {
            System.out.println("Não há maior número. Os números são iguais.");
        }
    }
}
