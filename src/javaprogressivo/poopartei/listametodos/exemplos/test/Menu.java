package javaprogressivo.poopartei.listametodos.exemplos.test;

import java.util.Scanner;

public class Menu {
    public static void imprimirMenu(){
        System.out.println("\tCadastro de clientes");
        System.out.println("0. Fim");
        System.out.println("1. Inclui");
        System.out.println("2. Altera");
        System.out.println("3. Exclui");
        System.out.println("4. Consulta");
        System.out.println("Opção: ");
    }

    public static void inclui(){
        System.out.println("Você selecionou o método inclui");
    }
    public static void altera(){
        System.out.println("Você selecionou o método altera");
    }
    public static void exclui(){
        System.out.println("Você selecionou o método exclui");
    }
    public static void consulta() {
        System.out.println("Você selecionou o método consulta");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            imprimirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("O menu foi fechado.");
                    break;
                case 1:
                    inclui();
                    break;
                case 2:
                    altera();
                    break;
                case 3:
                    exclui();
                    break;
                case 4:
                    consulta();
                    break;
                default:
                    System.out.println("Parâmetro inválido");
            }
        } while (opcao != 0);
    }
}
