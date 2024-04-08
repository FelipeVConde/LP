import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {
//        List listaMaluca = new ArrayList();
//        listaMaluca.add("Felipe Conde");
//        listaMaluca.add(6);
//        listaMaluca.add(false);
//        listaMaluca.add(1.95);
//
//        listaMaluca.add(0, "Roni");
//
//
//        System.out.println(listaMaluca.get(0));

        List <Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(19);
        listaNumeros.add(18);
        listaNumeros.add(9);

        System.out.println(listaNumeros);
        System.out.println("Tamanho da lista: " + listaNumeros.size());

        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos valores deseja digitar");
        Integer qtdValores = leitor.nextInt();

        for (int i = 0; i < qtdValores; i++){
            System.out.println(String.format("Informe o %d° valor: ", i + 1));
            Integer valorDigitado = leitor.nextInt();
            listaNumeros.add(valorDigitado);
        }
        System.out.println(listaNumeros);
    }
}
