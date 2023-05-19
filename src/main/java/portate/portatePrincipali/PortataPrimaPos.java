package portate.portatePrincipali;

import enumertion.OrdinatoreEnum;
import portate.Portata;


public abstract class PortataPrimaPos extends Portata {
    private Integer pesoPiatto;
    public PortataPrimaPos(String nome, Double prezzo, Integer pesoPiatto) {
        super(nome, prezzo, OrdinatoreEnum.PRIMA_POSIZIONE);
        this.pesoPiatto = pesoPiatto;
    }

    public Integer getPesoPiatto() {
        return pesoPiatto;
    }

    public void setPesoPiatto(Integer pesoPiatto) {
        this.pesoPiatto = pesoPiatto;
    }

}
