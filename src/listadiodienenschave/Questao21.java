package listadiodienenschave;

// Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Questao21 {
    public static void main(String[] args) {
        Random sortear = new Random();
        System.out.println("O número sorteado foi " + sortear.nextInt(1, 100));
    }
}
