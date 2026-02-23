package listadiodienenschave;

// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        char operacao;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();

        if(a == b){
            operacao = '+';
            c = a + b;
        } else {
            operacao = '*';
            c = a * b;
        }

        System.out.printf("%d %c %d = %d", a, operacao, b, c);
    }
}
