package javaprogressivo.poopartei.listametodos.exercicios.test;
/*
Um professor, muito legal, fez 3 provas durante um semestre mas só vai levar em conta as duas notas mais altas para calcular a média.
Faça uma aplicação em Java que peça o valor das 3 notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como sua nota mais alta e sua nota mais baixa. Essas médias devem ser calculadas usando o mesmo método, pois você é um programador Java e não vai ficar criando métodos à toa.
Crie um método que receba as 3 notas e retorna a maior delas. E outro que retorna a menor.
 */

import java.util.Scanner;

public class Questao11 {
    public static void maioresNotas(double n1, double n2, double n3){
        double maior = Math.max(n1, n2);
        double segundaMaior = Math.min(n1, n2);

        if (n3 > maior){
            segundaMaior = maior;
            maior = n3;
        }

        if (n3 > segundaMaior){
            segundaMaior = n3;
        }

        System.out.printf("Média das duas maiores nota: %.2f\n", calcularMedia(maior, segundaMaior));
        System.out.printf("Maior nota: %.2f\n", maior);
    }

    public static void menorNota(double n1, double n2, double n3){
        double menor = Math.min(n1, n2);

        if (n3 < menor){
            menor = n3;
        }

        System.out.printf("Menor nota: %.2f\n", menor);
    }

    public static double calcularMedia(double ...notas){
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Informe a primeira nota: ");
        n1 = input.nextDouble();
        System.out.println("Informe a segunda nota: ");
        n2 = input.nextDouble();
        System.out.println("Informe a terceira nota: ");
        n3 = input.nextDouble();

        System.out.printf("Média das três notas: %.2f\n", calcularMedia(n1, n2, n3));
        maioresNotas(n1, n2, n3);
        menorNota(n1, n2, n3);
    }
}
