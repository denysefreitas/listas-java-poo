package javaprogressivo.estruturas.listaifelse.desafios;

/*
Refaça o mesmo problema (de ExemploNota01).
Teste se a nota está entre 0.0 e 10.0.
Depois se foi reprovado direto, se sim, termina o programa.
Se não, vai pra outro if pra saber se está de recuperação. Se estiver, termina.
Se não estiver de recuperação, vai pro else que diz que ele passou direto.
 */

import java.util.Scanner;

public class Desafio1R2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma nota (entre 0 e 10): ");
        double nota = input.nextDouble();
        input.close();

        if (nota >= 0 && nota <= 10) {
            if(nota < 5){
                System.out.println("Situação: Reprovado");
            } else {
                // Não precisa validar nota >= 5, pois é sempre TRUE
                if(nota < 7){
                    System.out.println("Situação: Recuperação");
                } else {
                    System.out.println("Situação: Aprovado");
                }
            }
        } else {
            System.out.println("Nota inválida");
        }
    }
}
