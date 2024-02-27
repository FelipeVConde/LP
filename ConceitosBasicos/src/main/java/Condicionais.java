public class Condicionais {
    public static void main(String[] args) {
        Integer numero01 = 2;
        Integer numero02 = 2;

        if (numero01 == numero02){
            System.out.println("è emgual");
        }else {
            System.out.println("É diferente");
        }
        String nome01 = "Manoel";
        String nome02 = "Giu";

        if(nome01.equals(nome02)){
            System.out.println("é igual");
        }else{
            System.out.println("é diferente");
        }

        Boolean bloqueado = false;

        if(bloqueado == true){
            System.out.println("esta bloqueado");
        }else{
            System.out.println("nao esta bloqueado");
        }
    }
}
