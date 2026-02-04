package javaprogressivo.poopartei.listametodos.exercicios.test;

/*
 Crie um método que receba um valor e informe se ele é positivo ou negativo através de um retorno com boolean.
Declare como: boolean isPositive(float num)
 */

import java.util.Scanner;

public class Questao00 {

    public static boolean isPositive(float num){
        return num >= 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num;

        System.out.println("Informe um número: ");
        num = input.nextFloat();

        if(isPositive(num)){
            System.out.printf("O número %.2f é positivo ou nulo!", num);
        } else {
            System.out.printf("O número %.2f é negativo!", num);
        }
    }
}
