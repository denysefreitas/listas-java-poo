package javaprogressivo.base.listaprint.exercicios;
// Refaça o exercício anterior, agora usando tapenas uma vez método print() (dica: \n )

public class Questao02 {
    public static void main(String[] args) {
        String nome = "Denyse";
        String endereco = "Ponte Nova - MG";
        final String CPF = "186.***.***-**";

        // System.out.printf("Nome: %s \nEndereço: %s \nCPF: %s", nome, endereco, CPF);
        System.out.print("DADOS DO USUÁRIO");
        System.out.print("\n--------------------");
        System.out.print("\nNome: " + nome);
        System.out.print("\nEndereço: " + endereco);
        System.out.print("\nCPF: " + CPF);
    }
}
