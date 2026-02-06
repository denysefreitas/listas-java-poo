package javaprogressivo.pooparteii.listacomposicao.exemplos.domain;

public class DiaDaSemana {
    String dia;

    public DiaDaSemana(String dia) {
        switch (dia){
            case "Domingo": case "Segunda-feira": case "Terça-feira": case "Quarta-feira": case "Quinta-feira": case "Sexta-feira": case "Sábado":
                this.dia = dia;
                break;
            default:
                throw new IllegalArgumentException("Dia da semana inválido");
        }
    }

    public String getDia() {
        return dia;
    }
}
