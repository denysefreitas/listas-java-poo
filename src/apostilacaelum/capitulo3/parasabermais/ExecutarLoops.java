package apostilacaelum.capitulo3.parasabermais;

public class ExecutarLoops {
    static void executarLoopJ(int i){
        for (int j = 0; j < 5; j++) {
            if(j == 2){
                return;
            }

            for (int k = 0; k < 3; k++) {
                System.out.printf("i = %d\t j = %d\t k = %d\n", i, j, k);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            executarLoopJ(i);
        }
    }
}
