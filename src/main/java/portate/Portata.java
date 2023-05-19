package portate;

import enumertion.OrdinatoreEnum;
import enumertion.TipoEnum;

public abstract class Portata {
    private String nome;
    private Double prezzo;
    private TipoEnum tipoEnum;

    private OrdinatoreEnum ordinatore;

    public Portata(String nome, Double prezzo,OrdinatoreEnum ordinatore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ordinatore = ordinatore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public OrdinatoreEnum getOrdinatore(){
        return ordinatore;
    };

    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    public void printPortata() {
        System.out.println("  " + nome + ": " + prezzo + "€");
    }


}