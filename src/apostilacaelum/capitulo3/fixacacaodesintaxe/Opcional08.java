package apostilacaelum.capitulo3.fixacacaodesintaxe;

/*
Imprima	a	seguinte	tabela,	usando		for	s	encadeados:
1
2	4
3	6	9
4	8	12	16
n	n*2	n*3	....	n*n
 */

import java.util.Scanner;

public class Opcional08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
