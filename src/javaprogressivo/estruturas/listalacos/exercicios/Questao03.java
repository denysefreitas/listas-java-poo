package javaprogressivo.estruturas.listalacos.exercicios;
/*
Crie um aplicativo bancário em Java que pede o valor do depósito inicial, o valor do investimento mensal e o número de meses que o dinheiro vai ficar rendendo na poupança.
Após isso, calcule o lucro obtido, sabendo que o juros da poupança é de 0,5%.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double deposito, investimento_mensal, lucro, juros = 0.005;
        int meses;

        System.out.println("Informe o valor do depósito inicial: ");
        deposito = input.nextDouble();
        double conta = deposito;

        System.out.println("Informe o valor do investimento mensal: ");
        investimento_mensal = input.nextDouble();

        System.out.println("Informe a quantidade de meses que o dinheiro ficará na poupança rendendo: ");
        meses = input.nextInt();
        input.close();

        if(deposito <= 0 || investimento_mensal <= 0 || meses <= 0){
            System.out.println("Você informou dados fora dos parâmetros esperados. O programa não será executado.");
        } else {
            double total_investimentos = investimento_mensal * meses + deposito;
            for (int i = 0; i < meses; i++) {
                conta = (conta + investimento_mensal) * (1 + juros);
                System.out.println(conta);
            }
            lucro = conta - total_investimentos;

            System.out.println("O lucro obtido foi de R$" + lucro);
        }
    }
}
