package Portate;

public class primiPiatti {
    private String nome = null;
    private Double prezzo = null;

    primiPiatti(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }
    public Double getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

}
