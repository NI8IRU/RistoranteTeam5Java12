import classiPadreEdEnum.TipoRistoranteEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.PrimoPiatto;
import portate.SecondoPiatto;

public class Main {

    public static void main(String[] args) {
        //modificato --> Fab!
        Menu menu = new Menu("Test", TipoRistoranteEnum.CARNIVORO);

        PrimoPiatto garganelli = new PrimoPiatto("Garganelli con asparagi e prosciutto crudo", 14.50, 265);
        PrimoPiatto risottoAsparagiESpeck = new PrimoPiatto("Risotto asparagi e speck", 12.69, 300);
        PrimoPiatto lasagnaAllaBolognese = new PrimoPiatto("Lasagna alla Bolognese", 17.80, 336);


        SecondoPiatto lonzaDiMaiale = new SecondoPiatto("Lonza di maiale in agrodolce con mele e prugne", 15.5, 150.0);
        SecondoPiatto costolette = new SecondoPiatto("Costolette d’agnello panate con carciofi e pecorino", 17.63, 100.0);
        SecondoPiatto polloEMandorle = new SecondoPiatto("Pollo alle mandorle", 16.5, 125.0);

        Dolce mousse = new Dolce("Mousse ai frutti di bosco", 5.5, "15");
        Dolce souffle = new Dolce("Soufflé di mango con crema di cocco e lime", 4.49, "19");
        Dolce tiramisu = new Dolce("Tiramisù", 6.99, "15");


        Bevanda acqua = new Bevanda("Acqua", 2.0, 0.0);
        Bevanda cocaCola = new Bevanda("Coca cola", 4.0, 0.0);
        Bevanda birra = new Bevanda("Birra", 3.0, 4.75);

        menu.addPortata(mousse);
        menu.addPortata(souffle);
        menu.addPortata(tiramisu);

        menu.addPortata(garganelli);
        menu.addPortata(lasagnaAllaBolognese);
        menu.addPortata(risottoAsparagiESpeck);

        menu.addPortata(costolette);
        menu.addPortata(polloEMandorle);
        menu.addPortata(lonzaDiMaiale);

        menu.addPortata(cocaCola);
        menu.addPortata(acqua);
        menu.addPortata(birra);

        menu.printMenu();

    }
}
