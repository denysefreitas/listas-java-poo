package javaprogressivo.pooparteii.jogo.campominado.domain;

import java.util.Random;

public class Tabuleiro {
    private int tamanho = 8;
    private char[][] tabuleiro;
    private int quantidadeMinas = 10;
    Random sorteia = new Random();

    public Tabuleiro() {
        tabuleiro = new char[tamanho][tamanho];
        sorteiaMinas();
    }

    public void exibe(){
        // Exibe o tabuleiro
        System.out.println("  Linhas");

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print("\t" + (tabuleiro.length - i) + "\t\t");

            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("\t\t\t");

        for (int j = 1; j <= tabuleiro.length; j++) {
            System.out.print(j + "\t");
        }

        System.out.println("\n\t\t\t\t\t  Colunas");
    }

    // Sorteia as minas no tabuleiro
    public void sorteiaMinas(){
        boolean isRepetido;
        int linha, coluna;

        for (int i = 0; i < quantidadeMinas; i++) {
            // Sorteia até deixar de repetir algum sorteio anterior
            do{
                linha = sorteia.nextInt(tamanho);
                coluna = sorteia.nextInt(tamanho);

                isRepetido = tabuleiro[linha][coluna] == '*';

            } while (isRepetido);

            tabuleiro[linha][coluna] = '*';
        }
    }

    public void preencheTabuleiro(){
        // atualiza o tabuleiro com os números de bombas ao redor
    }
}
