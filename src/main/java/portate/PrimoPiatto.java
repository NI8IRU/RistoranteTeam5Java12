package portate;


import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;


public class PrimoPiatto extends Portata {
    private Integer kcalPerEtto;


    public PrimoPiatto(TipoEnum tipoEnum, String nome, Double prezzo, Integer kcalPerEtto ) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, tipoEnum, OrdinatoreEnum.PRIMA_POSIZIONE);
        this.kcalPerEtto = kcalPerEtto;

    }

    /**
     * @return kcalPerEtto
     */

    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }


    /**
     * @param kcalPerEtto
     */
    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }


    /**
     * Override della funzione ereditata
     * dalla classe padre 'Portata'
     */
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  " + kcalPerEtto + "kcal (presenti per etto); \n");
    }
}
