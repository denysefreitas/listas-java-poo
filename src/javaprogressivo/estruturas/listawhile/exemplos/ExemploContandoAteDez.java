package javaprogressivo.estruturas.listawhile.exemplos;

/*
Definimos uma variável inteira, 'count'.
Enquanto essa variável for menor que 10, seu valor será imprimido e será incrementado.
Ou seja será, será impresso 1, 2, 3, ..., 9, 10...opa!
Quando chegar em 11, a condição dentro do laço não será mais verdadeira, e o laço terminará!
 */

public class ExemploContandoAteDez {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            System.out.printf("count = %d\n", count);
            count++;
        }

        System.out.printf("Fora do laço while, pois count = %d", count);
    }
}
