import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ristorante {
    private String nome;
    private String stelleRistorante;
    private Indirizzo indirizzo;
    private final List<Menu> menus;

    public Ristorante(String nome, String stelleRistorante, Indirizzo indirizzo) {
        this.nome = nome;
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

    public void printOrdinazione() {
        Scanner scanner = new Scanner(System.in);

        for (Menu menu : menus) {
            System.out.println(menu.getNome() + ": " + menu.calculatePrice() + "€");
            System.out.println(menu.getTipo().getDescrizione());
            System.out.println(" ");
        }
        boolean scelta = true;
        do {
            System.out.println("Quale menù desidera?");
            String input = scanner.next();

            for (Menu menu : menus) {
                if (menu.getNome().toLowerCase().contains(input.toLowerCase())) {
                    menu.printMenu();
                    scelta = false;
                }
            }
        }while (scelta);
    }
}
