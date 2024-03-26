package Exemplo_PetShop;

public class main {
    public static void main(String[] args) {
        Pet pet = new Pet("Astolfo");
        Pet repete = new Pet("Garfield");

        PetShop petShop = new PetShop("Pet legal", 80.0);
        PetShop petshop2 = new PetShop("Legal's Pet", 60.0);

        System.out.println(String.format(
                """
                    Nome: %s
                    Banhos tomados: %d
                    Valor gasto em pet shops: %.2f                        
                """, pet.getNome(), pet.getQtdBanhosTomados(), pet.getValorGastoEmPetShop()
        ));

        System.out.println(pet.toString());
        System.out.println(petShop.toString());
        System.out.println(petshop2.toString());

        petShop.darBanho(pet);
        petshop2.darBanho(pet);
    }
}
