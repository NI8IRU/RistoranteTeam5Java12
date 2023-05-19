package portate.portatePrincipali;

import enumertion.TipoEnum;

public class PortataCarne extends PortataPrimaPos {
    private final TipoEnum tipoEnum;
    public PortataCarne(String nome, Double prezzo, Integer pesoPiatto) {
        super(nome, prezzo, pesoPiatto);
        this.tipoEnum = TipoEnum.CARNIVORO;
    }

    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    @Override
    public void printPortata() {
        System.out.println("  " + getNome() + ": " + getPrezzo() + "€"
                + " \n  Grammatura della carne: " + getPesoPiatto() + "g\n");
    }
}
