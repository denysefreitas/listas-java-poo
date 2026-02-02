package javaprogressivo.estruturas.listawhile.exemplos;

/*
Muito bem, o programa inicia e diz que para você sair da Matrix precisará digitar um caractere especial.
Como você é programador Java, está vendo que no teste condicional a senha é 'j', de java.

Se o usuário adivinhar a letra, o if retorna verdadeiro e altera o valor de 'continuar' para false, aí na próxima iteração o while não irá executar e o programa sai do loop.
Caso ele erre - o que é provável, visto que existem 26 letras e 10 números no teclado - a variável 'continuar', continua sendo true (pois nada foi alterado).
 */

import java.util.Scanner;

public class ExemploMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        char letra;

        System.out.println("Você está na Matrix. Para sair, acerte a letra!");
        while (continuar){
            System.out.println("Informe uma letra: ");
            letra = input.nextLine().charAt(0);

            if(letra == 'D'){
                continuar = false;
            } else {
                System.out.println("Você não está autorizado para sair da Matrix.");
            }
        }

        System.out.println("Parabéns! Você saiu da Matrix!");
    }
}
