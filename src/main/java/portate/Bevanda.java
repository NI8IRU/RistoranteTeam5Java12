package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

/**
 *
 * Classe figlia di 'Portata', serve per
 * aggiungere eventuali bevande al menù
 */
public class Bevanda extends Portata {
    /**
     * Rappresenta la % d'alcool presente
     * in una bevanda
     */
    private Double percentAlcol;

    /**
     * @param nome         nome della bevanda
     * @param prezzo       prezzo della bevanda
     * @param percentAlcol % d'alcool presente nella bevanda
     */
    public Bevanda(String nome, Double prezzo, Double percentAlcol) {
        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.QUARTA_POSIZIONE);
        this.percentAlcol = percentAlcol;

    }

    /**
     * Setter per la % d'alcool, accetta solo double
     *
     * @param percentAlcol % d'alcool presente nella bevanda
     */
    public void setPercentAlcol(Double percentAlcol) {
        this.percentAlcol = percentAlcol;
    }


    /**
     * @return la % d'alcool presente
     */
    public Double getPercentAlcol() {
        return percentAlcol;
    }


    /**
     * @Override della funzione ereditata
     * dalla classe padre 'Portata', in questo modo stamperà anche
     * la % d'alcool presente
     */
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  alcool: " + getPercentAlcol() + "%\n");
    }
}





