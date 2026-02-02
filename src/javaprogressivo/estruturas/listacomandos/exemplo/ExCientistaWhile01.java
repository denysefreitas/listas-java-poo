package javaprogressivo.estruturas.listacomandos.exemplo;
/*
Suponha que você é um cientista e quer saber se entre os números 1 e um milhão existe um número que é múltiplo de 17 e 19, ao mesmo tempo.
Ou seja, queremos saber se existe um número entre 1 e um milhão que deixa resto 0 na divisão por 17 e por 19.
Caso exista, o imprima. E só imprima o menor.
 */

public class ExCientistaWhile01 {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        int num_inicio = 1, num_max = 1000000;
        int num_atual = num_inicio;

        while (num_atual < num_max){
            if(num_atual % 17 == 0 && num_atual % 19 == 0){
                System.out.println(num_atual);
                break;
            }
            num_atual++;
        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() - i));
    }
}
