package Portate;

public class PrimiPiatti {
    private String nome;
    private Double prezzo;

    public PrimiPiatti(String nome, Double prezzo) {
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

    public void printPrimiPiatti() {
        System.out.println(nome + " " + prezzo + "€");
    }
}
