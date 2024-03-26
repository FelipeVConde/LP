package Lista_5_com_encapsulamento.Exercicio01;

public class Bolo {
    private String sabor;
    private Double valor;
    private Integer quantidadeVendida;
    private Integer quantidadeEmEstoque;

    public Bolo(String sabor,
                Double valor,
                Integer quantidadeVendida,
                Integer quantidadeEmEstoque) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Bolo(){

    }

    void venderBolo(Integer quantidadeDesejada){
        if (quantidadeDesejada + quantidadeVendida > quantidadeEmEstoque || quantidadeDesejada < 0){
            System.out.println("Bolos insuficiente em estoque");
        } else {
            quantidadeVendida += quantidadeDesejada;
            System.out.println("Venda realizada");
        }
    }

    void aumentarEstoque(Integer quantidadeAdicionada){
        if(quantidadeAdicionada < 0){
            System.out.println("Valor solicitado incorreto");
        } else {
            quantidadeEmEstoque += quantidadeAdicionada;
            System.out.println("Quantidade no estoque aumentada!");
        }
    }

    Integer quantidadeDisponivel(){

        Integer t = quantidadeEmEstoque - quantidadeVendida;

        return t;
    }

    Double totalVendido(){

        Double totalVenda;
        totalVenda = valor * quantidadeVendida;

        return totalVenda;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
