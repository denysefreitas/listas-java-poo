package listadiodienenschave;

// Questão 22 duplicada -> Questão 24
 // Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
// Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida..
//
//Fórmula: distância = tempo x velocidade.
//
//            litros usados = distância / 12.

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double litros, tempo, velocidade;

        System.out.println("Informe a velocidade média (em km/h) da viagem: ");
        velocidade = input.nextDouble();
        System.out.println("Informe o tempo (em horas) gasto na viagem: ");
        tempo = input.nextDouble();

        // distancia = velocidade * tempo
        // litros = distancia / 12
        litros = (velocidade * tempo) / 12;
        System.out.printf("De acordo com os dados informados, foram gastos %.2f litros de combustível na viagem", litros);
    }
}
