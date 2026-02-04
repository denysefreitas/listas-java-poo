package javaprogressivo.poopartei.listametodos.exercicios.test;

// Use o método da questão passado e lance o dado 1 milhão de vezes. Conte quantas vezes cada número saiu.
//A probabilidade deu certo? Ou seja, a porcentagem dos números foi parecida?

import java.util.Random;

public class Questao09 {
    public static int Dado(){
        Random sorteador = new Random();

        return sorteador.nextInt(1, 7);
    }

    public static double calcularProbabilidade(int evento, int universo){
        return (double) evento / universo;
    }

    public static void main(String[] args) {
        int qnt_vezes = 1000000;
        int qnt1 = 0, qnt2 = 0, qnt3 = 0, qnt4 = 0, qnt5 = 0, qnt6 = 0;

        for (int i = 0; i < qnt_vezes; i++) {
            switch (Dado()) {
                case 1:
                    qnt1++;
                    break;
                case 2:
                    qnt2++;
                    break;
                case 3:
                    qnt3++;
                    break;
                case 4:
                    qnt4++;
                    break;
                case 5:
                    qnt5++;
                    break;
                default:
                    qnt6++;
                    break;
            }
        }

        System.out.println("Probabilidade (Face 1): " + calcularProbabilidade(qnt1, qnt_vezes));
        System.out.println("Probabilidade (Face 2): " + calcularProbabilidade(qnt2, qnt_vezes));
        System.out.println("Probabilidade (Face 3): " + calcularProbabilidade(qnt3, qnt_vezes));
        System.out.println("Probabilidade (Face 4): " + calcularProbabilidade(qnt4, qnt_vezes));
        System.out.println("Probabilidade (Face 5): " + calcularProbabilidade(qnt5, qnt_vezes));
        System.out.println("Probabilidade (Face 6): " + calcularProbabilidade(qnt6, qnt_vezes));
    }
}
