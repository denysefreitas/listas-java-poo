package listadiodienenschave;

// Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anos, meses, dias;

        System.out.println("Informe o ano do seu nascimento: ");
        int anoNascimento = input.nextInt();

        anos = 2026 - anoNascimento;
        meses = (anos * 12) + 1;
        dias = (meses * 30) + 21;

        System.out.printf("Você nasceu no ano %d e hoje é dia 21/02/2026. Logo, até aqui...%n", anoNascimento);
        System.out.printf("Foram %d anos vividos%n", anos);
        System.out.printf("Foram %d meses vividos%n", meses);
        System.out.printf("Foram %d dias vividos%n", dias);
    }
}
