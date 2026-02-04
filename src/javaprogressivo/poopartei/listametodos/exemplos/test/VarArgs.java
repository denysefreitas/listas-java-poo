package javaprogressivo.poopartei.listametodos.exemplos.test;
/*
Crie um aplicativo que receba 5 valores do usuário e calcule a média dos 5, dos primeiros 4, 3 e 2 valores inseridos.
Use apenas um método que receba uma lista de argumentos de tamanho qualquer.
 */


import java.util.Scanner;

public class VarArgs {

    public static double calcularMedia(double ...nums){
        double soma = 0, n = 0;

        for (double num : nums){
            soma += num;
            n++;
        }
        return soma / n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e;

        System.out.println("Informe o número (1/5):");
        a = input.nextDouble();
        System.out.println("Informe o número (2/5):");
        b = input.nextDouble();
        System.out.println("Informe o número (3/5):");
        c = input.nextDouble();
        System.out.println("Informe o número (4/5):");
        d = input.nextDouble();
        System.out.println("Informe o número (5/5):");
        e = input.nextDouble();

        System.out.printf("Média: %.2f", calcularMedia(a, b, c, d, e));
    }
}
