package desafio_poo;

import java.util.Scanner;

public class CofrinhoCaracteristicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//
//        System.out.println("Quantos cofrinhos deseja administrar?");
//        Integer qtdCofrinhos = leitor.nextInt();
//
//        System.out.println("Aquisição desejada?");
//        String aquisicao = leitor.next();
//
//        System.out.println("Valor para depositar:");
//        Double deposito = leitor.nextDouble();
//        Boolean cofrinhoQuebrado;

        Cofrinho cofrinho01 = new Cofrinho();
        cofrinho01.aquisicao = "Bicicleta Nova";
        cofrinho01.saldo = 0.0;
        cofrinho01.quebrado = false;

        Cofrinho cofrinho02 = new Cofrinho();
        cofrinho02.aquisicao = "PlayStation 5";
        cofrinho02.saldo = 0.0;
        cofrinho02.quebrado = false;

        cofrinho01.depositar(40.0);
        System.out.println("saldo atual do cofre 1: " + cofrinho01.saldo);
        System.out.println("Foco da poupança do cofre 1: " + cofrinho01.aquisicao);
        System.out.println("Condição do cofre 1: " + cofrinho01.quebrado);


        System.out.println("\nsaldo atual do cofre 2: " + cofrinho02.saldo);
        System.out.println("Foco da poupança do cofre 2: " + cofrinho02.aquisicao);
        System.out.println("Condição do cofre 2: " + cofrinho02.quebrado);

//        cofrinho01.agitar(cofrinho01.saldo);
//        System.out.println();

        System.out.println("\nDeseja quebrar o cofrinho 1?");
        String querQuebrar = leitor.nextLine();

        cofrinho01.quebrar(querQuebrar);
    }
}
