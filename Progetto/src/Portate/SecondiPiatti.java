package Portate;

public class SecondiPiatti {
    private String name = null;
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
        return "SecondiPiatti{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

