package javaprogressivo.pooparteii.listathis.exemplos.domain;

public class Funcionario {
    private String nome;
    private int ID;
    private double salario;

    public Funcionario() {
        System.out.println("Construtor padrão");
    }

    public Funcionario(String nome, int ID, double salario) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public void exibir(){
        System.out.printf("O(A) funcionário(a) %s, de número %d recebe %.2f por mês", this.nome, this.ID ,this.salario);
    }
}
