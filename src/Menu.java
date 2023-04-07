import portate.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private String nome;
    private String tipo;

    private ArrayList<Bevande> bevandes;

    public Menu(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.bevandes = new ArrayList<>();
    }

    //TODO sistemiamo il tutto con le liste e le liste le aggiungente dal main e non nella classe stessa
    public void printMenu() {
        System.out.println("MENÙ");
        System.out.println("\nPRIMI PIATTI");
        List<PrimiPiatti> primi = Array.aslist(carbonara, pappardelle, trofie, penne, risotto);
        for(PrimiPiatti portata : primi){
            portata.printPrimiPiatti();
        }

        System.out.println("\nSECONDI PIATTI");
        List<SecondiPiatti> Secondi =Arrays.asList(involtini,angus,polpette,maiale,pollo);
        for(SecondiPiatti i : Secondi){
            i.printSecondiPiatti();

        }

        System.out.println("\nPIZZE");
        List<Pizze> Pizze = Arrays.asList(margherita, marinara, diavola, capricciosa, quattroFormaggi, scamorzaESpeck,
                pizzaKebab, margheritaSenzaGlutine, margheritaSenzaLattosio, margheritaSenzaGlutineELattosio);
        for(Pizze numeroPizze : Pizze){
            numeroPizze.printPizza();
        }


        System.out.println("\nDOLCI");
        List<Dolci> dolci = Arrays.asList(mousse, souffle, tiramisu, torta, tortino, delizia, novita);
        for(Dolci portateDolci : dolci){
            portateDolci.printDolci();
        }


        System.out.println("\nBEVANDE");
        for(Bevande bevande : bevandes) {
            bevande.printBevande();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void addBevanda(Bevande bevande){
        bevandes.add(bevande);
    }

    public void removeBevanda(Bevande bevande){
        bevandes.remove(bevande);
    }
}
