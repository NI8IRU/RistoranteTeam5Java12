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
        for(Bevanda bevanda : menu.getBevande()) {
            bevanda.printBevanda();
        }
    }
}
