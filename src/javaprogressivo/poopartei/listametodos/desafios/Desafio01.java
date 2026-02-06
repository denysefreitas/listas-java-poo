package javaprogressivo.poopartei.listametodos.desafios;

/*
Ache todos os números primos até 1000
Número primo é aquele que é divisível somente por 1 e por ele mesmo.
 */

public class Desafio01 {

    public static boolean ePrimo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num_max = 1000;

        System.out.printf("Números primos de 2 até %d:\n", num_max);

        for (int num = 2; num < num_max; num++) {
            if(ePrimo(num)){
                System.out.print(num + "\t");
            }
        }
    }
}
