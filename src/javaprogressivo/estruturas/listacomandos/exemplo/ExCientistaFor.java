package javaprogressivo.estruturas.listacomandos.exemplo;

public class ExCientistaFor {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        int num_inicio = 1, num_max = 1000000;

        for(int count = num_inicio ; count <= num_max ; count++){
            if(count % 2 == 0){
                continue;
            }
            if((count % 17 == 0) && (count % 19 == 0)){
                System.out.println(count);
                break;
            }

        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
    }
}
