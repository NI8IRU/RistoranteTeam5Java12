import Portate.Bevande;
import Portate.Dolci;
import Portate.SecondiPiatti;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menù\n");
        System.out.println("PRIMI PIATTI");
//Inserire portate
        System.out.println(" ");
        System.out.println("SECONDI PIATTI");

        SecondiPiatti involtini = new SecondiPiatti("Involtini di Verza ripieni di manzo",12.00f);
        SecondiPiatti angus = new SecondiPiatti("Filetto di angus in crosta di sfoglia",14.00f);
        SecondiPiatti polpette = new SecondiPiatti("Polpette al sugo",10.00f);
        SecondiPiatti maiale = new SecondiPiatti("Filetto di maiale al forno con salvia e patate",14.00f);
        SecondiPiatti pollo = new SecondiPiatti("Pollo alla cacciatora",13.00f);

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
//Inserire portate
        System.out.println(" ");
        System.out.println("DOLCI");

        Dolci mousse = new Dolci("Mousse ai frutti di bosco" , 3.50);
        Dolci souffle = new Dolci ("Soufflé di mango con crema di cocco e lime" , 3.70);
        Dolci tiramisu = new Dolci ("Tiramisù" , 3.99 );
        Dolci torta = new Dolci ("Torta di mele ", 6.69 );
        Dolci tortino = new Dolci("Tortino al cioccolato ", 3.40 );
        Dolci delizia = new Dolci( "Delizia al limone" , 4.80);
        Dolci novita = new Dolci("Cheesecake ai kinder cereali ", 5.65);

        System.out.println( mousse + "\n" + souffle + "\n"
                + tiramisu + "\n" + torta +"\n"
                + tortino + "\n" + delizia
                + "\n -- NOVITA' -- " + novita

        );

//Inserire portate
        System.out.println(" ");
        System.out.println("BEVANDE");
        Bevande acquaGassata = new Bevande("Acqua Gassata", 1.99);
        Bevande cocaCola = new Bevande("Coca Cola", 3.99);
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
