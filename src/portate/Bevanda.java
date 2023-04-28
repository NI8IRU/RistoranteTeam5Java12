package portate;

public class Bevanda extends Portata {
    private Double percentAlcol;
    private final int ordinatore;

    //TODO inserire enumerato
    public Bevanda(String nome, Double prezzo, Double percentAlcol) {
        super(nome, prezzo);
        this.percentAlcol = percentAlcol;
        this.ordinatore = 4;
    }

    public void setPercentAlcol(Double percentAlcol) {
        this.percentAlcol = percentAlcol;
    }

    public Double getPercentAlcol() {
        return percentAlcol;
    }


    @Override
    public int getOrdinatore() {
        return ordinatore;
    }

    @Override
    public void printPortata() {
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  alcool: " + getPercentAlcol() + "%\n");
    }
}



