package Portate;

public class SecondiPiatti {
    private String name = null;
   //TODO da fare double
    private Float price = null;

    public SecondiPiatti(String nome, Float prezzo) {
        this.name = nome;
        this.price = prezzo;
    }
    public String getNome() {
        return name;
    }
    public Float getPrezzo() {
        return price;
    }

    public void setNome(String nome) {
        this.name = nome;
    }
    public void setPrezzo(Float prezzo) {
        this.price = prezzo;
    }

    @Override
    public String toString() {
        return name + " " + price + "€";
    }
}

