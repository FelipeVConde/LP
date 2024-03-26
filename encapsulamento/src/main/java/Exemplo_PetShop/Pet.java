package Exemplo_PetShop;

public class Pet {
    private String nome;
    private Integer qtdBanhosTomados;
    private Double valorGastoEmPetShop;

    public Pet(String nome) {
        this.nome = nome;
        this.qtdBanhosTomados = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", qtdBanhosTomados=" + qtdBanhosTomados +
                ", valorGastoEmPetShop=" + valorGastoEmPetShop +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosTomados() {
        return qtdBanhosTomados;
    }

    public void setQtdBanhosTomados(Integer qtdBanhosTomados) {
        this.qtdBanhosTomados = qtdBanhosTomados;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }
}
