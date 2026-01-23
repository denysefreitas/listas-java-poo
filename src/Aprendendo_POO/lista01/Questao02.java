package Aprendendo_POO.lista01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        // Use e
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double delta, x1, x2;

        System.out.println("Informe o valor de a: ");
        a = input.nextDouble();

        System.out.println("Informe o valor de b: ");
        b = input.nextDouble();

        System.out.println("Informe o valor de c: ");
        c = input.nextDouble();
        input.close();

        delta = Math.pow(b, 2) - 4*a*c;

        if(delta < 0){
            System.out.println("A equação não apresenta raízes reais");
        } else if(delta == 0){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("A equação apresenta uma única raíz: " + x1);
        } else{
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("A equação apresenta duas raízes: " + x1 + " e " + x2);
        }
    }
}
