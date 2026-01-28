package javaprogressivo.estruturas.listaifelse.exercicios;
/*
Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, comprimento e área desta.
 */

import java.util.Scanner;

public class Questao00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double comprimento, area;

        System.out.println("Informe o raio da circunferência: ");
        double r = input.nextDouble();

        if(r < 0){
            System.out.println("Valores negativos não podem ser atribuídos a comprimentos. O programa não será executado.");
        } else {
            comprimento = 2 * r * Math.PI;
            area = Math.PI * Math.pow(r, 2);

            System.out.printf("Diâmetro: %.2f", r*2);
            System.out.printf("\nComprimento: %.2f", comprimento);
            System.out.printf("\nÁrea: %.2f", area);
        }
    }
}
