import portate.Bevande;
import portate.Dolci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ristorante {
    private String nome;
    private String tipo;
    //Primi Piatti

    //Secondi Piatti

    //Pizze

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

        System.out.println("\nSECONDI PIATTI");

        System.out.println("\nPIZZE");

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
