package javaprogressivo.poopartei.listametodos.desafios;

/* Ache todos os números perfeitos até 1000
Número perfeito é aquele que é a soma de seus fatores. Por exemplo, 6 é divisível por 1, 2 e 3 ao passo que 6 = 1 + 2 + 3.
 */

public class Desafio03 {
    public static boolean ePerfeito(int num){
        if(num < 2){
            return false;
        }

        int soma = 0;

        for (int i = 1; i < num; i++) {
            if(num % i == 0){
               soma += i;
            }
        }

        return soma == num;
    }

    public static void main(String[] args) {
        int num_max = 1000;

        for (int i = 0; i < num_max; i++) {
            if(ePerfeito(i)){
                System.out.print(i + "\t");
            }
        }
    }
}
