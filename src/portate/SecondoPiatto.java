package portate;

public class SecondoPiatto extends Portata {
    private Double pesoCarne;
    private static int ordinatore = 2;

    public SecondoPiatto(String nome, Double prezzo, Double pesoCarne) {
        super(nome, prezzo);
        this.pesoCarne = pesoCarne;
    }
    public Double getPesoCarne() {
        return pesoCarne;
    }
    public void setPesoCarne(Double pesoCarne){
        this.pesoCarne=pesoCarne;
    }

    @Override
    public int getOrdinatore() {
        return ordinatore;
    }
}

