package portate;

import enumertion.OrdinatoreEnum;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private String perZuccheri;
    private final int ordinatore;

    public Dolce(String nome, Double prezzo, String perZuccheri) {
        super(nome, prezzo);
        this.perZuccheri = perZuccheri;
        //dato il valore dell'enum
        this.ordinatore = OrdinatoreEnum.TERZA_POSIZIONE.getPosizionePortataSulMenu();
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

    @Override
    public void printPortata() {
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}
