package javaprogressivo.estruturas.listawhile.exemplos;

public class ExemploProgressaoAritmetica {
    public static void main(String[] args) {
        int a1 = 1, r = 2, an = 0;
        int limite = 33;
        int i = 0;

        while(an < limite){
            an = a1 + i * r;
            System.out.printf("a%d = %d\n", i+1, an);
            i++;
        }

        System.out.printf("Fora do laço while, pois an(%d) >= limite(%d)", an, limite);
    }
}
