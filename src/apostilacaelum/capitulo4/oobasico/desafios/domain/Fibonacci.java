package apostilacaelum.capitulo4.oobasico.desafios.domain;

public class Fibonacci {

    public int calculaFibonacci(int num){
        if(num == 2){
            return 1;
        } else if (num == 1){
            return 0;
        }

        return (calculaFibonacci(num - 1) + calculaFibonacci(num - 2));
    }
}
