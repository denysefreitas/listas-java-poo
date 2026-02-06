package javaprogressivo.pooparteii.listaenum.exemplos.domain;

public enum Bebida {
    REFRIGERANTE("Coca-cola", 7.0),
    CAFE("Café expresso", 2.5),
    SUCO("Suco de Laranja", 5.0);

    private String nome;
    private double valor;

    Bebida(String nome, double valor) {
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
