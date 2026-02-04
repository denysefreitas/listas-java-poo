package apostilacaelum.capitulo3.fixacacaodesintaxe;

public class Desafio01 {
    public static void main(String[] args) {
        int a1 = 0, a2 = 1;

        do{
            System.out.print(a1 + "\t");
            a2 = a2 + a1;
            a1 = a2 - a1;
        } while (a1 < 100);
    }
}
