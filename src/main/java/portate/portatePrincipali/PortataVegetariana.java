package portate.portatePrincipali;


import enumertion.TipoEnum;

public class PortataVegetariana extends PortataPrimaPos {
    private final TipoEnum tipoEnum;
    public PortataVegetariana(String nome, Double prezzo, Integer pesoPiatto) {
        super(nome, prezzo, pesoPiatto);
        this.tipoEnum = TipoEnum.VEGETARIANO;
    }

    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    @Override
    public void printPortata() {

        System.out.println(" " + getNome() + ": " + getPrezzo() + "€\n  " +
                "Peso del piatto vegan: " + getPesoPiatto() + "g\n");
    }
}
