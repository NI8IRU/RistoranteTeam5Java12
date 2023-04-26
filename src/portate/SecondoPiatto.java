package portate;

public class SecondoPiatto extends Portata {
    private Double pesoCarne;
    private final int ordinatore;

    public SecondoPiatto(String nome, Double prezzo, Double pesoCarne) {
        super(nome, prezzo);
        this.pesoCarne = pesoCarne;
        this.ordinatore = 2;
    }

    public Double getPesoCarne() {
        return pesoCarne;
    }

    public void setPesoCarne(Double pesoCarne) {
        this.pesoCarne = pesoCarne;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }

    @Override
    public void printPortata() {
        System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                + " \n  peso della carne: " + getPesoCarne() + "g \n");
    }


}

