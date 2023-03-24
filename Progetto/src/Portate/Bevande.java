package Portate;

public class Bevande {

    private String nome = null;
    private Double prezzo = null;
    private Double percentAlcol = 0.0;

    Bevande(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    Bevande(String nome, Double prezzo, Double percentAlcol) {
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
}
