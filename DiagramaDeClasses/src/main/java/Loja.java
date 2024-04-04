public class Loja {
    private String nomeLoja;

    private Integer qtdVendas;

    private Integer qtdMetaVendas;

    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdMetaVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", qtdVendas=" + qtdVendas +
                ", qtdMetaVendas=" + qtdMetaVendas +
                ", valorTotalVendas=" + valorTotalVendas +
                '}';
    }

    public void RealizarVenda(Double valorVenda) {
            qtdVendas++;
            valorTotalVendas += valorVenda;
    }

    public void RealizarVenda(Double valorVenda, Double valorDesconto) {
        qtdVendas++;
        valorTotalVendas += valorVenda - valorDesconto;
    }

    public Boolean VerificarMeta(){
        return this.qtdVendas >= this.qtdMetaVendas;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }
}
