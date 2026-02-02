package javaprogressivo.estruturas.listaswitch.exemplos;

import java.util.Scanner;

public class VogalSwitch {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma vogal minúscula: ");
        vogal = entrada.nextLine().charAt(0);
        entrada.close();

        switch(vogal) {
            case 'a':
                System.out.println("Você está no case da vogal 'a'");
            case 'e':
                System.out.println("Você está no case da vogal 'e'");
            case 'i':
                System.out.println("Você está no case da vogal 'i'");
            case 'o':
                System.out.println("Você está no case da vogal 'o'");
            case 'u':
                System.out.println("Você está no case da vogal 'u'");
            default:
                System.out.println("Você não digitou uma vogal minúscula");
        }
    }
}
