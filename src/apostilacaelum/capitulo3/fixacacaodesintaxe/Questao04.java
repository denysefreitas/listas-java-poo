package apostilacaelum.capitulo3.fixacacaodesintaxe;
// Imprima	os	fatoriais	de	1	a	10

public class Questao04 {
    public static void main(String[] args) {
        int qnt_fatoriais = 10;

        for (int i = 0; i <= qnt_fatoriais; i++) {
            if(i == 0){
                System.out.println("O fatorial de " + i + " é 1");
            } else {
                long fatorial = i;

                for (int j = 1; j < i; j++) {
                    fatorial *= (i - j);
                }

                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", i, i-1, i, fatorial);
            }
        }
    }
}
