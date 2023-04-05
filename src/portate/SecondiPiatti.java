package portate;

public class SecondiPiatti {
    private String nome;

    private Double prezzo;
    private Double pesoCarne;


    public SecondiPiatti(String nome, Double prezzo,Double pesoCarne) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.pesoCarne=pesoCarne;
    }
    public String getNome() {
        return nome;
    }
    public Double getPrezzo() {
        return prezzo;
    }

    public Double getPesoCarne() {
        return pesoCarne;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
    public void setPesoCarne(Double pesoCarne){
        this.pesoCarne=pesoCarne;
    }

    public void printSecondi() {
        System.out.println(nome + ": " + prezzo + "€" +pesoCarne +"g");
    }

}

