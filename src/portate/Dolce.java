package portate;

import enumertion.OrdinatoreEnum;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private String perZuccheri;

    /**
     * @param nome
     * @param prezzo
     * @param perZuccheri
     */
    public Dolce(String nome, Double prezzo, String perZuccheri) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, OrdinatoreEnum.TERZA_POSIZIONE);
        this.perZuccheri = perZuccheri;

    }

    public void setPerZuccheri(String perZuccheri) {
        this.perZuccheri = perZuccheri;
    }

    /**
     * @return percentuale zuccheri in un dolce
     */
    public String getPerZuccheri() {
        return perZuccheri;
    }

    /**
     * stampa le informazioni della portata
     */
    @Override
    public void printPortata() {
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}
