package javaprogressivo.pooparteii.listageteset.exemplos.test;

import javaprogressivo.pooparteii.listageteset.exemplos.domain.ControleBancario;

public class BancoTest01 {
    public static void main(String[] args) {
        ControleBancario cliente01 = new ControleBancario(8000);
        ControleBancario cliente02 = new ControleBancario(1000);

        System.out.println("CLIENTE 01:\n---------------------------");
        cliente01.setSaque(2000);
        cliente01.setSaque(1000);
        cliente01.setSaque(3000);
        cliente01.setSaque(1500);

        System.out.println("\nCLIENTE 02:\n---------------------------");
        cliente02.setSaque(500);
        cliente02.setSaque(2000);
    }
}
