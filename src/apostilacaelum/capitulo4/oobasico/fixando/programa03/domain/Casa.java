package apostilacaelum.capitulo4.oobasico.fixando.programa03.domain;

public class Casa {
    private String cor;
    private Porta porta01;
    private Porta porta02;
    private Porta porta03;

    public Casa(Porta porta01, Porta porta02, Porta porta03) {
        this.porta01 = porta01;
        this.porta02 = porta02;
        this.porta03 = porta03;
    }

    public void pinta(String cor){
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas(){
        int portasAbertas = 0;

        if(porta01.estaAberta()){
            portasAbertas += 1;
        }

        if(porta02.estaAberta()){
            portasAbertas += 1;
        }

        if(porta03.estaAberta()){
            portasAbertas += 1;
        }

        return  portasAbertas;
    }
}
