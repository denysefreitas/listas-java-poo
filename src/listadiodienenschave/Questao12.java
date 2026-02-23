package listadiodienenschave;

/*
Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento

 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.


 Tabela de Código de Condições de Pagamento


 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao, taxa = 0;
        double valor;

        System.out.println("Informe o preço do produto: ");
        valor = input.nextDouble();

        System.out.println("""
                 1 - À Vista em Dinheiro ou Pix, recebe 15% de taxa
                 2 - À Vista no cartão de crédito, recebe 10% de taxa
                 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
                 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%\
                """);
        System.out.println("Informe a opção escolhida: ");
        opcao = input.nextInt();

        if(opcao == 1){
            taxa = -15;
        } else if(opcao == 2) {
            taxa = -10;
        } else if(opcao == 4){
            taxa = 10;
        }

        double dif = valor * taxa / 100;
        System.out.printf("O valor a ser pago é R$ %.2f", valor + dif);
    }
}
