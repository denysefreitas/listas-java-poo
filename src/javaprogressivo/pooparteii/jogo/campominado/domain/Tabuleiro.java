package javaprogressivo.pooparteii.jogo.campominado.domain;

import java.util.Arrays;
import java.util.Random;

public class Tabuleiro {
    private int tamanho = 8;
    private char[][] tabuleiro;
    private final int jogadasParaVencer = tamanho * tamanho - 10;

    public Tabuleiro(int opcao){
        tabuleiro = new char[tamanho][tamanho];

        // Cria o tabuleiro do gabarito
        if(opcao == 1){
            sorteiaMinas(10);
            preencheTabuleiro();
        } else {
            preencheTabuleiroUsuario();
        }
    }

    // Exibe o tabuleiro
    public void exibe(){
        System.out.println("\n  Linhas");

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
    public void sorteiaMinas(int quantidadeMinas){
        Random sorteia = new Random();
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

    // Atualiza o tabuleiro com os números de bombas ao redor
    public void preencheTabuleiroUsuario() {
        for (char[] chars : tabuleiro) {
            Arrays.fill(chars, '_');
        }
    }

    // Atualiza o tabuleiro com os números de bombas ao redor
    public void preencheTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(!isBomba(i, j)){
                    tabuleiro[i][j] = (char) ('0' + contarBombas(i, j));
                }
            }
        }
    }

    // Confere se a coordenada está no tabuleiro
    public boolean isCoordenadaValida(int coordenada){
        return coordenada >= 0 && coordenada < tabuleiro.length;
    }

    // Confere se a coordenada é uma bomba
    public boolean isBomba(int i, int j){
        return tabuleiro[i][j] == '*';
    }

    // Conta as bombas ao redor
    public int contarBombas(int i, int j){
        int[] linha  = {-1, -1, -1,  0,  0,  1,  1,  1};
        int[] coluna = {-1,  0,  1, -1,  1, -1,  0,  1};
        int x, y, qntBombas = 0;

        for (int k = 0; k < 8; k++) {
            x = i + linha[k];
            y = j + coluna[k];

            if (isCoordenadaValida(x) && isCoordenadaValida(y)){
                if (tabuleiro[x][y] == '*'){
                    qntBombas++;
                }
            }
        }
        return qntBombas;
    }

    public void atualizarTabuleiro(int x, int y, Tabuleiro gabarito){
        this.tabuleiro[x][y] = gabarito.tabuleiro[x][y];
    }

    public boolean isVitoria(int jogadas){
        return jogadas == this.jogadasParaVencer;
    }

    public int getTamanho() {
        return tamanho;
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }
}