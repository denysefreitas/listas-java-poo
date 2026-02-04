package javaprogressivo.poopartei.listametodos.exercicios.test;

// Crie um método chamado Dado() que retorna, através de sorteio, um número de 1 até 6.

import java.util.Random;

public class Questao08 {
    public static int Dado(){
        Random sorteador = new Random();

        return sorteador.nextInt(1, 6);
    }

    public static void main(String[] args) {
        System.out.println("Número sorteado [1 - 6]: " + Dado());
    }
}
