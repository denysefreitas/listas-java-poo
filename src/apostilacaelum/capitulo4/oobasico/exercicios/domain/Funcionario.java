package apostilacaelum.capitulo4.oobasico.exercicios.domain;
// Questões: 02, 03, 07

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Funcionario(String nome, double salario, String rg) {
        this(nome, rg);
        this.salario = salario;
    }

    public Funcionario(String nome, String rg, Data dataEntrada) {
        this(nome, rg);
        this.dataEntrada = dataEntrada;
    }

    public Funcionario(String nome, String rg, Data dataEntrada, double salario) {
        this(nome, salario, rg);
        this.salario = salario;
    }

    public void imprime(){
        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + getSalario());
        System.out.println("Valor do salário anual: R$ " + calculaGanhoAnual());
    }

    public void calcularBonificacao(double aumento){
        this.salario += aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario * 12;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
