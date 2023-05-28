package portate;

import enumeration.OrdinatoreEnum;
import enumeration.TipoEnum;

public abstract class Portata {
    private int id;
    private String nome;
    private Double prezzo;
    private final TipoEnum tipoEnum;

    private final OrdinatoreEnum ordinatore;

    public Portata(String nome, Double prezzo, TipoEnum tipoEnum, OrdinatoreEnum ordinatore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoEnum = tipoEnum;
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
    }

    public TipoEnum getTipoEnum() {
        return tipoEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printPortata() {
        System.out.println("  " + nome + ": " + prezzo + "€");
    }


}