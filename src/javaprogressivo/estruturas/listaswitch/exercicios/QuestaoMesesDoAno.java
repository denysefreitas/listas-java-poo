package javaprogressivo.estruturas.listaswitch.exercicios;
/*
Crie um programa que receba um inteiro, de 1 até 12, representando os meses do ano e retorne o número de dias do mês.
Use switch e não use break. Acumule os case.
 */

import java.util.Scanner;

public class QuestaoMesesDoAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias = 0;
        boolean mesExiste = true;

        System.out.println("Informe um mês do ano (1 - 12): ");
        int mes = input.nextInt();
        input.close();

        switch (mes){
            default:
                mesExiste = false;
            case 1: case 3: case 5: case 7: case 8: case 12:
                dias += 1;
            case 4: case 6: case 9: case 11:
                dias += 2;
            case 2:
                dias += 28;
        }

        if(mesExiste){
            System.out.printf("Esse mês tem %d dias", dias);
        } else {
            System.out.println("Mês inválido");
        }
    }
}
