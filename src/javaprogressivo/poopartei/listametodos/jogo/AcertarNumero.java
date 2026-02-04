package javaprogressivo.poopartei.listametodos.jogo;

/*
O computador vai sortear um número, entre 1 e 1000 e você terá que adivinhar que número é esse.
A cada rodada você entra com um número e o computador vai te dar as dicas, dizendo se o número que você digitou é maior ou menor ao número que ele sorteou.

Termina quando você acerta, e ele guarda o número de tentativas que você fez
 */

import java.util.Random;
import java.util.Scanner;

public class AcertarNumero {
    public static void imprimirRegras(){
        System.out.println("\tREGRAS DO JOGO");
        System.out.println("1. Informe um número no intervalo definido ou seu progresso será perdido.");
        System.out.println("2. Uma vez jogando, você sai somente se não cumprir as regras ou se acertar o número.");
        System.out.println("Boa sorte!");
        System.out.println("Informe um número [1 - 1000]: ");
    }

    public static void imprimirExpulso(){
        System.out.println("Você não cumpriu as nossas regras.");
        System.out.println("O programa será finalizado e o seu progresso será perdido.");
    }

    public static void imprimirVitoria(int numSorteado, int tentativas){
        System.out.printf("Muito bem, realmente era o número %d :)\n", numSorteado);
        System.out.printf("Você acertou o número sorteado com %d tentativas!\n", tentativas);
        System.out.println("Será que consegue ser mais rápido? ");
        System.out.println("Tente outra vez!");
    }

    public static boolean acertouNumero(int num, int numSorteado){
        return num != numSorteado;
    }

    public static void dicas(int num, int numSorteado){
        if(num > numSorteado){
            System.out.printf("O número %d é MAIOR do que o número da sorte!\n", num);
        } else {
            System.out.printf("O número %d é MENOR do que o número da sorte!\n", num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random sortear = new Random();
        int numSorteado, tentativas = 0, num;
        boolean expulsoDoJogo = false, continuarOJogo;

        numSorteado = sortear.nextInt(1, 1000);

        do{
            imprimirRegras();
            num = input.nextInt();
            tentativas++;
            continuarOJogo = acertouNumero(num, numSorteado);

            if(num < 1 || num > 1000){
                expulsoDoJogo =  true;
                break;
            }

            if(continuarOJogo){
               dicas(num, numSorteado);
            }

        } while (continuarOJogo);

        if(expulsoDoJogo){
            imprimirExpulso();
        } else {
            imprimirVitoria(numSorteado, tentativas);
        }
    }
}
