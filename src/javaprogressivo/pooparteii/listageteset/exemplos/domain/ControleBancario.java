package javaprogressivo.pooparteii.listageteset.exemplos.domain;

public class ControleBancario {
    double saldo;
    int saques_diarios = 0;

    public ControleBancario(){}

    public ControleBancario(double saldo) {
        this.saldo = saldo;
    }

    public void setSaque(double valor){
        if(saques_diarios < 3){
            saldo -= valor;
            saques_diarios++;
            System.out.printf("Saldo restante: %.2f\n", saldo);
        } else {
            System.out.println("Você atingiu o limite de saques diários");
        }
    }
}
