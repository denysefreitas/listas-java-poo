package Aprendendo_POO.lista01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe três números: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        int maior, menor;
        if(a > b && a > c){
            maior = a;
            if(b > c){
                menor = c;
            } else {
                menor = b;
            }
        } else if (b > a && b > c){
            maior = b;
            if(a > c){
                menor = c;
            } else {
                menor = a;
            }
        } else {
            maior = c;
            if(a > b){
                menor = b;
            } else {
                menor = a;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        int soma = 0;
        if(a % 2 == 0){
            soma += a;
        }
        if(b % 2 == 0){
            soma += b;
        }
        if(c % 2 == 0){
            soma += c;
        }

        System.out.println("A média dos números pares é: " + soma/3);

        int multiplos3 = 0;
        if (a % 3 == 0){
            multiplos3++;
        }

        if (b % 3 == 0){
            multiplos3++;
        }

        if(c % 3 == 0){
            multiplos3++;
        }

        System.out.println(multiplos3 + " múltiplos de 3 foram digitados");
    }
}
