package javaprogressivo.estruturadedadospartei.listaforeach.exemplos;

/*
Crie um aplicativo em Java que peça 5 números ao usuário.
Depois, mostre o resultado da soma desses números;
 */

import java.util.Scanner;

public class ExemploForeach01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double []numeros = new double[5];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº número:%n", i + 1);
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }

        System.out.printf("A soma dos números informados resultou em %.2f", soma);
    }
}
