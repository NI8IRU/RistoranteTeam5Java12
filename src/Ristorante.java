import portate.Bevande;
import portate.Dolci;
import portate.SecondiPiatti;
import portate.PrimiPiatti;
import portate.Pizze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ristorante {
    private String nome;
    private String tipo;
    //Primi Piatti
    private static final PrimiPiatti carbonara = new PrimiPiatti("Carbonara", 12.00);
    private static final PrimiPiatti pappardelle = new PrimiPiatti("Pappardelle al ragù di cinghiale", 13.50);
    private static final PrimiPiatti trofie = new PrimiPiatti("Trofie al pesto", 13.5);
    private static final PrimiPiatti penne = new PrimiPiatti("Penne all'arrabbiata", 11.0);
    private static final PrimiPiatti risotto = new PrimiPiatti("Risotto alla crema di scampi", 16.00);

    //Secondi Piatti
    private static final SecondiPiatti involtini = new SecondiPiatti("Involtini di Verza ripieni di manzo", 12.00,100);
    private static final SecondiPiatti angus = new SecondiPiatti("Filetto di angus in crosta di sfoglia", 14.00,140);
    private static final SecondiPiatti polpette = new SecondiPiatti("Polpette al sugo", 10.00,135);
    private static final SecondiPiatti maiale = new SecondiPiatti("Filetto di maiale al forno con salvia e patate", 14.00,130);
    private static final SecondiPiatti pollo = new SecondiPiatti("Pollo alla cacciatora", 13.00,130);
    //Pizze

    private static final Pizze margherita = new Pizze("Margherita", 4, true, true);
    private static final Pizze marinara = new Pizze("Marinara", 3.5,true, true);
    private static final Pizze diavola = new Pizze("Diavola", 5,true, true);
    private static final Pizze capricciosa = new Pizze("Capricciosa", 5,true, true);
    private static final Pizze quattroFormaggi = new Pizze("Quattro Formaggi", 6,true, true);
    private static final Pizze scamorzaESpeck = new Pizze("Scamorza e Speck", 7,true, true);
    private static final Pizze pizzaKebab = new Pizze("Pizza Kebab", 7,true, true);
    private static final Pizze margheritaSenzaLattosio = new Pizze("Margherita senza Lattosio", 5, true, false);
    private static final Pizze margheritaSenzaGlutine = new Pizze("Margherita senza Glutine", 5, false, true);
    private static final Pizze margheritaSenzaGlutineELattosio = new Pizze("Margherita senza Glutine e Lattosio", 6,false,false);

    //Dolci
    private static final Dolci mousse = new Dolci("Mousse ai frutti di bosco", 3.50, "15g");
    private static final Dolci souffle = new Dolci("Soufflé di mango con crema di cocco e lime", 3.70, "1.9g");
    private static final Dolci tiramisu = new Dolci("Tiramisù", 3.99, "15g");
    private static final Dolci torta = new Dolci("Torta di mele ", 6.69, "17g");
    private static final Dolci tortino = new Dolci("Tortino al cioccolato ", 3.40, "40g");
    private static final Dolci delizia = new Dolci("Delizia al limone", 4.80, "50g");
    private static final Dolci novita = new Dolci("Cheesecake ai kinder cereali ", 5.65, "94g");

    //Bevande
    private static final Bevande acquaGassata = new Bevande("Acqua Gassata", 1.99,0.0);
    private static final Bevande cocaCola = new Bevande("Coca Cola", 3.99,0.0);
    private static final Bevande birra = new Bevande("Birra", 2.99, 4.9);
    private static final Bevande vino = new Bevande("Vino", 10.00, 12.8);
    private static final Bevande amaro = new Bevande("Amaro", 2.99, 20.00);

    public Ristorante(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public static void printMenu() {
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
        List<Bevande> bevande = Arrays.asList(acquaGassata, cocaCola, birra, vino, amaro);
        for(Bevande i : bevande) {
            i.printBevande();
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
}
