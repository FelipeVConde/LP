import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da semana:");
        Integer diaDaSemana = leitor.nextInt();

        switch (diaDaSemana){
            case 1:
                System.out.println("É segunda!");
                break;
            case 2:
                System.out.println("É terça!");
                break;
            case 3:
                System.out.println("É quarta");
                break;
            case 4:
                System.out.println("É quinta!");
                break;
            case 5:
                System.out.println("Sextou!");
                break;
            default:
                System.out.println("Número invalido");

        }

//        String fruta = "Melancia";
//        switch (fruta){
//            case maça
//        }

        if(diaDaSemana.equals(1)){
            System.out.println("É segunda!");
        }
    }
}
