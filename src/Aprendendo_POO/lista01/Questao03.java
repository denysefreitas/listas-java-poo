package Aprendendo_POO.lista01;


import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, soma = 0;

        System.out.println("Informe um número: ");
        a = input.nextInt();
        input.close();

        for (int i = 0; i < a; i++) {
            if(i != 0 && a % i == 0){
                soma += i;
            }
        }

        if(soma == a){
            System.out.println("O número " + a + " é perfeito");
        } else {
            System.out.println("O número " + a + " não é perfeito, pois sua soma resulta em " + soma);
        }
    }
}
