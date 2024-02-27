public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println(String.format("O número digitado foi %d", numeroDigitado));

        System.out.println("Digite um número real: ");
        Double numeroRealDigitado = leitor.nextDouble();

        System.out.println(String.format("O número real digitado foi %.2f", numeroRealDigitado));

        System.out.println("Digite seu nome:");
        String nomeDigitado = leitor.next();

        System.out.println(String.format("O nome digitado foi %s", nomeDigitado));
    }
}
