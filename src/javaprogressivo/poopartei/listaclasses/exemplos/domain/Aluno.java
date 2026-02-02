package javaprogressivo.poopartei.listaclasses.exemplos.domain;

public class Aluno {
    public String nome;
    public double notaMat, notaFis;
    public double media;

    public Aluno() {
        System.out.println("Objeto criado.");
    }

    public Aluno(String nome, double notaMat, double notaFis) {
        this.nome = nome;
        this.notaMat = notaMat;
        this.notaFis = notaFis;
        this.media = (notaMat + notaFis) / 2;
    }
}
