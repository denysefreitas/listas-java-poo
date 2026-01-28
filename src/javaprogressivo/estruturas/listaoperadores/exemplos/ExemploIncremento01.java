package javaprogressivo.estruturas.listaoperadores.exemplos;
/*
Teste com ++a e --b e veja se há diferença ou não.
Formate com printf, ao invés de println.
 */


public class ExemploIncremento01 {
    public static void main(String[] args) {
        int a = 0, b = 0;

        System.out.println("Valores Iniciais");
        System.out.println("-------------------");
        System.out.printf("a = %d", a);
        System.out.printf("\nb = %d", b);

        System.out.println("\n\nAnálise comparativa ++var vs. var++");
        System.out.println("-------------------");
        a++;
        ++b;
        System.out.printf("a++ = %d", a);
        System.out.printf("\n++b = %d", b);

        System.out.println("\n\nValores Atualizados");
        System.out.println("-------------------");
        System.out.printf("a = %d", a);
        System.out.printf("\nb = %d", b);

        System.out.println("\n\nAnálise comparativa --var vs. var--");
        System.out.println("-------------------");
        a--;
        --b;
        System.out.printf("a-- = %d", a);
        System.out.printf("\n--b = %d", b);
    }
}
