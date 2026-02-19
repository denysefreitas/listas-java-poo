package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

import java.util.Arrays;

public class ExemploClasseArray01 {
    public static void main(String[] args) {
        int[] numeros = {1, 7, 0, -13, 3242, 99, 11};
        int posicao;

        System.out.println("Os elementos do array são: " + Arrays.toString(numeros));
        System.out.println("Ordenando...");

        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        posicao = Arrays.binarySearch(numeros, 1011);
        System.out.println("Posição do elemento '1011': " + posicao);
    }
}
