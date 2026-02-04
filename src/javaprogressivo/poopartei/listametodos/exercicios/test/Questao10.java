package javaprogressivo.poopartei.listametodos.exercicios.test;

/*
Crie um aplicativo de conversão entre as temperaturas Celsius e Farenheit.
Primeiro o usuário deve escolher se vai entrar com a temperatura em Célsius ou Farenheit, depois a conversão escolhida é realizada através de um comando switch.
Se C é a temperatura em Célsius e F em farenheit, as fórmulas de conversão são:
C= 5.(F-32)/9
F= (9.C/5) + 32
 */

import java.util.Scanner;

public class Questao10 {
    public static void imprimir(){
        System.out.println("[ATENÇÃO] O programa não será executado se você inserir caracteres inapropriados");
        System.out.println("C - Celsius");
        System.out.println("F - Farenheit");
        System.out.println("Opção: ");
    }

    public static double converterParaF (double c){
        return (9 * c / 5) + 32;
    }
    public static double converterParaC (double f){
        return 5 * (f - 32) / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opcao;
        double temperatura;

        imprimir();
        opcao = input.next().charAt(0);

        if(opcao != 'C' && opcao != 'F'){
            System.out.println("Você informou parâmetros inesperados. O programa não será executado.");
        } else {
            System.out.printf("Informe a temperatura em °%c a ser convertida:\n", opcao);
            temperatura = input.nextDouble();

            if (opcao == 'C'){
                System.out.printf("%.2f°C corresponde a %.2f°F", temperatura, converterParaF(temperatura));
            } else {
                System.out.printf("%.2f°F corresponde a %.2f°C", temperatura, converterParaC(temperatura));
            }
        }
    }
}
