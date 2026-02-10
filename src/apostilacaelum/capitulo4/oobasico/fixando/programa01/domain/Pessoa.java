package apostilacaelum.capitulo4.oobasico.fixando.programa01.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    public void fazAniversario(){
        this.idade += 1;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
