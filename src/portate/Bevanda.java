package portate;

public class Bevanda {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\033[0m";
    private String nome;
    private Double prezzo ;
    private Double percentAlcol;
    public Bevanda(String nome, Double prezzo, Double percentAlcol) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.percentAlcol = percentAlcol;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void setPercentAlcol(Double percentAlcol) {
        this.percentAlcol = percentAlcol;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public Double getPercentAlcol() {
        return percentAlcol;
    }
    public void printBevanda() {
        System.out.println(ANSI_BLUE + nome + ": " + prezzo + "€" + ANSI_RESET);
    }

}

