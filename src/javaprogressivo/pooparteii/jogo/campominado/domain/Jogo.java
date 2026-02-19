package javaprogressivo.pooparteii.jogo.campominado.domain;

import java.util.Scanner;

public class Jogo {
    Tabuleiro tabuleiroGabarito = new Tabuleiro(1);
    Tabuleiro tabuleiroUsuario = new Tabuleiro(2);
    private int jogadas = 0;

    public void iniciarJogo(){
        exibirInstrucoes();
        fazerJogada();
    }

    public void exibirInstrucoes(){
        System.out.println("\tBem-vindo(a) ao Campo Minado!\n");
        System.out.println("\t\t\tINSTRUÇÕES DO JOGO");
        System.out.println("1. O tabuleiro será de tamanho 8x8 com 10 bombas dispostas de maneira aleatória.");
        System.out.println("2. Você deve escolher uma linha e uma coluna dentro do limite do tabuleiro [1 - 8].");
        System.out.println("3. Se não for uma bomba, você receberá uma dica de quantas bombas estão ao redor da coordenada.");
        System.out.println("4. O objetivo? Descobrir todas as posições que não possuem bomba... mas, se você escolher uma bomba, será eliminado!");
        System.out.println("\n\t\t\tBOA SORTE!");
    }

    public void exibirTabuleiro(boolean gameOver) {
        if (!gameOver) {
            if(tabuleiroGabarito.isVitoria(jogadas)){
                System.out.println("Parabéns, você venceu! Agora, restam somente bombas no tabuleiro.");
                tabuleiroGabarito.exibe();
            } else {
                fazerJogada();
            }
        } else {
            System.out.println("Havia uma mina. Você perdeu!");
            tabuleiroGabarito.exibe();
        }
    }

    public void fazerJogada() {
        Scanner input = new Scanner(System.in);
        int linha, coluna;
        boolean gameOver = false;

        do {
            tabuleiroUsuario.exibe();

            do {
                System.out.print("\nLinha: ");
                linha = tabuleiroGabarito.getTamanho() - (input.nextInt());
            } while (jogadaInvalida(linha));

            do {
                System.out.print("Coluna: ");
                coluna = input.nextInt() - 1;
            } while (jogadaInvalida(coluna));

        } while (isJogadaAntiga(linha, coluna));

        if(tabuleiroGabarito.isBomba(linha, coluna)){
            gameOver = true;
        } else {
            tabuleiroUsuario.atualizarTabuleiro(linha, coluna, tabuleiroGabarito);
        }
        this.jogadas++;
        exibirTabuleiro(gameOver);
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

    public boolean isJogadaAntiga(int x, int y){
        if(tabuleiroUsuario.getTabuleiro()[x][y] == '_'){
            return false;
        } else {
            System.out.println("\nVocê já realizou essa jogada. Insira outras coordenadas!");
            return true;
        }
    }
}
