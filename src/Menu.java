import portate.*;

import java.util.ArrayList;

public class Menu {
    private String nome;


    private ArrayList<Bevanda> bevande;

    //array x la classe Dolce
    private ArrayList<Dolce> dolci;

    public Menu(String nome, Integer tipo) {
        this.nome = nome;
        this.bevande = new ArrayList<>();
        this.dolci = new ArrayList<>();
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
