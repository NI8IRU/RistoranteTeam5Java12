package portate;

public class PrimoPiatto extends Portata {
    private Integer kcalPerEtto;
    private static int ordinatore = 1;

    public PrimoPiatto(String nome, Double prezzo, Integer kcalPerEtto) {
        super(nome, prezzo);
        this.kcalPerEtto = kcalPerEtto;
    }
    public Integer getKcalPerEtto() {
        return kcalPerEtto;
    }
    public void setKcalPerEtto(Integer kcalPerEtto) {
        this.kcalPerEtto = kcalPerEtto;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }
}
