package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

/**
 * Classe figlia di 'Portata', serve per
 * aggiungere eventuali dolci al menù
 */
public class Dolce extends Portata {

    /**
     * Rappresenta la % di zuccheri presenti
     * in un dolce
     */
    private Double perZuccheri;

    /**
     * @param nome        nome del dolce
     * @param prezzo      prezzo del dolce
     * @param perZuccheri la % di zuccheri presenti
     */
    public Dolce(String nome, Double prezzo, Double perZuccheri) {

        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.TERZA_POSIZIONE);
        this.perZuccheri = perZuccheri;

    }

    /**
     * Setter per la % di zuccheri, accetta solo double
     *
     * @param perZuccheri % di zuccheri
     */
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
     * @Override della funzione ereditata
     * dalla classe padre 'Portata', in questo modo stamperà anche
     * la % di zuccheri della portata
     */
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}

