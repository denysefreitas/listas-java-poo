package listadiodienenschave;

// Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
// O enunciado carece de sentido, pois Francisco já é maior do que Sara. Por isso, considerei em quantos anos Sara ultrapassará Francisco

public class Questao18 {
    public static void main(String[] args) {
        int anos = 0;
        double alturaF = 1.5, alturaS = 1.1, crescimentoF = 0.02, crescimentoS = 0.03;

        do{
            anos++;
            alturaF += crescimentoF;
            alturaS += crescimentoS;
        } while (alturaS < alturaF);

        System.out.printf("A altura de Sara ultrapassará a altura de Francisco em %d anos", anos);
    }
}
