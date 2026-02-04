package javaprogressivo.poopartei.listametodos.exemplos.test;

import java.util.Scanner;

public class Quadrado {

    public static int elevarAoQuadrado(int a){
        return a * a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = input.nextInt();

        int quadrado = elevarAoQuadrado(num);

        System.out.printf("%d elevado ao quadrado é %d", num, quadrado);
    }
}
