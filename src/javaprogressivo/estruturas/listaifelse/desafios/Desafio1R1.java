package javaprogressivo.estruturas.listaifelse.desafios;
/*
Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria, e exiba tal mensagem:
A regra é a seguinte:
Nota 7 ou mais: passou direto
Entre 5 e 7: tem direito de fazer uma prova de recuperação
Abaixo de 5: reprovado direto.
 */

import java.util.Scanner;

public class Desafio1R1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma nota (entre 0 e 10): ");
        double nota = input.nextDouble();
        input.close();

        if(nota < 0 || nota > 10){
            System.out.println("Essa nota não é válida. O programa não será executado.");
        } else {
            if(nota < 5){
                System.out.println("Você foi reprovado direto");
            } else if(nota >= 7){
                System.out.println("Você passou direto");
            } else {
                System.out.println("Você tem direito de fazer uma prova de recuperação");
            }
        }
    }
}
