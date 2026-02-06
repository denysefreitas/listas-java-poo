package javaprogressivo.pooparteii.listaenum.exemplos.domain;

public enum Comida {
    PAO_DE_QUEIJO("Pão de Queijo", 5.0),
    TAPIOCA("Tapioca recheada", 7.0),
    COXINHA("Coxinha de Frango", 4.5);

    private String nome;
    private double valor;

    Comida(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
