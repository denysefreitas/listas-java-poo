package apostilacaelum.capitulo5.desafio.domain;

public class Singleton {
    private static Singleton instanciaUnica = null;

    private Singleton() {
    }

    public static Singleton getInstancia(){
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void ola(){
        System.out.println("Olá, sou a única instância dessa classe!");
    }
}

