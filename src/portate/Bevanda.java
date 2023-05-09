package portate;

import enumertion.OrdinatoreEnum;

public class Bevanda extends Portata {
    private Double percentAlcol;


    public Bevanda(String nome, Double prezzo, Double percentAlcol) {
        //messo il valore dell'ordinatore nel super!
        super(nome, prezzo, OrdinatoreEnum.QUARTA_POSIZIONE);
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
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  alcool: " + getPercentAlcol() + "%\n");
    }
}



