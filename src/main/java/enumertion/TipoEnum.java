package enumertion;

public enum TipoEnum {

    CARNIVORO("Carnivoro", "Menù di tipo carnivoro", ColorEnum.BG_GIALLO),
    VEGETARIANO("Vegetariano", "Menù di tipo vegetariano", ColorEnum.BG_VERDE),
    PESCE("Pesce", "Menù a base di pesce", ColorEnum.BG_CIANO);

    private final String nome;
    private final String descrizione;
    private final ColorEnum colore;

    TipoEnum(String nome, String descrizione, ColorEnum colore) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.colore = colore;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public ColorEnum getColore() {
        return colore;
    }
}
