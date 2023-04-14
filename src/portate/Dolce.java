package portate;

//cambiato nome- messo al singolare!
public class Dolce {
    public static final String PURPLE = "\033[0;35m";
    public static final String ANSI_RESET = "\033[0m";

    private String nome;
    private Double prezzo;

    //TODO magari la possiamo chiamare %zuccheri,decidete voi
    private String quantitaZuccheri;

    //costruttore

    public Dolce(String nome, Double prezzo, String quantitaZuccheri) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaZuccheri = quantitaZuccheri;
    }

    //setter e getter x il nome !

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    //setter e getter x il prezzo !
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Double getPrezzo() {
        return prezzo;
    }


    //setter e getter x la quantità di zuccheri!
    public void setQuantitaZuccheri(String quantitaZuccheri) {
        this.quantitaZuccheri = quantitaZuccheri;
    }

    public String getQuantitaZuccheri() {
        return quantitaZuccheri;
    }

    public void printDolci() {
        System.out.println(PURPLE + nome + ": " + prezzo + "€" + ANSI_RESET);

    }
}
