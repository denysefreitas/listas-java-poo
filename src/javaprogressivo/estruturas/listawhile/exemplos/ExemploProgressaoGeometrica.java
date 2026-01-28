package javaprogressivo.estruturas.listawhile.exemplos;

public class ExemploProgressaoGeometrica {
    public static void main(String[] args) {
        int a1 = 2, q = 2;
        int limite = 64;
        int i = 0;
        int an = a1;

        while(an <= limite){
            System.out.printf("a%d = %d\n", i+1, an);
            an *= q;
            i++;
        }

        System.out.printf("Fora do laço while, pois an(%d) > limite(%d)", an, limite);
    }
}
