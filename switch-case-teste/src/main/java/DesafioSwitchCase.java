import java.util.Scanner;

public class DesafioSwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer operador = 0;

        while (operador > 3 || operador < 1){
            System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - multiplicar
                """);
            operador = leitor.nextInt();
        }

        System.out.println("numero 1:");
        Integer numero01 = leitor.nextInt();

        System.out.println("numero 2:");
        Integer numero02 = leitor.nextInt();

        switch (operador){
            case 1:
                Integer soma = numero01 + numero02;
                System.out.println("soma: " + soma);

            case 2:
                Integer subtrai = numero01 - numero02;
                System.out.println("subtração: " + subtrai);

            case 3:
                Integer multiplica = numero01 * numero02;
                System.out.println("multiplicação: " + multiplica);
        }
    }
}
