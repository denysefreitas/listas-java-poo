package listadiodienenschave;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean r1, r2;

        System.out.println("Informe um valor booleano (true/false): ");
        r1 = input.nextBoolean();
        System.out.println("Informe um valor booleano (true/false): ");
        r2 = input.nextBoolean();

        if(r1 && r2){
            System.out.println("Ambos são TRUE");
        } else if(!r1 && !r2){
            System.out.println("Ambos são FALSE");
        } else {
            System.out.println("Um é TRUE e outro é FALSE");
        }
    }
}
