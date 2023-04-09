import portate.*;

import java.util.ArrayList;

public class Menu {
    private String nome;


    private ArrayList<Bevanda> bevande;

    public Menu(String nome, Integer tipo) {
        this.nome = nome;
        this.bevande = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bevanda> getBevande() {return this.bevande;}

    public void addBevanda(Bevanda bevande){
        this.bevande.add(bevande);
    }

    public void removeBevanda(Bevanda bevande){
        this.bevande.remove(bevande);
    }
}
