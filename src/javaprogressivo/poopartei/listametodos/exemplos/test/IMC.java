package javaprogressivo.poopartei.listametodos.exemplos.test;

import java.util.Scanner;

public class IMC {

    public static float calcularIMC(float peso, float altura){
        return peso / elevarAoQuadrado(altura);
    }

    public static float elevarAoQuadrado(float a){
        return a * a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso, altura, imc;

        System.out.println("Informe o seu peso (em kg): ");
        peso = input.nextFloat();
        System.out.println("Informe a sua altura (em metros): ");
        altura = input.nextFloat();

        imc = calcularIMC(peso, altura);

        System.out.printf("IMC: %.2f", imc);
    }
}
