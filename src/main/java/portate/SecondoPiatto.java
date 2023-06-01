package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

/**
 *
 * Classe figlia di 'Portata', serve per
 *  aggiungere eventuali secondi piatti al menù
 */

public class SecondoPiatto extends Portata {

    /**
     * Fa riferimento alla grammatura dei piatti
     */
    private Double pesoPiatto;

    /**
     *
     * @param tipoEnum il tipo della portata (se è carnivora, vegetariana o di tipo pesce)
     * @param nome nome della portata
     * @param prezzo prezzo della portata
     * @param pesoPiatto peso della portata
     */
    public SecondoPiatto(TipoEnum tipoEnum, String nome, Double prezzo, Double pesoPiatto) {

        super(nome, prezzo, tipoEnum, OrdinatoreEnum.SECONDA_POSIZIONE);
        this.pesoPiatto = pesoPiatto;
    }

    /**
     *
     * @return il peso del piatto
     */
    public Double getPesoPiatto() {
        return pesoPiatto;
    }

    /**
     * Setter per il peso del piatto, accetta solo double
     *
     * @param pesoPiatto peso del piatto
     */
    public void setPesoPiatto(Double pesoPiatto) {
        this.pesoPiatto = pesoPiatto;
    }


    /**
     * @Override della funzione ereditata
     * dalla classe padre 'Portata', in base al tipo della portata
     * eseguirà una stampa diversa
     */
    @Override
    public void printPortata() {

        switch (getTipoEnum()) {
            case CARNIVORO -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                    + " \n  grammatura della carne: " + getPesoPiatto() + "g \n");
            case PESCE -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                    + " \n  peso del pesce: " + getPesoPiatto() + "g \n");
            case VEGETARIANO -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                    + " \n  grammatura del piatto: " + getPesoPiatto() + "g \n");
            default -> System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                    + " \n  peso del piatto: " + getPesoPiatto() + "g \n");
        }

    }

}