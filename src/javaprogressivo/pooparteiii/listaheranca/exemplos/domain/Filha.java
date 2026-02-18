package javaprogressivo.pooparteiii.listaheranca.exemplos.domain;

public class Filha extends Pai {
    String nomeFilha;

    public Filha(){}

    public Filha(String nome) {
        System.out.println("Dentro do construtor da classe 'Filha'");
        this.nomeFilha = nome;
    }

    public String getNomeFilha() {
        return nomeFilha;
    }

    public void imprimirDados() {
        System.out.println("\nDADOS");
        System.out.println("Nome da filha: " + getNomeFilha());
        System.out.println("Nome do pai: " + getNomePai());
    }
}
