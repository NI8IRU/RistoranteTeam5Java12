package enumertion;

public enum TipoRistoranteEnum {

    //TODO name che indica il valore però in una forma che si può stampare: Carnivoro
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
