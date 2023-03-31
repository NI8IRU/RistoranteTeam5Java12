package Portate;

public class Bevande {

    //TODO perchè hai inizializzato a null?

    private String nome;
    private Double prezzo;
    private Double percentAlcol = 0.0;


    public Bevande(String nome, Double prezzo, Double percentAlcol) {
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

    //TODO a che serve il toString? a stampare ?dobbiamo creare print che dentro ha una system.out
    public String toString() {

        return nome + " " + prezzo + "€";
    }
}
