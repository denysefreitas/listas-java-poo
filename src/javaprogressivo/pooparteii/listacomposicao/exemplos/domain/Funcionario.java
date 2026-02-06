package javaprogressivo.pooparteii.listacomposicao.exemplos.domain;

public class Funcionario {
    private String nome;
    private boolean atrasou;
    private double tempoTrabalhado, tempoAtraso;

    public Funcionario(String nome, Hora horaChegada, Hora horaSaida) {
        this.nome = nome;
        this.tempoAtraso = quantoAtrasou(horaChegada);

        if(this.tempoAtraso > 0){
            atrasou = true;
            System.out.println("Funcionário(a) " + this.nome + " atrasado(a)");
        }

        this.tempoTrabalhado = quantasHorasTrabalhou(horaChegada, horaSaida);
    }

    public double quantoAtrasou(@org.jetbrains.annotations.NotNull Hora horaChegada){
        int h = horaChegada.getHora();
        int m = horaChegada.getMinuto();
        int s = horaChegada.getSegundo();

        int segundosTotais = h * 60 * 60 + m * 60 + s;
        // Se o funcionário deve entrar 8h:
        int horaDeviaEntrar = 8 * 60 * 60;

        return (double) (segundosTotais - horaDeviaEntrar) / (60 * 60);
    }

    public double quantasHorasTrabalhou(Hora horaChegada, Hora horaSaida){
        int hChegada = horaChegada.getHora(), hSaida = horaSaida.getHora();

        int segundosChegada = hChegada * 60 * 60;
        int segundosSaida = hSaida * 60 * 60;
        int tempoTrabalhado = (segundosSaida - segundosChegada) / (60 * 60);

        if(tempoTrabalhado < 0){
            throw new IllegalArgumentException("Hora de saída anterior à de chegada");
        }

        return tempoTrabalhado;
    }

    public double getTempoTrabalhado() {
        return tempoTrabalhado;
    }

    public String getNome() {
        return nome;
    }
}
