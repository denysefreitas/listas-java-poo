package javaprogressivo.estruturas.listacomandos.exemplo;

public class ExCientistaWhile02 {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        int num_inicio = 1, num_max = 1000000;
        int num_atual = num_inicio;

        while (num_atual < num_max){
            if(num_atual % 2 == 0){
                num_atual++;
                continue;
            }

            if(num_atual % 17 == 0 && num_atual % 19 == 0){
                System.out.println(num_atual);
                break;
            }
            num_atual++;
        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() - i));
    }
}
