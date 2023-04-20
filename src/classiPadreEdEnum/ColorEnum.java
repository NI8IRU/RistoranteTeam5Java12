package classiPadreEdEnum;

public enum ColorEnum {
    RESET("\033[0m"),
    BLU("\u001B[34m"),
    CIANO("\u001B[36m"),
    VIOLA("\033[0;35m"),
    GIALLO("\u001B[33m");
    private final String ansiCode;

    private ColorEnum(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
