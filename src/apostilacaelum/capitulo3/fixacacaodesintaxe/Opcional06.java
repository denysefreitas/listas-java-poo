package apostilacaelum.capitulo3.fixacacaodesintaxe;

/*
Imprima	os	primeiros	números	da	série	de	Fibonacci	até	passar	de	100.	A	série	de
Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
segundo	vale	1,	daí	por	diante,	o	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)
ésimo	elemento	(ex:	8	=	5	+	3).
 */

public class Opcional06 {
    public static void main(String[] args) {
        int max = 100;
        int a1 = 0, a2 = 1, aux;

        do{
            System.out.print(a1 + "\t");
            aux = a1 + a2;
            a1 = a2;
            a2 = aux;
        } while (a1 < max);
    }
}
