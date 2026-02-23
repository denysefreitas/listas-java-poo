package listadiodienenschave;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, n1, n2, n3;

        System.out.println("Informe um número: ");
        a = input.nextInt();

        System.out.println("Informe outro número: ");
        b = input.nextInt();

        System.out.println("Informe outro número: ");
        c = input.nextInt();

        n1 = Math.max(a, b);
        n2 = Math.min(a, b);

        if(c > n1){
            n3 = n2;
            n2 = n1;
            n1 = c;
        } else {
            if(c > n2){
                n3 = n2;
                n2 = c;
            } else {
                n3 = c;
            }
        }

        System.out.println("Números em ordem decrescente: " + n1 + "\t" + n2 + "\t" + n3);
    }
}
