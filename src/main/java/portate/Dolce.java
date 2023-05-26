package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private Double perZuccheri;

    public Dolce(String nome, Double prezzo, Double perZuccheri) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.TERZA_POSIZIONE);
        this.perZuccheri = perZuccheri;

    }

    public void setPerZuccheri(Double perZuccheri) {
        this.perZuccheri = perZuccheri;
    }

    /**
     * @return percentuale zuccheri in un dolce
     */
    public Double getPerZuccheri() {
        return perZuccheri;
    }

    /**
     * stampa le informazioni della portata
     */
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}
