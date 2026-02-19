package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

/*
Crie um aplicativo em Java que peça ao usuário para preencher uma matriz 3x2 com valores inteiros e depois exiba essa matriz.
 */

import java.util.Scanner;

public class ExemploArrayEmMetodos02 {
    public static void exibeMatriz(int [][]matriz){
        System.out.println("Exibindo a matriz...");

        for (int[] vetor : matriz) {
            for (int elemento : vetor) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static void preencheMatriz(int [][]matriz){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe o elemento a ser adicionado à coordenada (%d, %d): %n", i + 1, j + 1);
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int [][]numeros = new int[3][2];
        preencheMatriz(numeros);
        exibeMatriz(numeros);
    }
}
