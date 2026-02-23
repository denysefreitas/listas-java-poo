package listadiodienenschave;

// Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, soma = 0, media;
        int qntNotas = 4;
        String nome;

        System.out.println("Informe o seu nome: ");
        nome = input.next();

        for (int i = 0; i < qntNotas; i++) {
            System.out.printf("Informe sua %dº nota: ", i + 1);
            nota = input.nextDouble();
            soma += nota;
        }

        media = soma / qntNotas;

        System.out.printf("A média do(a) aluno(a) %s foi de %.2f%n", nome, media);
        if(media >= 7){
            System.out.printf("O(A) aluno(a) %s foi aprovado(a)!", nome);
        } else {
            System.out.printf("O(A) aluno(a) %s foi reprovado(a)!", nome);
        }
    }
}
