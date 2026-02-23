package listadiodienenschave;

// Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        String tipoTriangulo = "escaleno";

        System.out.println("Informe um número: ");
        a = input.nextInt();
        System.out.println("Informe outro número: ");
        b = input.nextInt();
        System.out.println("Informe outro número: ");
        c = input.nextInt();

        if((a + b > c) && (a + c > b) && (b + c > a)){
            if(a == b && b == c){
                tipoTriangulo = "equilátero";
            } else if (a == b || a == c || b == c) {
                tipoTriangulo = "isósceles";
            }

            System.out.printf("Um triângulo de lados %d, %d e %d é classificado como %s", a, b, c, tipoTriangulo);
        }  else {
            System.out.println("Os três lados informados não podem formar um triângulo");
        }
    }
}
