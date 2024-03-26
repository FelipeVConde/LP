public class BilheteUnico {

        //Atributos:
        String nomeTitular;
        Double saldo;
        String codigo;

        //Métodos = Comportamentos
        void carregar(Double valorRecarga){
            if (valorRecarga <= 0){
                System.out.println("valor invalido");
            } else {
                saldo += valorRecarga;
                System.out.println("Recarga efetuada");
            }

        }
}
