package portate;


import enumertion.OrdinatoreEnum;


public class PrimoPiatto extends Portata {
    private Integer kcalPerEtto;


    public PrimoPiatto(String nome, Double prezzo, Integer kcalPerEtto) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, OrdinatoreEnum.PRIMA_POSIZIONE);
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
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  " + getKcalPerEtto() + "kcal (presenti per etto); \n");
    }
}
