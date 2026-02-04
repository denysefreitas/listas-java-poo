package javaprogressivo.pooparteii.listageteset.exemplos.domain;

import java.util.Random;
import java.util.Scanner;

public class Caixa {
    private String nome;
    private double saldo;
    private int saques = 0;

    Random sorteador = new Random();
    private final int id = 1 + sorteador.nextInt(9999);

    public Caixa(){}

    public Caixa(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        System.out.println("Cliente cadastrado com sucesso.");
    }

    public static void imprimirMenu(){
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 - Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
        System.out.println("Opção: ");
    }

    // Extrato: exibe o nome, número da conta, saldo e quantos saques já foram realizados
    public void tirarExtrato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.id);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Saques realizados: " + this.saques);

    }

    // Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo
    public void sacar(double valor_saque){
        if(valor_saque > this.saldo){
            System.out.println("Saldo insuficiente");
            System.out.printf("Saldo: %.2f\n", this.saldo);
        } else {
            if(this.saques < 5){
                this.saldo -= valor_saque;
                this.saques++;
                System.out.printf("Novo saldo: %.2f\n", this.saldo);
            } else {
                System.out.println("Você não pode realizar outro saque hoje, pois atingiu o limite diário.");
                System.out.println("Volte novamente amanhã!");
            }
        }
    }

    // Depositar: recebe o valor a ser depositado e mostra o novo saldo
    public void depositar(double valor_deposito){
        this.saldo += valor_deposito;
        System.out.printf("Novo saldo: %.2f\n", this.saldo);
    }

    public void realizarOperacao(){
        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            imprimirMenu();
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    tirarExtrato();
                    break;
                case 2:
                    System.out.println("Informe o valor a ser sacado: ");
                    sacar(input.nextDouble());
                    break;
                case 3:
                    System.out.println("Informe o valor a ser depositado: ");
                    depositar(input.nextDouble());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("O número inserido é inválido. Não será realizada nenhuma operação.");
            }
        } while(opcao != 4);

        System.out.println("O processo foi finalizado. Volte mais vezes!");
    }
}
