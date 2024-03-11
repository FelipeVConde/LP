import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();
        frutas.add("Laranja");
        frutas.add("banana");
        frutas.add("maçã");
        frutas.add("tomate\n");

        System.out.println("Frutas: ");
        for (int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        List<String> nomes = new ArrayList<>();
        nomes.add("Mateus");
        nomes.add("Eduardo");
        nomes.add("Anderson");
        nomes.add("Chico");

        System.out.println("Nomes: ");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        System.out.println();
        String frutaPesquisa = "Goiaba";
        Boolean existeFruta;

        for (int i = 0; i < frutas.size(); i++) { // nomeLista.fori (CRIA LAÇO DE REPETICAO)
            if(frutas.get(i).equals(frutaPesquisa)){
                existeFruta = true;
            }else{
                existeFruta = false;
            }
        }

//        if(existeFruta){
//            System.out.println("A fruta existe na lista");
//        }else{
//            System.out.println("A fruta não existe");
//        }

        Utilitaria utilitaria = new Utilitaria();
        utilitaria.exibirMensagem();

        Integer resultado = utilitaria.somar(3,6);
        System.out.println(resultado);
    }
}
