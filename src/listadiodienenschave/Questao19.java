package listadiodienenschave;

//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Questao19 {
    public static void main(String[] args) {
        int num = 10;

        System.out.printf("TABUADA DO %d%n", num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }
    }
}
