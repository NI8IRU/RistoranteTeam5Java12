package enumeration;

/**
 * L'enumerazione ColorEnum rappresenta una serie di costanti che definiscono i colori ANSI per la formattazione del testo e del background.
 */
public enum ColorEnum {

    /**
     * Reset - "\033[0m"
     * Interrompe il colore delle stringhe.
     */
    RESET("\033[0m", "Interrompe il colore delle stringhe."),

    /**
     * Blu - "\u001B[34m"
     * Colora i caratteri di blu.
     */
    BLU("\u001B[34m", "Colora i caratteri di blu."),

    /**
     * Ciano - "\u001B[36m"
     * Colora i caratteri di ciano.
     */
    CIANO("\u001B[36m", "Colora i caratteri di ciano."),

    /**
     * Viola - "\033[0;35m"
     * Colora i caratteri di viola.
     */
    VIOLA("\033[0;35m", "Colora i caratteri di viola."),

    /**
     * Giallo - "\u001B[33m"
     * Colora i caratteri di giallo.
     */
    GIALLO("\u001B[33m", "Colora i caratteri di giallo."),

    /**
     * Nero - "\u001B[30m"
     * Colora i caratteri di nero.
     */
    NERO("\u001B[30m", "Colora i caratteri di nero."),

    /**
     * Background Rosso - "\u001B[41m"
     * Colora il background delle stringhe di rosso.
     */
    BG_ROSSO("\u001B[41m", "Colora il background delle stringhe di rosso."),

    /**
     * Background Verde - "\u001B[42m"
     * Colora il background delle stringhe di verde.
     */
    BG_VERDE("\u001B[42m", "Colora il background delle stringhe di verde."),

    /**
     * Background Giallo - "\u001B[43m"
     * Colora il background delle stringhe di giallo.
     */
    BG_GIALLO("\u001B[43m", "Colora il background delle stringhe di giallo."),

    /**
     * Background Ciano - "\u001B[46m"
     * Colora il background delle stringhe di ciano.
     */
    BG_CIANO("\u001B[46m", "Colora il background delle stringhe di ciano."),

    /**
     * Background Viola - "\u001B[45m"
     * Colora il background delle stringhe di viola.
     */
    BG_VIOLA("\u001B[45m", "Colora il background delle stringhe di viola."),

    /**
     * Background Bianco - "\u001B[47m"
     * Colora il background delle stringhe di bianco.
     */
    BG_BIANCO("\u001B[47m", "Colora il background delle stringhe di bianco.");

    private final String ansiCode;

    /**
     * Costruttore per l'enumerazione ColorEnum.
     *
     * @param ansiCode    Il codice ANSI per il colore o il background specificato.
     * @param descrizione La descrizione del colore o del background.
     */
    ColorEnum(String ansiCode, String descrizione) {
        this.ansiCode = ansiCode;
    }

    /**
     * Restituisce il codice ANSI per il colore o il background specificato.
     *
     * @return Il codice ANSI per il colore o il background.
     */
    public String getAnsiCode() {
        return ansiCode;
    }
}