import java.util.ArrayList;
import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria(
                "Bob",
                "C001",
                100);
        ContaBancaria conta02 = new ContaBancaria();

        conta01.sacar(10.5);
        System.out.println("Saldo conta 1: " + conta01.getSaldo());

//        System.out.println("Saldo conta 1: " + conta01.saldo);

//        List<ContaBancaria> contas = new ArrayList<>();
//        while(continuarCadastro) {
//
//            System.out.println("Nome:");
//            String nomeDigitado = leitor.nextLine();
//            System.out.println("Saldo:");
//            Double saldoDigitado = leitor.nextDouble();
//
//            ContaBancaria conta = new ContaBancaria();
//            conta.nomeTitular = nomeDigitado;
//            conta.saldo = saldoDigitado;
//
//            contas.add(conta);
//        }
    }
}
