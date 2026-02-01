package javaprogressivo.estruturas.listafor.exemplos;

public class ExemploContarAteDez03 {
    public static void main(String[] args) {
        int num_maximo = 10;

        for (int i = 1, j = num_maximo; i <= num_maximo && j > 0; i++, j--) {
            System.out.printf("%d \t %d \n", i, j);
        }
    }
}
