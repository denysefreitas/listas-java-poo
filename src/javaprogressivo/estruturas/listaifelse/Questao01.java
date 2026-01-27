package javaprogressivo.estruturas.listaifelse;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior, menor;

        System.out.println("Informe um número inteiro: ");
        int a = input.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int b = input.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int c = input.nextInt();

        if(a > b){
            // a, b, c
            // c, a, b
            // a, c, b
            if(a > c){
                // a, b, c
                // a, c, b
                maior = a;
                if(b > c){
                    // a, b, c
                    menor = c;
                } else {
                    // a, c, b
                    menor = b;
                }
            } else {
                // c, a, b
                maior = c;
                menor = b;
            }
        } else {
            // b, c, a
            // b, a, c
            // c, b, a
            if(b > c){
                // b, c, a
                // b, a, c
                maior = b;
                if(a > c){
                    // b, a, c
                    menor = c;
                } else {
                    // b, c, a
                    menor = a;
                }
            } else {
                // c, b, a
                maior = c;
                menor = a;
            }
        }

        System.out.printf("Maior: %d \nMenor: %d", maior, menor);
    }
}
