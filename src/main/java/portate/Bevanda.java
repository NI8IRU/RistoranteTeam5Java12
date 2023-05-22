package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;

public class Bevanda extends Portata {
    private Double percentAlcol;


    public Bevanda(String nome, Double prezzo, Double percentAlcol) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.QUARTA_POSIZIONE);
        this.percentAlcol = percentAlcol;

    }

    public void setPercentAlcol(Double percentAlcol) {
        this.percentAlcol = percentAlcol;
    }

    public Double getPercentAlcol() {
        return percentAlcol;
    }


    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  alcool: " + getPercentAlcol() + "%\n");
    }
}



