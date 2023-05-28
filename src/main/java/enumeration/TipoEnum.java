
package enumeration;

/**
 * Creazione: 26/05/2023
 * Enum che verrà usato per definire il tipo
 * della portata e/o menù, ogni tipo presenta una descrizione e un
 * colore del background particolare
 */
public enum TipoEnum {

    CARNIVORO("Carnivoro", "Menù di tipo carnivoro", ColorEnum.BG_GIALLO),
    VEGETARIANO("Vegetariano", "Menù di tipo vegetariano", ColorEnum.BG_VERDE),
    PESCE("Pesce", "Menù a base di pesce", ColorEnum.BG_CIANO),
    ALL("Tutti i tipi", "Adatto a tutti i tipi di menù", ColorEnum.BG_BIANCO);

    private final String nome;
    private final String descrizione;
    private final ColorEnum coloreTipo;

    /**
     * @param nome        nome del tipo della menù
     * @param descrizione descrizione del tipo di menù
     * @param coloreTipo  colore del tipo del menù, il cui ansicode è presente nella classe
     *                    'ColorEnum'
     */
    TipoEnum(String nome, String descrizione, ColorEnum coloreTipo) {
        this.nome = nome;
        this.descrizione = descrizione;

        this.coloreTipo = coloreTipo;
    }

    /**
     *
     * @return il nome del tipo
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return la descrizione del tipo
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     *
     * @return il colore del tipo
     */
    public ColorEnum getColoreTipo() {
        return coloreTipo;
    }
}