package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

/*
Crie um aplicativo em Java que peça ao usuário para preencher uma matriz 3x3 com valores inteiros e depois exiba essa matriz.
 */

import java.util.Scanner;

public class ExemploArrayMultidimensional01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("Informe um número a ser adicionado como elemento da matriz em [%d][%d]:%n", i + 1, j + 1);
                numeros[i][j] = input.nextInt();
            }
        }

        for (int[] numero : numeros) {
            for (int i : numero) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
