package portate;

import enumertion.TipoRistoranteEnum;

public class SecondoPiatto extends Portata {

    private TipoRistoranteEnum tipo;

    private Double pesoPiatto;
    private final int ordinatore;

    public SecondoPiatto(String nome, Double prezzo, Double pesoPiatto, TipoRistoranteEnum tipo) {
        super(nome, prezzo);
        this.pesoPiatto = pesoPiatto;
        this.ordinatore = 2;
        this.tipo = tipo;
    }

    public Double getPesoPiatto() {
        return pesoPiatto;
    }

    public void setPesoPiatto(Double pesoPiatto) {
        this.pesoPiatto = pesoPiatto;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }


    //TODO è il posto giusto di mettere il tipo
    @Override
    public void printPortata() {

        switch (tipo) {
            case CARNIVORO -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                    + " \n  peso della carne: " + getPesoPiatto() + "g \n");
            case PESCE -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                    + " \n  peso del pesce: " + getPesoPiatto() + "g \n");
            case VEGETARIANO -> System.out.println("  " + super.getNome() + ": " + super.getPrezzo() + "€"
                    + " \n  grammatura dal piatto: " + getPesoPiatto() + "g \n");
        }

    }


}

