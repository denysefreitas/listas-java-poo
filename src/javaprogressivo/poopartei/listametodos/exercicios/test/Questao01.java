package javaprogressivo.poopartei.listametodos.exercicios.test;

/*
Crie um método que receba um valor e diga se é nulo ou não.
Declare como: boolean isZero(float num)
 */

import java.util.Scanner;

public class Questao01 {

    public static boolean isZero(float num){
        return num == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num;

        System.out.println("Informe um número: ");
        num = input.nextFloat();

        if(isZero(num)){
            System.out.printf("O número %.2f é nulo!", num);
        } else {
            System.out.printf("O número %.2f não é nulo!", num);
        }
    }
}
