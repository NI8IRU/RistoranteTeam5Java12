package classiPadreEdEnum;

public abstract class Portata {
    private String nome;
    private Double prezzo;
    private static int ordinatore;

    public Portata(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public abstract int getOrdinatore();

    public void printPortata() {
        System.out.println(nome + ": " + prezzo + "€");
    }
}