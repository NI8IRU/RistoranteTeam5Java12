package enumertion;

public enum ColorEnum {

   /*
    Enumerati per la personalizzazione estetica del menù
     */

    RESET("\033[0m", "Interrompe il colore delle stringhe "),
    BLU("\u001B[34m", "Colora i caratteri di blu"),
    CIANO("\u001B[36m", "Colora i caratteri di ciano"),
    VIOLA("\033[0;35m", "Colora i caratteri di viola"),
    GIALLO("\u001B[33m", "Colora i caratteri di giallo"),
    NERO("\u001B[30m", "Colora i caratteri di nero"),

    BG_ROSSO("\u001B[41m", "Colora il background delle stringhe di rosso"),
    BG_VERDE("\u001B[42m", "Colora il background delle stringhe di verde"),
    BG_GIALLO("\u001B[43m", "Colora il background delle stringhe di giallo"),
    BG_CIANO("\u001B[46m", "Colora il background delle stringhe di ciano"),
    BG_VIOLA("\u001B[45m", "Colora il background delle stringhe di viola"),
    BG_BIANCO("\u001B[47m", "Colora il background delle stringhe di bianco");

    private final String ansiCode;
    private final String descrizione;


    ColorEnum(String ansiCode, String descrizione) {
        this.ansiCode = ansiCode;
        this.descrizione = descrizione;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
