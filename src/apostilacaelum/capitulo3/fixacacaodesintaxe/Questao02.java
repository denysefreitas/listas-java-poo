package apostilacaelum.capitulo3.fixacacaodesintaxe;
// Imprima	a	soma	de	1	até	1000.

public class Questao02 {
    public static void main(String[] args) {
        int num_inicial = 1, num_final = 1000, soma = 0;

        for (int i = num_inicial; i <= num_final; i++) {
            soma += i;
        }

        System.out.printf("A soma de todos os números de %d até %d é %d", num_inicial, num_final, soma);
    }
}
