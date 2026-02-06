package javaprogressivo.pooparteii.listacomposicao.exemplos.domain;

public class ProdutoMercado {
    private String nome;
    private double preco;
    private DiaDaSemana dia;
    private HoraMercado hora;

    public ProdutoMercado(String nome, double preco) {
        this.nome = nome;

        if(preco > 0){
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço inválido");
        }
    }

    public void imprimirCompra(){
        System.out.println("INFORMAÇÕES SOBRE O PRODUTO:\n--------------------------");
        System.out.println("Produto: " + this.getNome());
        System.out.println("Dia da semana: " + this.dia.getDia());
        System.out.println("Horário da compra: " + this.hora);
        System.out.println("Valor original: " + this.getPreco());
        System.out.println("Valor a ser pago: " + this.calcularPreco());
    }

    public double calcularPreco(){
        double desconto = 0.0;

        if(this.dia.getDia().equals("Domingo") || this.dia.getDia().equals("Sábado")){
            desconto = 0.1;
        } else {
            if((this.hora.getHora() - this.hora.getHoraDesconto()) > 0){
                desconto = 0.1;
            }
        }

        return this.preco * (1 - desconto);
    }

    public void setDia(DiaDaSemana dia) {
        this.dia = dia;
    }

    public void setHora(HoraMercado hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
