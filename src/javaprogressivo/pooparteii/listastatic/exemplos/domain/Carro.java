package javaprogressivo.pooparteii.listastatic.exemplos.domain;

public class Carro {
    private String nome;
    private static int total = 0;

    public Carro(String nome) {
        this.nome = nome;
        total++;
        System.out.printf("Novo objeto criado com sucesso. Agora, existem %d objeto(s).\n", total);
    }
}
