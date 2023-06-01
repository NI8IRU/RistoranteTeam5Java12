package enumeration;

/**
 * L'enumerazione StelleRistoranteEnum rappresenta il livello di valutazione
 * di un ristorante in base alle sue stelle.
 */
public enum StelleRistoranteEnum {
    /**
     * Una stella - "★"
     * Cucina molto buona nella sua categoria.
     */
    UNA_STELLA("★", "Cucina molto buona nella sua categoria."),

    /**
     * Due stelle - "★★"
     * Cucina eccellente, merita una deviazione.
     */
    DUE_STELLE("★★", "Cucina eccellente, merita una deviazione."),

    /**
     * Tre stelle - "★★★"
     * Cucina eccezionale, merita il viaggio.
     */
    TRE_STELLE("★★★", "Cucina eccezionale, merita il viaggio.");

    private final String visual;
    private final String descrizione;

    /**
     * Costruttore per l'enumerazione StelleRistoranteEnum.
     *
     * @param visual      La rappresentazione visuale delle stelle del ristorante.
     * @param descrizione La descrizione del livello di valutazione del ristorante.
     */
    StelleRistoranteEnum(String visual, String descrizione) {
        this.visual = visual;
        this.descrizione = descrizione;
    }

    /**
     * Rappresentazione visuale delle stelle del ristorante.
     *
     * @return La rappresentazione visuale delle stelle.
     */
    public String getVisual() {
        return visual;
    }

    /**
     * Descrizione del livello di valutazione del ristorante.
     *
     * @return La descrizione del livello di valutazione.
     */
    public String getDescrizione() {
        return descrizione;
    }
}