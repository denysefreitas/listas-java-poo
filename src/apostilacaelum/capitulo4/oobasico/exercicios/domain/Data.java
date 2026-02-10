package apostilacaelum.capitulo4.oobasico.exercicios.domain;

public class Data {
    private int dia,
        mes,
        ano;
    private static final int anoAtual = 2026;

    public Data(int dia, int mes, int ano) {
        int maxDias = 31;

        if (ano <= anoAtual){
            this.ano = ano;
        } else {
           throw new IllegalArgumentException("Ano inválido");
        }

        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            maxDias = 30;
        } else if (mes == 2){
            if (eBissexto(ano)){
                maxDias = 29;
            } else {
                maxDias = 28;
            }
        }

        if(dia >= 1 && dia <= maxDias){
            this.dia = dia;
        } else {
            diaInvalido();
        }
    }

    public boolean eBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private void diaInvalido() {
        throw new IllegalArgumentException("Dia inválido");
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%d", getDia(), getMes(), getAno());
    }
}
