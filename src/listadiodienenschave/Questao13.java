package listadiodienenschave;

// Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, situacao;
        int idade;

        System.out.println("Informe o seu nome: ");
        nome = input.next();

        System.out.println("Informe a sua idade: ");
        idade = input.nextInt();

        if(idade < 18){
            situacao = "menor";
        } else {
            situacao = "maior";
        }
        System.out.printf("%s possui %d anos. Logo, é %s de idade", nome, idade, situacao);
    }
}
