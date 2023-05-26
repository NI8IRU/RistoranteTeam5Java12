package enumeration;

public enum TipoEnum {

    CARNIVORO("Carnivoro", "Menù di tipo carnivoro", ColorEnum.BG_GIALLO),
    VEGETARIANO("Vegetariano", "Menù di tipo vegetariano", ColorEnum.BG_VERDE),
    PESCE("Pesce", "Menù a base di pesce", ColorEnum.BG_CIANO),
    ALL("Tutti i tipi", "Adatto a tutti i tipi di menù", ColorEnum.BG_BIANCO);

    private final String nome;
    private final String descrizione;
    private final ColorEnum coloreTipo;


    TipoEnum(String nome, String descrizione, ColorEnum coloreTipo) {
        this.nome = nome;
        this.descrizione = descrizione;

        this.coloreTipo = coloreTipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public ColorEnum getColoreTipo() {
        return coloreTipo;
    }
}
