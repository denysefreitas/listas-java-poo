package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

import java.util.Scanner;

public class ExemploArrayEmMetodos01 {
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
        int [][]numeros = new int[3][3];
        preencheMatriz(numeros);
        exibeMatriz(numeros);
    }
}
