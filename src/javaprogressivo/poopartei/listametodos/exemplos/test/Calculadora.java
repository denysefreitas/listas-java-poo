package javaprogressivo.poopartei.listametodos.exemplos.test;

import java.util.Scanner;

public class Calculadora {
    public static void imprimirCalculadora(){
        System.out.println("\tOperações da Calculadora");
        System.out.println("+ -> Adição");
        System.out.println("- -> Subtração");
        System.out.println("* -> Multiplicação");
        System.out.println("/ -> Divisão");
        System.out.println("^ -> Exponenciação");
        System.out.println("x -> Fechar");
        System.out.println("Opção: ");
    }

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static boolean podeDividir(double denominador){
        return denominador != 0;
    }

    // A análise do denominador diferente de zero é feito no método podeDividir
    public static double dividir(double a, double b){
        return a / b;
    }

    public static double elevar(double a, double b){
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        char opcao;

        do {
            imprimirCalculadora();
            opcao = input.next().charAt(0);

            if(opcao == 'x'){
                System.out.println("A calculadora foi fechada.");
                break;
            }

            System.out.println("Informe um número: ");
            a = input.nextDouble();

            System.out.println("Informe outro número: ");
            b = input.nextDouble();

            switch (opcao) {
                case '+':
                    System.out.printf("%.2f %c %.2f = %.2f\n", a, opcao, b, somar(a,b));
                    break;
                case '-':
                    System.out.printf("%.2f %c %.2f = %.2f\n", a, opcao, b, subtrair(a,b));
                    break;
                case '*':
                    System.out.printf("%.2f %c %.2f = %.2f\n", a, opcao, b, multiplicar(a,b));
                    break;
                case '/':
                    boolean podeDividir = podeDividir(b);

                    if(podeDividir){
                        System.out.printf("%.2f %c %.2f = %.2f\n", a, opcao, b, dividir(a,b));
                    } else {
                        System.out.println("A operação não pode ser realizada, pois não existe divisão por zero.");
                    }

                    break;
                case '^':
                    System.out.printf("%.2f %c %.2f = %.2f\n", a, opcao, b, elevar(a,b));
                    break;
                default:
                    System.out.println("Parâmetro inválido");
            }
        } while (opcao != 0);
    }
}
