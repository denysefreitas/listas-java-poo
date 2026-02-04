package javaprogressivo.pooparteii.listageteset.exemplos.test;
/*
Crie um protótipo de caixa eletrônico em Java. No início, ele pede seu nome e valor $$ inicial que tem na conta. O programa deve fornecer um número de 4 dígitos - número da conta - para o usuário (use Random). Esses dados serão usados para criar um objeto da classe "Conta.java"

A seguir, mostra um menu com as opções (esse menu deverá ser um método):
- Extrato: exibe o nome, número da conta, saldo e quantos saques já foram realizados
- Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo
- Depositar: recebe o valor a ser depositado e mostra o novo saldo
- Sair

Esse menu aparece até o usuário escolher sair. As outras opções são métodos que devem fazer parte da "Conta.java" (setters e getters).
Note que o usuário pode sacar no máximo 5 vezes por dia.
 */

import javaprogressivo.pooparteii.listageteset.exemplos.domain.Caixa;
import java.util.Scanner;
import static javaprogressivo.pooparteii.listageteset.exemplos.domain.Caixa.imprimirMenu;

public class CaixaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor_inicial;

        System.out.println("Cadastrando um novo cliente...");
        System.out.println("Informe o seu nome: ");
        String nome = input.nextLine();

        do {
            System.out.println("Informe o valor inicial depositado na conta: ");
            valor_inicial = input.nextDouble();

            if(valor_inicial <= 0){
                System.out.println("Você precisa depositar algum valor na conta para criá-la.");
            }
        } while (valor_inicial <= 0);

        Caixa cliente = new Caixa(nome, valor_inicial);
        cliente.realizarOperacao();
    }
}
