package javaprogressivo.estruturas.listaifelse.desafios;
/*
Escreva um aplicativo Java que gere um número aleatório inteiro entre 1 e 10, e através de testes condicionais você tem que adivinhar que número é esse.
Qual a melhor técnica, a que adivinha em menos chances possíveis?

Para gerar um número aleatório na variável inteiro 'num_aleatorio', adicione no seu programa:
import java.util.Random;

Para gerar números aleatórios, crie um tipo Random 'randomGenerator':
Random randomGenerator = new Random();

E declare a variável para receber o número aleatório assim:

num_aleatorio = randomGenerator.nextInt(10) + 1;
 */

import java.util.Random;

public class Desafio2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int r, num_aleatorio = randomGenerator.nextInt(10) + 1;

        if(num_aleatorio % 2 == 0){
            //2, 4, 6, 8, 10
            if(num_aleatorio % 5 == 0){
                r = 10;
            } else if(num_aleatorio % 3 == 0){
                r = 6;
            } else if (num_aleatorio % 4 == 0) {
                if(num_aleatorio % 8 == 0){
                    r = 8;
                } else {
                    r = 4;
                }
            } else{
                r = 2;
            }
        } else {
            // 1, 3, 5, 7, 9
            if(num_aleatorio % 5 == 0){
                r = 5;
            } else if(num_aleatorio % 7 == 0){
                r = 7;
            } else if (num_aleatorio % 3 == 0) {
                if(num_aleatorio % 9 == 0){
                    r = 9;
                } else {
                    r = 3;
                }
            } else{
                r = 1;
            }
        }

        if(r == num_aleatorio){
            System.out.printf("Você conseguiu acertar! O número sorteado foi %d", r);
        } else {
            // Se o programa estiver correto, essa mensagem nunca vai ser exibida
            System.out.printf("Você errou. O número sorteado foi %d", r);
        }
    }
}
