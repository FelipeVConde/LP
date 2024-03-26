package Exemplo_PetShop;

public class PetShop {
    private String nome;
    private Integer qtdBanhoRealizados;
    private Double valorBanho;
    private Double valorTotalGanho;

    public PetShop(String nome, Double valorBanho) {
        this.nome = nome;
        this.valorBanho = valorBanho;
        this.qtdBanhoRealizados = 0;
        this.valorTotalGanho = 0.0;
    }

    public void darBanho(Pet pet){
        System.out.println("Dando banhono pet " + pet.getNome());
        pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + this.valorBanho);
        this.qtdBanhoRealizados++;
        this.valorTotalGanho += qtdBanhoRealizados * valorBanho;
    }

    public void darBanho(Pet pet, Double desconto) {
        System.out.println("Dando banho no pet " + pet.getNome());
        pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);

        Double valorComDesconto = this.valorBanho - (this.valorBanho * desconto);

        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorComDesconto);
        this.qtdBanhoRealizados++;
        this.valorTotalGanho += valorComDesconto;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "nome='" + nome + '\'' +
                ", qtdBanhoRealizados=" + qtdBanhoRealizados +
                ", valorBanho=" + valorBanho +
                ", valorTotalGanho=" + valorTotalGanho +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhoRealizados() {
        return qtdBanhoRealizados;
    }

    public void setQtdBanhoRealizados(Integer qtdBanhoRealizados) {
        this.qtdBanhoRealizados = qtdBanhoRealizados;
    }

    public Double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(Double valorBanho) {
        this.valorBanho = valorBanho;
    }

    public Double getValorTotalGanho() {
        return valorTotalGanho;
    }

    public void setValorTotalGanho(Double valorTotalGanho) {
        this.valorTotalGanho = valorTotalGanho;
    }
}
