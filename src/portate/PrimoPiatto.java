package portate;

import enumertion.OrdinatoreEnum;

public class PrimoPiatto extends Portata {
    private Integer kcalPerEtto;
    private final int ordinatore;

    public PrimoPiatto(String nome, Double prezzo, Integer kcalPerEtto) {
        super(nome, prezzo);
        this.kcalPerEtto = kcalPerEtto;
        //dato il valore dell'enum
        this.ordinatore = OrdinatoreEnum.PRIMA_POSIZIONE.getPosizionePortataSulMenu();
    }

    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }

    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }

    @Override
    public void printPortata() {
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  " + getKcalPerEtto() + "kcal (presenti per etto); \n");
    }
}
