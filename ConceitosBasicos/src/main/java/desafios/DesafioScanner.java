package desafios;
import java.util.Scanner;
public class DesafioScanner {
    public static void main(String[] args) {
        Scanner vigia = new Scanner(System.in);

        System.out.println("Cadastro de PET");
        System.out.println("Informe nome do PET:");
        String nomeDigitado = vigia.nextLine();

        System.out.println("Informe a altura em metros:");
        Double alturaDigitado = vigia.nextDouble();

        System.out.println("Informe quantos anos tem seu PET:");
        Integer idadeDigitado = vigia.nextInt();

        System.out.println(String.format("""
                PET cadastrado com sucesso!
                Confira se os dados estão corretos:
                nome: %s 
                altura: %.2fM
                idade: %d
                """, nomeDigitado, alturaDigitado, idadeDigitado));
    }
}
