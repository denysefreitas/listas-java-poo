package listadiodienenschave;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Informe um número para imprimirmos a sua tabuada: ");
        num = input.nextInt();

        System.out.printf("%nTABUADA DO %d%n", num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }
    }
}
