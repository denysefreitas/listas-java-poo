package javaprogressivo.pooparteii.jogo.campominado.domain;

import java.util.Scanner;

public class Jogo {
    Tabuleiro tabuleiroGabarito = new Tabuleiro(1);
    Tabuleiro tabuleiroUsuario = new Tabuleiro(2);
    private boolean gameOver = false;

    public void exibirTabuleiro() {
        if (!gameOver) {
            fazerJogada();
        } else {
            System.out.println("Havia uma mina. Você perdeu!");
            tabuleiroGabarito.exibe();
        }
    }

    public void fazerJogada() {
        Scanner input = new Scanner(System.in);
        int linha, coluna;

        tabuleiroUsuario.exibe();

        do {
            System.out.print("\nLinha: ");
            linha = input.nextInt() - 1;
        } while (jogadaInvalida(linha));

        do {
            System.out.print("\nColuna: ");
            coluna = input.nextInt() - 1;
        } while (jogadaInvalida(coluna));
    }

    public boolean jogadaInvalida(int posicao) {
        if (posicao >= 0 && posicao < tabuleiroUsuario.getTamanho()) {
            return false;
        } else {
            System.out.println("Posição inválida");
            tabuleiroUsuario.exibe();
            return true;
        }
    }
}
