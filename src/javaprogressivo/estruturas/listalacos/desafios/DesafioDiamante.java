package javaprogressivo.estruturas.listalacos.desafios;
/*
Escreva um aplicativo Java que peça um número inteiro ímpar ao usuário e desenhe um diamante no seguinte formato:

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */


import java.util.Scanner;

public class DesafioDiamante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, aux;

        System.out.println("Informe um número inteiro ímpar: ");
        num = input.nextInt();

        if(num < 0 || num % 2 == 0){
            System.out.println("Você informou dados fora dos parâmetros esperados. O programa não será executado.");
        } else {
            int meio = (num / 2);
            int limite_superior = meio;
            int limite_inferior = meio;

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (j >= limite_inferior && j <= limite_superior){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(i < meio){
                    limite_inferior--;
                    limite_superior++;
                } else{
                    limite_inferior++;
                    limite_superior--;
                }
                System.out.println();
            }
        }
    }
}