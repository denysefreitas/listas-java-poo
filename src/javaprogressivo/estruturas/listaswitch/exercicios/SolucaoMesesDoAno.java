package javaprogressivo.estruturas.listaswitch.exercicios;

import java.util.Scanner;

public class SolucaoMesesDoAno {
    public static void main(String[] args) {
        int mes, dias=31;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o mês [1-12]: ");
        mes = entrada.nextInt();
        entrada.close();

        if(mes>12 || mes<1){
            System.out.println("Mês inválido");
            return;
        }

        switch( mes )
        {
            // fevereiro: subtraímos 2 dias aqui e 1 dia no próximo case
            case 2:
                dias -=2;

                //meses que possuem 30 dias: só subtraímos 1 dia
            case 4: case 6: case 9: case 11:
            dias--;

        }

        System.out.printf("O mês %d possui %d dias", mes, dias);
    }
}
