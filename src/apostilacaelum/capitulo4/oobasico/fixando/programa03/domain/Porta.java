package apostilacaelum.capitulo4.oobasico.fixando.programa03.domain;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void imprime(){
        System.out.println("ESPECIFICAÇÕES DA PORTA:");
        System.out.println("Cor: " + getCor());
        System.out.println("Dimensão 'x': " + getDimensaoX());
        System.out.println("Dimensão 'y': " + getDimensaoY());
        System.out.println("Dimensão 'z': " + getDimensaoZ());
    }

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;
    }

    public void pinta(String cor){
        this.cor = cor;
    }

    public boolean estaAberta(){
        return this.aberta;
    }

    public void conferirPorta(){

        if(estaAberta()){
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public String getCor() {
        return cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }
}
