package Portate;

public class Dolci {

    //TODO ci mettiamo qualche campo per fare qualche funzionalità, tipo quantità di zucchero
    private String nome;
    private Double prezzo;

    //costruttore

    public Dolci(String nome, Double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    //setter e getter x il nome !

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    //setter e getter x il prezzo !
    public void setPrezzo(Double prezzo){
        this.prezzo = prezzo;
    }

    public Double getPrezzo(){
        return this.prezzo;
    }

    @Override
    public String toString() {
        return nome + " - "  + prezzo + " €";
    }
}
