package Aprendendo_POO.lista01;

public class Questao01 {
    public static void main(String[] args) {
        int div = 7;
        int maximo = 1000;

        for (int i = 0; i < maximo; i++) {
            if(i % div == 0){
                System.out.println(i);
            }
        }
    }
}

