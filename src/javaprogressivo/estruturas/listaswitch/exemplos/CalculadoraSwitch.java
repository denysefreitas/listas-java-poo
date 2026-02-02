package javaprogressivo.estruturas.listaswitch.exemplos;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+ -> Adição\n- -> Subtração\n* -> Multiplicação\n/ -> Divisão");
        System.out.println("Informe a operação desejada: ");
        char operacao = input.nextLine().charAt(0);

        System.out.println("Informe o primeiro número: ");
        int a = input.nextInt();
        System.out.println("Informe o segundo número: ");
        int b = input.nextInt();
        input.close();

        switch (operacao){
            case '+':
                System.out.printf("%d %c %d = %d", a, operacao, b, a + b);
                break;
            case '-':
                System.out.printf("%d %c %d = %d", a, operacao, b, a - b);
                break;
            case '*':
                System.out.printf("%d %c %d = %d", a, operacao, b, a * b);
                break;
            case '/':
                System.out.printf("%d %c %d = %d", a, operacao, b, a / b);
                break;
            default:
                System.out.println("Código inválido. Não há operação correspondente.");
        }
    }
}
