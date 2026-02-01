package javaprogressivo.estruturas.listafor.exercicios;
/*
Construa um aplicativo em Java para gerar 20 números de 1000 a 1999 e mostrar aqueles que divididos por 11 deixam resto 5.
 */

public class Questao09 {
    public static void main(String[] args) {
        int num_gerar = 20, num;
        int min = 1000, max = 2000;

        for (int i = 0; i < num_gerar; i++) {
            num = (int)(Math.random() * (max - min) + min);

            if(num % 11 == 5){
                System.out.println(num);
            }
        }
    }
}
