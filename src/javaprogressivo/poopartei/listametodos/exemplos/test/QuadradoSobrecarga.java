package javaprogressivo.poopartei.listametodos.exemplos.test;

import java.util.Scanner;

public class QuadradoSobrecarga {
    public static void imprimir(){
        System.out.println("1 - Número inteiro");
        System.out.println("2 - Número decimal");
        System.out.println("0 - Sair");
        System.out.println("Opção: ");
    }

    public static int elevarAoQuadrado(int a){
        return a * a;
    }

    public static double elevarAoQuadrado(double a){
        return a * a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            imprimir();
            opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("O programa foi finalizado.");
                    break;
                case 1:
                    System.out.println("Informe um número inteiro: ");
                    int numInt = input.nextInt();
                    System.out.printf("%d elevado ao quadrado é %d\n", numInt, elevarAoQuadrado(numInt));
                    break;
                case 2:
                    System.out.println("Informe um número decimal: ");
                    double numDouble = input.nextDouble();
                    System.out.printf("%.2f elevado ao quadrado é %.2f\n", numDouble, elevarAoQuadrado(numDouble));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
