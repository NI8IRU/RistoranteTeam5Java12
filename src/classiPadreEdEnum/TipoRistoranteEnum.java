package classiPadreEdEnum;

public enum TipoRistoranteEnum {
    CARNIVORO("Menù di tipo carnivoro"),
    VEGETARIANO("Menù di tipo vegetariano"),
    PESCE("Menù a base di pesce");

    private final String descrizione;

    TipoRistoranteEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
