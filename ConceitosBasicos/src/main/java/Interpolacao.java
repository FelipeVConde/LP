public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.63;


        // NA INTERPOLACAO UTILIZAMOS:
        // PARA String %s
        // PARA Integer %d
        // PARA Double %.2f (sendo 2 a quantidade de casas decimais)

        String fraseFormatada = String.format("""
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                """, nome, idade, altura);

        String fraseFormatadaSegunda = """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                """.formatted(nome, idade, altura);

        Boolean petVacinado = false;
        //String frasePetVacinado;
        //if (petVacinado){
        //    frasePetVacinado = "Sim";
        //}else {
        //    frasePetVacinado = "Não";
        //}

        String frasePetVacinado = petVacinado ? "Sim" : "Não";

        System.out.println(
                """
                Meu nome é: %s
                O nome do meu pet é: %s
                Minha idade é: %d
                Minha altura é:%.2f
                Pet vacinado: %s
                """.formatted( nome, "Caramelo", idade, altura, frasePetVacinado)
        );

        Integer idadeParaPagamento = 15;
        Double valorSalario = idadeParaPagamento >= 15 ? 1412.0 : 1000.0;
        Boolean isMaiorDeIdade = idadeParaPagamento >= 18;
    }
}
