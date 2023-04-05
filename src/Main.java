import portate.Bevande;
import portate.Dolci;
import portate.SecondiPiatti;
import portate.Pizze;
import portate.PrimiPiatti;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menù\n");
        System.out.println("PRIMI PIATTI");

        PrimiPiatti carbonara = new PrimiPiatti("Carbonara", 12.00);
        PrimiPiatti pappardelle = new PrimiPiatti("Pappardelle al ragù di cinghiale", 13.50);
        PrimiPiatti trofie = new PrimiPiatti("Trofie al pesto", 13.50);
        PrimiPiatti penne = new PrimiPiatti("Penne all'arrabbiata", 11.00);
        PrimiPiatti risotto = new PrimiPiatti("Risotto alla crema di scampi", 16.00);

        System.out.println(carbonara + "\n" + pappardelle + "\n" + trofie +
                "\n" + penne + "\n" + risotto);

        System.out.println(" ");
        System.out.println("SECONDI PIATTI");

        SecondiPiatti involtini = new SecondiPiatti("Involtini di Verza ripieni di manzo", 12.00f);
        SecondiPiatti angus = new SecondiPiatti("Filetto di angus in crosta di sfoglia", 14.00f);
        SecondiPiatti polpette = new SecondiPiatti("Polpette al sugo", 10.00f);
        SecondiPiatti maiale = new SecondiPiatti("Filetto di maiale al forno con salvia e patate", 14.00f);
        SecondiPiatti pollo = new SecondiPiatti("Pollo alla cacciatora", 13.00f);

        System.out.println(
                involtini + "\n"
                        + angus + "\n"
                        + polpette + "\n"
                        + maiale + "\n"
                        + pollo
        );


//Inserire portate
        System.out.println(" ");
        System.out.println("PIZZE");

        Pizze margherita = new Pizze("Margherita", 4);
        Pizze marinara = new Pizze("Marinara", 3.5);
        Pizze diavola = new Pizze("Diavola", 5);
        Pizze capricciosa = new Pizze("Capricciosa", 5);
        Pizze quattroFormaggi = new Pizze("Quattro Formaggi", 6);
        Pizze scamorzaESpeck = new Pizze("Scamorza e Speck", 7);
        Pizze pizzaKebab = new Pizze("Pizza Kebab", 7);

        System.out.println(margherita + "\n" + marinara + "\n" + diavola + "\n"
                + capricciosa + "\n" + quattroFormaggi + "\n" + scamorzaESpeck + "\n" + pizzaKebab
        );


//Inserire portate
        System.out.println(" ");
        System.out.println("DOLCI");

        Dolci mousse = new Dolci("Mousse ai frutti di bosco", 3.50);
        Dolci souffle = new Dolci("Soufflé di mango con crema di cocco e lime", 3.70);
        Dolci tiramisu = new Dolci("Tiramisù", 3.99);
        Dolci torta = new Dolci("Torta di mele ", 6.69);
        Dolci tortino = new Dolci("Tortino al cioccolato ", 3.40);
        Dolci delizia = new Dolci("Delizia al limone", 4.80);
        Dolci novita = new Dolci("Cheesecake ai kinder cereali ", 5.65);

        System.out.println(mousse + "\n" + souffle + "\n"
                + tiramisu + "\n" + torta + "\n"
                + tortino + "\n" + delizia
                + "\n -- NOVITA' -- " + novita

        );

//Inserire portate
        System.out.println(" ");
        System.out.println("BEVANDE");
        Bevande acquaGassata = new Bevande("Acqua Gassata", 1.99,0.0);
        Bevande cocaCola = new Bevande("Coca Cola", 3.99,0.0);
        Bevande birra = new Bevande("Birra", 2.99, 4.9);
        Bevande vino = new Bevande("Vino", 10.00, 12.8);
        Bevande amaro = new Bevande("Amaro", 2.99, 20.00);
        System.out.println(
                acquaGassata + "\n"
                        + cocaCola + "\n"
                        + birra + "\n"
                        + vino + "\n"
                        + amaro
        );
        System.out.println(" ");
    }
}
