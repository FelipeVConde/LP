package desafios;
import java.util.ArrayList;
import java.util.List;

public class DesafioLista {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(19);
        listaNumeros.add(18);
        listaNumeros.add(0);

        Integer soma = 0;
        for (int i = 0; i < listaNumeros.size(); i++){

            soma += listaNumeros.get(i);
//            System.out.println(soma);
        }

        System.out.println(String.format("""
            A soma dos valores dentro da lista resulta em: %d
            """, soma));

        for (int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 == 0){
                listaNumeros.remove(i);
                i = 0;
            }

        }System.out.println(listaNumeros);
    }
}
