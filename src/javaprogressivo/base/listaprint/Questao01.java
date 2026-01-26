package javaprogressivo.base.listaprint;
// Faça um programa em Java que exibe seu nome na primeira linha, seu endereço na segunda linha e seu CPF na terceira linha, usando três vezes o método println()

public class Questao01 {
    public static void main(String[] args) {
        String nome = "Denyse";
        String endereco = "Ponte Nova - MG";
        final String CPF = "186.***.***-**";

        // System.out.printf("Nome: %s \nEndereço: %s \nCPF: %s", nome, endereco, CPF);
        System.out.println("DADOS DO USUÁRIO");
        System.out.println("--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + CPF);
    }
}
