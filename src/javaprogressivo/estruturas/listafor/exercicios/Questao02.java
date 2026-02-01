package javaprogressivo.estruturas.listafor.exercicios;

/*
Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.
 */

public class Questao02 {
    public static void main(String[] args) {
        int num_inicial = 1, num_limite = 100, num_divisor = 2;

        for (int i = num_inicial; i < num_limite; i++) {
            if(i % num_divisor == 0){
                System.out.println(i);
            }
        }
    }
}
