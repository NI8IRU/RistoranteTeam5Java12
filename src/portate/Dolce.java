package portate;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private String perZuccheri;
    private final int ordinatore;

    public Dolce(String nome, Double prezzo, String perZuccheri) {
        super(nome, prezzo);
        this.perZuccheri = perZuccheri;
        this.ordinatore = 3;
    }

    public void setPerZuccheri(String perZuccheri) {
        this.perZuccheri = perZuccheri;
    }

    public String getPerZuccheri() {
        return perZuccheri;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }
}
