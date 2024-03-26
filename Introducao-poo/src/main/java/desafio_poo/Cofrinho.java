package desafio_poo;

public class Cofrinho {

    Double saldo;
    Boolean quebrado;
    String aquisicao;
    void depositar(Double valorDeposito){
        if(quebrado == false){
            saldo += valorDeposito;
        } else {
            System.out.println("cofrinho quebrado");
        }
    }

    void agitar(Double saldo){
        if(quebrado == false){
            Math.random();
        }
    }

    void quebrar(String querQuebrar){
        if (querQuebrar == "Sim"){
            quebrado = true;
            System.out.println("Cofrinho quebrado");
        }else if (querQuebrar == "Não"){
            quebrado = false;
            System.out.println("Cofrinho mantido");
        }
    }
}
