import portate.*;

import java.util.ArrayList;

public class Menu {
    private String nome;
    private TipoRistorante tipoRistorante;

    private ArrayList<Bevanda> bevande;

    private ArrayList<SecondoPiatto> secondi;

    //array x la classe Dolce
    private ArrayList<Dolce> dolci;

    public Menu(String nome, TipoRistorante tipoRistorante) {
        this.nome = nome;
        this.bevande = new ArrayList<>();
        this.dolci = new ArrayList<>();
        this.secondi = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bevanda> getBevande() {
        return this.bevande;
    }

    public void addBevanda(Bevanda bevande) {
        this.bevande.add(bevande);
    }

    public void removeBevanda(Bevanda bevande) {
        this.bevande.remove(bevande);
    }

    public ArrayList<SecondoPiatto> getSecondi() {
        return secondi;
    }
    public void addSecondo(SecondoPiatto secondi){this.secondi.add(secondi);}
    public void removeSecondo(SecondoPiatto secondi){this.secondi.remove(secondi);}


    public void addDolci(Dolce dolci) {
        this.dolci.add(dolci);
    }

    public void removeDolci(Dolce dolci) {
        this.dolci.remove(dolci);
    }

    //getter per l'array dolci
    public ArrayList<Dolce> getDolci() {
        return this.dolci;
    }


}
