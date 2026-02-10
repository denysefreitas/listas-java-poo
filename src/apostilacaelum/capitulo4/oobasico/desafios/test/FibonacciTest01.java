package apostilacaelum.capitulo4.oobasico.desafios.test;

import apostilacaelum.capitulo4.oobasico.desafios.domain.Fibonacci;

import java.util.Scanner;

public class FibonacciTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        int vezes;

        do {
            System.out.println("Informe a quantidade de termos que você deseja ver da Sequência de Fibonacci: ");
            vezes = input.nextInt();

            if (vezes <= 0 || vezes > 30) {
                System.out.println("Quantidade inválida. Informe um número maior ou igual a um e menor ou igual a 30.");
            }
        } while (vezes <= 0 || vezes > 30);

        System.out.printf("Sequência de Fibonacci com %d termos:%n", vezes);
        for (int i = 1; i <= vezes; i++) {
            System.out.print(fibonacci.calculaFibonacci(i) + "\t");
        }

    }
}
