package apostilacaelum.capitulo3.parasabermais;

public class LabeledLoops01 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "\t" + j);
                if (j == 2) {
                    break outer;
                }
            }
        }
    }
}