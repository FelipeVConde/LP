import java.util.concurrent.ThreadLocalRandom;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        //for de 0 a 10

        for(int i = 0; i <= 10; i += 1){
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i -= 1){
            System.out.println(i);
        }
        int i = 0;
        while(i <= 3){
            System.out.println(i);
            i++;
        }

        Integer outroAleatorio;

        do {
            outroAleatorio =
                    ThreadLocalRandom.current().nextInt(0, 10);
        } while(outroAleatorio != 3);;
    }
}
