package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

//cambiato nome- messo al singolare!
public class Dolce extends Portata {
    private Double perZuccheri;

    public Dolce(String nome, Double prezzo, Double perZuccheri) {

        super(nome, prezzo, TipoEnum.ALL, OrdinatoreEnum.TERZA_POSIZIONE);
        this.perZuccheri = perZuccheri;

    }

    public void setPerZuccheri(Double perZuccheri) {
        this.perZuccheri = perZuccheri;
    }

    public Double getPerZuccheri() {
        return perZuccheri;
    }
    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  zuccheri presenti al: " + getPerZuccheri() + "%\n");
    }
}
