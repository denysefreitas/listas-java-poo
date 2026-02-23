package listadiodienenschave;

// Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperaturaF, temperaturaC;

        System.out.println("Informe uma temperatura em Fahrenheit (°F): ");
        temperaturaF = input.nextDouble();

        temperaturaC = (5 * (temperaturaF - 32) / 9);
        System.out.printf("%.2f°F corresponde a %.2f°C", temperaturaF, temperaturaC);
    }
}
