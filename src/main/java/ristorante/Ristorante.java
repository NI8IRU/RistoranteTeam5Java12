package ristorante;

import enumeration.StelleRistoranteEnum;
import enumeration.TipoEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Creazione: 27/04/2023
 * Classe che serve per definire il nome del ristorante,
 * il nome dello chef, il numero di stelle presenti, l'indirizzo
 * e la lista dei menù
 */
public class Ristorante {
    private String nome;
    private String chef;

    private StelleRistoranteEnum stelleRistorante;
    private Indirizzo indirizzo;

    /**
     * Lista dei menù di tipo Menu, servirà per aggiungere i menù
     * con annesso il loro tipo e le loro portate
     */
    private final List<Menu> menus;

    /**
     *
     * @param nome nome del ristorante
     * @param chef nome dello chef
     * @param stelleRistorante numero di stelle presenti prese dall'enum 'StelleRistoranteEnum'
     * @param indirizzo indirizzo del ristorante
     */
    public Ristorante(String nome, String chef, StelleRistoranteEnum stelleRistorante, Indirizzo indirizzo) {
        this.nome = nome;
        this.chef = chef;
        this.stelleRistorante = stelleRistorante;
        this.indirizzo = indirizzo;
        this.menus = new ArrayList<>();
    }

    /**
     *
     * @return il nome del ristorante
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return il nome dello chef
     */
    public String getChef(){
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    /**
     *
     * @return il numero di stelle del ristorante
     */
    public StelleRistoranteEnum getStelleRistorante() {
        return stelleRistorante;
    }

    public void setStelleRistorante(StelleRistoranteEnum stelleRistorante) {
        this.stelleRistorante = stelleRistorante;
    }

    /**
     *
     * @return l'indirizzo del ristorante
     */
    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     *
     * @return la lista dei menù
     */

    public List<Menu> getMenus() {
        return menus;
    }

    /**
     * Metodo che prende in entrata un oggetto di tipo Menu per poi aggiungerlo
     * alla lista 'menus' (che è dello stesso tipo)
     *
     * @param menu parametro di tipo Menu
     */

    public void addMenu(Menu menu){
        this.menus.add(menu);
    }

    /**
     * Metodo che prende in entrata un oggetto di tipo Menu
     * per poi rimuoverlo dalla lista 'menus' (che è dello stesso tipo)
     *
     * @param menu parametro di tipo Menu
     */
    public void removeMenu(Menu menu){
        this.menus.remove(menu);
    }

    /**
     * Metodo che prende in entrata un 'TipoEnum'
     * per stampare il TIPO di menù desiderato (Carnivoro, Vegetariano, Pesce)-
     * stamperà poi, attraverso un ciclo for-each tutti i menù corrispondenti al parametro in entrata!
     * Prima di ciò stamperà anche il nome del ristorante, le stelle che ha (più l'annessa descrizione),
     * il nome dello chef e l'indirizzo
     * (che verrà stampato richiamando la funzione
     * 'printIndirizzo' presente nel record 'Indirizzo')
     *
     * @param tipoEnum parametro di tipo 'TipoEnum' che servirà per stampare il TIPO di menù desiderato!
     */
    public void printMenuTipoScelto(TipoEnum tipoEnum) {
        System.out.println(getNome() + " " + getStelleRistorante().getVisual() + "\n"
                + getStelleRistorante().getDescrizione());
        System.out.println("A cura dello chef stellato : "+getChef());
        this.indirizzo.printIndirizzo();
        for (Menu menu: menus) {
            if (menu.getTipo() == tipoEnum) menu.printMenu();
        }

    }
}