import portate.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("RistoranteTeam5", TipoRistorante.RISTORANTE);


        //Sezione Secondi
        SecondoPiatto involtini = new SecondoPiatto("Involtini di Verza ripieni di manzo",12.00,125.00);
        menu.addSecondo(involtini);
        SecondoPiatto angus = new SecondoPiatto("Filetto di angus in crosta di sfoglia",14.00,150.00);
        menu.addSecondo(angus);
        SecondoPiatto polpette = new SecondoPiatto("Polpette al sugo",10.00,139.00);
        menu.addSecondo(polpette);
        SecondoPiatto maiale = new SecondoPiatto("Filetto di maiale al forno con salvia e patate",14.00,150.00);
        menu.addSecondo(maiale);
        SecondoPiatto pollo = new SecondoPiatto("Pollo alla cacciatora",13.00,130.00);
        menu.addSecondo(pollo);

        System.out.println("\nSecondi Piatti");
        for (SecondoPiatto secondo : menu.getSecondi()) {
            secondo.printSecondi();
        }

        //Sezione Dolci
        Dolce mousse = new Dolce("Mousse ai frutti di bosco", 3.50, "15g");
        menu.addDolci(mousse);
        Dolce souffle = new Dolce("Soufflé di mango con crema di cocco e lime", 3.70, "20g");
        menu.addDolci(souffle);
        Dolce tiramisu = new Dolce("Tiramisù", 3.99, "25g");
        menu.addDolci(tiramisu);
        Dolce torta = new Dolce("Torta di mele", 6.69, "34g");
        menu.addDolci(torta);
        Dolce tortino = new Dolce("Tortino al cioccolato", 3.40, "16g");
        menu.addDolci(tortino);
        Dolce delizia = new Dolce("Delizia al limone", 4.80, "10g");
        menu.addDolci(delizia);
        Dolce novita = new Dolce("Cheesecake ai kinder cereali", 5.65, "79g");
        menu.addDolci(novita);

        System.out.println("\nDolci");
        for (Dolce dolce : menu.getDolci()) {
            dolce.printDolci();
        }


        //Sezione Bevande
        Bevanda acquaNaturale = new Bevanda("Acqua Naturale", 1.99, 0.0);
        menu.addBevanda(acquaNaturale);
        Bevanda acquaGassata = new Bevanda("Acqua Gassata", 1.99, 0.0);
        menu.addBevanda(acquaGassata);
        Bevanda cocaCola = new Bevanda("Coca Cola", 3.99, 0.0);
        menu.addBevanda(cocaCola);
        Bevanda birra = new Bevanda("Birra", 2.99, 4.9);
        menu.addBevanda(birra);
        Bevanda vino = new Bevanda("Vino", 10.00, 12.0);
        menu.addBevanda(vino);
        Bevanda amaro = new Bevanda("Amaro", 3.99, 22.0);
        menu.addBevanda(amaro);

        System.out.println("\nBevande");
        for (Bevanda bevanda : menu.getBevande()) {
            bevanda.printBevanda();
        }


    }
}
