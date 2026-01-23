package Aprendendo_POO.lista01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = "teste123", senhaUsuario;

        System.out.println("Informe uma senha: ");
        senhaUsuario = input.next();
        int tentativas = 1;

        while(!senhaUsuario.equals(senha) && tentativas < 3){
            System.out.println("Você tem outra tentativa. Informe uma nova senha: ");
            senhaUsuario = input.next();
            tentativas++;
        }
        input.close();

        if(senhaUsuario.equals(senha)){
            System.out.println("Parabéns! Você acertou a senha na tentativa " + tentativas);
        } else {
            System.out.println("Sinto muito. Você não descobriu a senha e suas tentativas acabaram!");
        }
    }
}
