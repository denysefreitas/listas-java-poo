package javaprogressivo.base.listaprint;
/*
Faça um programa que exiba na tela a tabuada do 9:
9 x 1 = 9
9 x 2 =18
...
9 x 10 = 90

Porém, você deve usar o operador %d da seguinte forma: "%d x %d = %d" (o resultado da multiplicação deve ser calculado pelo Java, usando o operador matemático de multiplicação * )
*/

public class Questao07 {
    public static void main(String[] args) {
        int num = 9;
        int lim = 10;

        System.out.printf("TABUADA DO %d", num);
        System.out.println("\n----------------------");
        for (int i = 1; i <= lim; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
