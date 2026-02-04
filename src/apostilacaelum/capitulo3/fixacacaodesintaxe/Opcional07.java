package apostilacaelum.capitulo3.fixacacaodesintaxe;
/*
Escreva	um	programa	que,	dada	uma	variável		x		com	algum	valor	inteiro,	temos	um
novo		x		de	acordo	com	a	seguinte	regra:
se		x		é	par,		x	=	x	/	2
se		x		é	impar,		x	=	3	*	x	+	1
imprime		x

O	programa	deve	parar	quando		x		tiver	o	valor	final	de	1
 */

import java.util.Scanner;

public class Opcional07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Informe um valor inteiro: ");
        num = input.nextInt();

        while (num != 1){
            if(num % 2 == 0){
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }

            System.out.print(num + "\t");
        }
    }
}
