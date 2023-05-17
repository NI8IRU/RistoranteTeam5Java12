package portate.portatePrincipali;


import enumertion.TipoEnum;

public class PortataPesce extends PortataPrimaPos {
    private final TipoEnum tipoEnum;
    public PortataPesce(String nome, Double prezzo, Integer pesoPiatto) {
        super(nome, prezzo, pesoPiatto);
        this.tipoEnum = TipoEnum.PESCE;
    }

    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    @Override
    public void printPortata() {

        System.out.println(" " + getNome() + ": " + getPrezzo() + "€\n  " +
                "Peso del pesce: " + getPesoPiatto() + "g\n");
    }


}

