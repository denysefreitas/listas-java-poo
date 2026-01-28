package javaprogressivo.base.listaoperacoes.exemplos;
//2. Crie um programa que receba a altura e o peso do usuário, e diga seu IMC (Índice de Massa Corporal), dado pela fórmula:
// imc = peso / altura^2

import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Torna obrigatório uso do ponto no decimal
        double imc, peso, altura;

        System.out.println("Informe o seu peso (em quilos): ");
        peso = input.nextDouble();
        System.out.println("Informe a sua altura (em metros): ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);
        // É possível usar a Biblioteca Math: Math.pow(altura, 2);

        System.out.printf("O valor do seu IMC é %.2f", imc);
    }
}
