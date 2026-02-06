package javaprogressivo.pooparteii.listaenum.exemplos.domain;

public class Lanchonete {
    private String nomeCliente;
    private Bebida bebida;
    private Comida comida;

    public Lanchonete(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double calcularConsumo() {
        return this.comida.getValor() + this.bebida.getValor();
    }

    public void imprimirConta(){
        System.out.println("NOTA FISCAL\n------------------------");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Comida: " + comida.getNome() + " (R$" + comida.getValor() + ")");
        System.out.println("Bebida: " + bebida.getNome() + " (R$" + bebida.getValor() + ")");
        System.out.println("Valor total: R$" + calcularConsumo());
    }

    public void menuBebidas(){
        System.out.println("\tBebidas");

        System.out.println("1. " + Bebida.REFRIGERANTE.getNome() + ": R$" + Bebida.REFRIGERANTE.getValor());
        System.out.println("2. " + Bebida.SUCO.getNome() + ": R$" + Bebida.SUCO.getValor());
        System.out.println("3. " + Bebida.CAFE.getNome() + ": R$" + Bebida.CAFE.getValor());

        System.out.print("Escolha sua opção: ");
    }

    public void menuComidas(){
        System.out.println("\tComidas");

        System.out.println("1. " + Comida.PAO_DE_QUEIJO.getNome() + ": R$" + Comida.PAO_DE_QUEIJO.getValor());
        System.out.println("2. " + Comida.TAPIOCA.getNome() + ": R$" + Comida.TAPIOCA.getValor());
        System.out.println("3. " + Comida.COXINHA.getNome() + ": R$" + Comida.COXINHA.getValor());

        System.out.print("Escolha sua opção: ");
    }

    public void setBebida(int opcao) {
        switch (opcao){
            case 1:
                this.bebida = Bebida.REFRIGERANTE;
                break;
            case 2:
                this.bebida = Bebida.SUCO;
                break;
            case 3:
                this.bebida = Bebida.CAFE;
                break;
            default:
                throw new IllegalArgumentException("Bebiba inválida");
        }
    }

    public void setComida(int opcao) {
        switch (opcao){
            case 1:
                this.comida = Comida.PAO_DE_QUEIJO;
                break;
            case 2:
                this.comida = Comida.TAPIOCA;
                break;
            case 3:
                this.comida = Comida.COXINHA;
                break;
            default:
                throw new IllegalArgumentException("Comida inválida");
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}
