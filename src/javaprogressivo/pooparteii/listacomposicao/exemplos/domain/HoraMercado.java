package javaprogressivo.pooparteii.listacomposicao.exemplos.domain;

public class HoraMercado {
    private int hora,
            minuto,
            segundo;
    private static final int horaDesconto =  20;

    public HoraMercado(int hora, int minuto, int segundo) {
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida");
        }

        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido");
        }

        if(segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido");
        }
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", getHora(), getMinuto(), getSegundo());
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getHoraDesconto() {
        return horaDesconto;
    }
}
