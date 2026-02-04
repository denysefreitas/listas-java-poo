package javaprogressivo.poopartei.listametodos.exemplos.test;

public class JavaProgressivo {
    public static void imprimirSite(){
        System.out.println("Curso Java Progressivo!");
        System.out.println("https://www.javaprogressivo.net/p/curso-completo-de-java-para-iniciantes.html?m=1");
    }

    public static void imprimirTime(){
        System.out.println("Cruzeiro Esporte Clube");
    }

    public static void main(String[] args) {
        imprimirSite();

        for (int i = 0; i < 3; i++) {
            imprimirTime();
        }
    }
}
