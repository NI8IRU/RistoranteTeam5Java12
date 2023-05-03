package enumertion;

public enum ColorEnum {

    //ENUM per aggiungere colori alle stringhe
    // RESET da utilizzare per interrompere la colorazione delle stringhe
    RESET("\033[0m"),
    BLU("\u001B[34m"),
    CIANO("\u001B[36m"),
    VIOLA("\033[0;35m"),
    GIALLO("\u001B[33m"),

    // ENUM background colorato
    BG_ROSSO("\u001B[41m"),
    BG_VERDE("\u001B[42m"),
    BG_GIALLO("\u001B[43m"),
    BG_CIANO("\u001B[46m"),
    BG_VIOLA("\u001B[45m"),
    BG_BIANCO("\u001B[47m");

    private final String ansiCode;

    ColorEnum(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
