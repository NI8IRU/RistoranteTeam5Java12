package enumertion;

public enum TipoEnum {

    CARNIVORO("Carnivoro", "Menù di tipo carnivoro"),
    VEGETARIANO("Vegetariano", "Menù di tipo vegetariano"),
    PESCE("Pesce", "Menù a base di pesce");

    private final String nome;
    private final String descrizione;


    TipoEnum(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;

    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }


}
