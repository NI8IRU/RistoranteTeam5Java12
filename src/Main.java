import portate.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Ristorante", 1);

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
        for (Dolce dolce: menu.getDolci()) {
            dolce.printDolci();
        }


    }
}
