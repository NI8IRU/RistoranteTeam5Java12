package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private Double perZuccheri;

    public Dolce(String nome, Double prezzo, Double perZuccheri) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.SECONDA_POSIZIONE);
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
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}
