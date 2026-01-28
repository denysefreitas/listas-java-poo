package javaprogressivo.base.listascanner.exemplos;
// Crie um aplicativo que pergunte o ano de nascimento e diga a idade atual do indivíduo.
//  Use a classe Calendar e o método get(Calendar.YEAR) desta classe.

import java.util.Calendar;
import java.util.Scanner;

public class QuestaoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int ano_nascimento, idade;

        int ano_atual = calendario.get(Calendar.YEAR);
        int mes_atual = calendario.get(Calendar.MONTH);
        int dia_atual = calendario.get(Calendar.DATE);

        System.out.println("Informe o seu ano de nascimento: ");
        ano_nascimento = input.nextInt();

        System.out.println("Informe o mês do seu aniversário: " +
                "\n1 - Janeiro" +
                "\n2 - Fevereiro" +
                "\n3 - Março" +
                "\n4 - Abril" +
                "\n5 - Maio" +
                "\n6 - Junho" +
                "\n7 - Julho" +
                "\n8 - Agosto" +
                "\n9 - Setembro" +
                "\n10 - Outubro" +
                "\n11 - Novembro" +
                "\n12 - Dezembro");
        int mes = input.nextInt();

        while (mes < 0 || mes > 12){
            System.out.println("Esse número de mês não é válido. Informe um mês válido para prosseguir:");
            System.out.println("Os meses válidos são: " +
                    "\n1 - Janeiro" +
                    "\n2 - Fevereiro" +
                    "\n3 - Março" +
                    "\n4 - Abril" +
                    "\n5 - Maio" +
                    "\n6 - Junho" +
                    "\n7 - Julho" +
                    "\n8 - Agosto" +
                    "\n9 - Setembro" +
                    "\n10 - Outubro" +
                    "\n11 - Novembro" +
                    "\n12 - Dezembro");
            mes = input.nextInt();
        }

        System.out.println("Informe o dia do seu nascimento: ");
        int dia = input.nextInt();

        // Validação que pode resultar em erros
        // Por exemplo, se o usuário digitar 30 para o mês 2 (Fevereiro)
        while(dia < 0 || dia > 31){
            System.out.println("Esse dia não é válido. Informe um dia válido para prosseguir:");
            dia = input.nextInt();
        }

        input.close();

        if(mes < mes_atual){
            // não fez aniversário
            idade = (ano_atual - ano_nascimento) - 1;
        } else {
            // talvez fez aniversario
            if(dia < dia_atual){
                // não fez aniversário
                idade = (ano_atual - ano_nascimento) - 1;
            } else {
                // fez aniversário
                idade = ano_atual - ano_nascimento;
            }
        }

        System.out.printf("Você possui %d anos", idade);
    }
}
