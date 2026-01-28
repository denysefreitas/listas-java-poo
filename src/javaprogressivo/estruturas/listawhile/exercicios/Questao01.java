package javaprogressivo.estruturas.listawhile.exercicios;
// Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.

public class Questao01 {
    public static void main(String[] args) {
        int num_inicial = 1, num_max = 100, num_divisor = 3;
        int num_atual = num_inicial;

        System.out.printf("Lista de números divisíveis por %d de %d até %d:\n", num_divisor, num_inicial, num_max);

        while (num_atual <= num_max){
            if(num_atual % num_divisor == 0){
                System.out.printf("%d ", num_atual);
            }
            num_atual++;
        }
    }
}
