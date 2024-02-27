import java.util.concurrent.ThreadLocalRandom;
public class Randomico {
    public static void main(String[] args) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(-5,11);

        System.out.println(numeroAleatorio);
    }
}
