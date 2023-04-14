package portate;

public class PrimiPiatti {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\033[0m";
    private String nome;
    private Double prezzo;
    private Integer kcalPerEtto;


    public SecondoPiatto(String nome, Double prezzo,Integer kcalPerEtto) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.kcalPerEtto = kcalPerEtto;
    }
    public String getNome() {
        return nome;
    }
    public Double getPrezzo() {
        return prezzo;
    }
    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }

    public void printPrimi() {
        System.out.println(ANSI_CYAN + nome + ": " + prezzo + "€" + ANSI_RESET);
    }
}
