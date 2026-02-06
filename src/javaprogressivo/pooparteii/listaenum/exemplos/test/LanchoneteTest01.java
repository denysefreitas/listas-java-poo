package javaprogressivo.pooparteii.listaenum.exemplos.test;

import javaprogressivo.pooparteii.listaenum.exemplos.domain.Lanchonete;

import java.util.Scanner;

public class LanchoneteTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Informe o seu nome: ");
        String nome = input.nextLine();

        Lanchonete cliente01 = new Lanchonete(nome);

        cliente01.menuBebidas();
        opcao = input.nextInt();
        cliente01.setBebida(opcao);

        cliente01.menuComidas();
        opcao = input.nextInt();
        cliente01.setComida(opcao);

        cliente01.imprimirConta();
    }
}
