import com.sun.java.accessibility.util.AccessibilityEventMonitor;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        String nome = "Felipe";
        Double saldo = 23.0;
        String codigo = "A001";

        String nome2 = "Midori";
        Double saldo2 = 41.0;
        String codigo2 = "B001";

        List<String> nomeBilhete = new ArrayList<>();
        List<Double> saldos = new ArrayList<>();

        //Instanciando um objeto = criando um objeto
        //Usamos o new para criar um objeto
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Felipe";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Midori";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "B002";


        bilhete01.carregar(42.0);
        System.out.println("Saldo atual: " + bilhete01.saldo);


    }
}
