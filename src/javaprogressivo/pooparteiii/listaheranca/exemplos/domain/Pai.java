package javaprogressivo.pooparteiii.listaheranca.exemplos.domain;

public class Pai {
    private String nomePai = "Neil";

    public Pai() {
        System.out.println("Dentro do construtor da classe 'Pai'");
    }

    public String getNomePai() {
        return nomePai;
    }
}
