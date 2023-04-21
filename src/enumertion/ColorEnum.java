package enumertion;

public enum ColorEnum {

    //TODO come faccio a capire reset che fa, mettiamo una descrizione così al colpo d'occhio sappiamo cos'è
    RESET("\033[0m"),
    BLU("\u001B[34m"),
    CIANO("\u001B[36m"),
    VIOLA("\033[0;35m"),
    GIALLO("\u001B[33m");
    private final String ansiCode;

    ColorEnum(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
