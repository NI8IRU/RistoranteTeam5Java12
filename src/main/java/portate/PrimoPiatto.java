package portate;


import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

/**
 * Prima creazione: 20/03/2023
 * Classe figlia di 'Portata', serve per
 * aggiungere eventuali primi piatti al menù
 */
public class PrimoPiatto extends Portata {
    /**
     * Rappresenta i kcal presenti in un primo piatto
     */
    private Integer kcalPerEtto;


    /**
     * @param tipoEnum    tipo della portata (se è carnivora, vegetariana o di tipo pesce)
     * @param nome        nome del primo piatto
     * @param prezzo      prezzo del primo piatto
     * @param kcalPerEtto i kcal presenti
     */
    public PrimoPiatto(TipoEnum tipoEnum, String nome, Double prezzo, Integer kcalPerEtto) {

        super(nome, prezzo, tipoEnum, OrdinatoreEnum.PRIMA_POSIZIONE);
        this.kcalPerEtto = kcalPerEtto;

    }

    /**
     * @return i kcal della portata
     */

    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }


    /**
     * Setter per i kcal del primo piatto, accetta solo numeri interi
     *
     * @param kcalPerEtto kcal della portata
     */
    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }


    /**
     * @Override della funzione ereditata
     * dalla classe padre 'Portata', in questo modo stamperà anche
     * i kcal della portata
     */
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  " + kcalPerEtto + "kcal (presenti per etto); \n");
    }
}

