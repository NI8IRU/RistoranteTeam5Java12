package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoRistoranteEnum;

public class SecondoPiatto extends Portata {

    private TipoRistoranteEnum tipo;

    private Double pesoPiatto;
    private final int ordinatore;

    public SecondoPiatto(String nome, Double prezzo, Double pesoPiatto, TipoRistoranteEnum tipo) {
        super(nome, prezzo);
        this.pesoPiatto = pesoPiatto;
        //dato il valore dell'enum
        this.ordinatore = OrdinatoreEnum.SECONDA_POSIZIONE.getPosizionePortataSulMenu();
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


    //Funzione che stampa in modo diverso in base al tipo del menù
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

