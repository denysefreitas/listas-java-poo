package javaprogressivo.estruturas.listaoperadores.exemplos;

public class ExemploIncremento02 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Valores Iniciais");
        System.out.println("-------------------");
        System.out.printf("a = %d", a);
        System.out.printf("\nb = %d", b);

        System.out.println("\n\nAnálise comparativa ++var vs. var++ na atribuição de variáveis");
        System.out.println("-----------------------------------------------");

        a = b++;
        // Atribui e depois adiciona 1
        System.out.printf("a = b++ = %d", a);

        a = ++b;
        // Adiciona 1 e depois atribui
        System.out.printf("\na = ++b = %d", a);
    }
}
