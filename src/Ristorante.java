import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ristorante {
    private String nome;
    private String chef;
    private String stelleRistorante;
    private Indirizzo indirizzo;
    private final List<Menu> menus;

    public Ristorante(String nome,String chef, String stelleRistorante, Indirizzo indirizzo) {
        this.nome = nome;
        this.chef=chef;
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

    public String getStelleRistorante() {
        return stelleRistorante;
    }

    public void setStelleRistorante(String stelleRistorante) {
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
    public void printOrdinazione() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNome());
        System.out.println("A cura dello chef stellato : "+getChef());
        this.indirizzo.printIndirizzo();

        for (Menu menu : menus) {
            menu.printMenu(menu.getTipo());
        }
    }
}