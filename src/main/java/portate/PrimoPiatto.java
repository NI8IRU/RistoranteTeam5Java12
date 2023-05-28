package portate;


import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;


public class PrimoPiatto extends Portata {
    private Integer kcalPerEtto;


    public PrimoPiatto(TipoEnum tipoEnum, String nome, Double prezzo, Integer kcalPerEtto ) {
        super(nome, prezzo, tipoEnum, OrdinatoreEnum.PRIMA_POSIZIONE);
        this.kcalPerEtto = kcalPerEtto;

    }

    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }


    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }

    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  " + kcalPerEtto + "kcal (presenti per etto); \n");
    }
}
