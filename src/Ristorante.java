import enumertion.StelleRistorante;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String nome;
    private String chef;

    private StelleRistorante stelleRistorante;
    private Indirizzo indirizzo;
    private final List<Menu> menus;

    public Ristorante(String nome,String chef, StelleRistorante stelleRistorante, Indirizzo indirizzo) {
        this.nome = nome;
        this.chef = chef;
        this.stelleRistorante = stelleRistorante;
        this.indirizzo = indirizzo;
        this.menus = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChef(){
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public StelleRistorante getStelleRistorante() {
        return stelleRistorante;
    }

    public void setStelleRistorante(StelleRistorante stelleRistorante) {
        this.stelleRistorante = stelleRistorante;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu){
        this.menus.add(menu);
    }

    public void removeMenu(Menu menu){
        this.menus.remove(menu);
    }

    //Corretta la funzione printOrdinazione, adesso stampa tutti i menù nella lista attraverso un ciclo for
    public void printMenuScelto(Menu menu) {
        System.out.println(getNome() + " " + getStelleRistorante().getVisual());
        System.out.println("A cura dello chef stellato : "+getChef());
        this.indirizzo.printIndirizzo();
        menu.printMenu(menu.getTipo().getColore());
    }
}
