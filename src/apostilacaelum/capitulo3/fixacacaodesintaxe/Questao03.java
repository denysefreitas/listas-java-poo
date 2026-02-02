package apostilacaelum.capitulo3.fixacacaodesintaxe;
// Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.

public class Questao03 {
    public static void main(String[] args) {
        int num_inicial = 1, num_final = 100, multiplo = 3;

        System.out.printf("Múltiplos de %d de %d até %d\n", multiplo, num_inicial, num_final);
        for (int i = num_inicial; i < num_final; i++) {
            if(i % multiplo == 0){
                System.out.print(i + "\t");
            }
        }
    }
}
