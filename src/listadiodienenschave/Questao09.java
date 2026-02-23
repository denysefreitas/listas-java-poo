package listadiodienenschave;

/*
Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição

de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC



 Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)
 */

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, imc;
        String situacao;

        System.out.println("Informe a sua altura em metros: ");
        altura = input.nextDouble();

        System.out.println("Informe o seu peso em quilogramas: ");
        peso = input.nextDouble();

        imc = peso / (altura * altura);

        if(imc <= 18.5){
            situacao = "Abaixo do peso";
        } else if(imc <= 24.9){
            situacao = "Peso ideal";
        } else if (imc <= 29.9){
            situacao = "Levemente acima do peso";
        } else if(imc <= 34.9){
            situacao = "Obesidade grau I";
        } else if(imc <= 39.9){
            situacao = "Obesidade grau II (severa)";
        } else {
            situacao = "Obesidade grau III (mórbida)";
        }

        System.out.printf("IMC: %.2f%nSituação: %s", imc, situacao);
    }
}
