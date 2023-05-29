package enumeration;

public enum StelleRistoranteEnum {
    UNA_STELLA("★", "Cucina molto buona nella sua categoria."),
    DUE_STELLE("★★", "Cucina eccellente, merita una deviazione."),
    TRE_STELLE("★★★", "Cucina eccezionale, merita il viaggio.");
    private final String visual;
    private final String descrizione;

    StelleRistoranteEnum(String visual, String descrizione) {
        this.visual = visual;
        this.descrizione = descrizione;
    }

    public String getVisual() {
        return visual;
    }

    public String getDescrizione() {
        return descrizione;
    }
}