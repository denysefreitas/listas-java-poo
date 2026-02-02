package apostilacaelum.capitulo3.parasabermais;

public class LabeledLoops02 {
    public static void main(String[] args) {
        forI:
        for (int i = 0; i < 3; i++) {
            forJ:
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    continue forI;
                }

                for (int k = 0; k < 5; k++) {
                    System.out.printf("i = %d \tj = %d \tk = %d\n", i, j, k);
                    if(k == 1){
                        continue forJ;
                    }
                }
            }
        }
    }
}
