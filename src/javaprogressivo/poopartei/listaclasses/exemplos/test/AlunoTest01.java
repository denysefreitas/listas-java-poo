package javaprogressivo.poopartei.listaclasses.exemplos.test;

import javaprogressivo.poopartei.listaclasses.exemplos.domain.Aluno;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno jogador = new Aluno("Arroyo", 8.0, 6.0);
        Aluno programador = new Aluno();
        Aluno youtuber = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        programador.nome = input.nextLine();

        System.out.println("Informe a nota do aluno em física: ");
        programador.notaFis = input.nextDouble();

        System.out.println("Informe a nota do aluno em matemática: ");
        programador.notaMat = input.nextDouble();

        programador.media = (programador.notaFis + programador.notaMat)/2;

        System.out.println();

        System.out.println("DADOS DO ESTUDANTE\n-----------------------");
        System.out.println("Nome: " + programador.nome);
        System.out.println("Nota de Física: " + programador.notaFis);
        System.out.println("Nota de Matemática: " + programador.notaMat);
        System.out.println("Média: " + programador.media);

        System.out.println();

        System.out.println("DADOS DO ESTUDANTE\n-----------------------");
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Nota de Física: " + jogador.notaFis);
        System.out.println("Nota de Matemática: " + jogador.notaMat);
        System.out.println("Média: " + jogador.media);

        System.out.println();

        System.out.println("DADOS DO ESTUDANTE\n-----------------------");
        System.out.println("Nome: " + youtuber.nome);
        System.out.println("Nota de Física: " + youtuber.notaFis);
        System.out.println("Nota de Matemática: " + youtuber.notaMat);
        System.out.println("Média: " + youtuber.media);
    }
}
