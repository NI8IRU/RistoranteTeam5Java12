import enumertion.TipoRistoranteEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.PrimoPiatto;
import portate.SecondoPiatto;

public class Main {

    public static void main(String[] args) {

        //Menù a base di carne
        Menu menuCarne = new Menu("Fragranza Carnivora", TipoRistoranteEnum.CARNIVORO);

        PrimoPiatto garganelli = new PrimoPiatto("Garganelli con asparagi e prosciutto crudo", 14.50, 265);
        PrimoPiatto risottoAsparagiESpeck = new PrimoPiatto("Risotto asparagi e speck", 12.69, 300);
        PrimoPiatto lasagnaAllaBolognese = new PrimoPiatto("Lasagna alla Bolognese", 17.80, 336);
        SecondoPiatto lonzaDiMaiale = new SecondoPiatto("Lonza di maiale in agrodolce con mele e prugne", 15.5, 150.0, TipoRistoranteEnum.CARNIVORO);
        SecondoPiatto costolette = new SecondoPiatto("Costolette d’agnello panate con carciofi e pecorino", 17.63, 100.0, TipoRistoranteEnum.CARNIVORO);
        SecondoPiatto polloEMandorle = new SecondoPiatto("Pollo alle mandorle", 16.5, 125.0, TipoRistoranteEnum.CARNIVORO);
        Dolce mousse = new Dolce("Mousse ai frutti di bosco", 5.5, "15");
        Dolce souffle = new Dolce("Soufflé di mango con crema di cocco e lime", 4.49, "19");
        Dolce tiramisu = new Dolce("Tiramisù", 6.99, "15");
        Bevanda acquaMinerale = new Bevanda("Acqua minerale naturale o frizzante",2.00,0.0);
        Bevanda cocaCola = new Bevanda("Coca cola", 4.0, 0.0);
        Bevanda birra = new Bevanda("Birra", 3.0, 4.75);

        menuCarne.addPortata(mousse);
        menuCarne.addPortata(souffle);
        menuCarne.addPortata(tiramisu);
        menuCarne.addPortata(garganelli);
        menuCarne.addPortata(lasagnaAllaBolognese);
        menuCarne.addPortata(risottoAsparagiESpeck);
        menuCarne.addPortata(costolette);
        menuCarne.addPortata(polloEMandorle);
        menuCarne.addPortata(lonzaDiMaiale);
        menuCarne.addPortata(cocaCola);
        menuCarne.addPortata(acquaMinerale);
        menuCarne.addPortata(birra);

        //Menù a base di pesce
        Menu menuPesce = new Menu("Fantasie di Mare",TipoRistoranteEnum.PESCE);

        PrimoPiatto linguine =new PrimoPiatto("Linguine ai frutti di mare freschi",15.00,480);
        PrimoPiatto risotto =new PrimoPiatto("Risotto Venere con zucchine e gamberi",13.00,137);
        PrimoPiatto paccheri=new PrimoPiatto("Paccheri al sugo di calamari",14.00,370);
        SecondoPiatto orata = new SecondoPiatto("Orata al cartoccio",16.50,450.0, TipoRistoranteEnum.PESCE);
        SecondoPiatto involtiniSpada = new SecondoPiatto("Involtini di pesce spada e melanzane",13.50,200.0,TipoRistoranteEnum.PESCE);
        SecondoPiatto filettoCernia = new SecondoPiatto("Filetto di cernia alla Mediterranea", 18.00,500.0, TipoRistoranteEnum.PESCE);
        Dolce sorbetto = new Dolce("Sorbetto al limone e menta fresca",4.50,"12");
        Dolce sbriciolata= new Dolce("Sbriciolata alle fragole",5.00,"18");
        Dolce pannaCaffe= new Dolce("Panna cotta al caffè e cioccolato",5.00,"15");
        Bevanda vinoChard = new Bevanda("Vino bianco Chardonnay del Salento ",13.00,13.0);
        Bevanda limonata = new Bevanda("Aperitivo analcolico al limone",3.50,0.0);

        menuPesce.addPortata(linguine);
        menuPesce.addPortata(risotto);
        menuPesce.addPortata(paccheri);
        menuPesce.addPortata(orata);
        menuPesce.addPortata(involtiniSpada);
        menuPesce.addPortata(filettoCernia);
        menuPesce.addPortata(sorbetto);
        menuPesce.addPortata(sbriciolata);
        menuPesce.addPortata(pannaCaffe);
        menuPesce.addPortata(vinoChard);
        menuPesce.addPortata(acquaMinerale);
        menuPesce.addPortata(limonata);


        //Menù vegetariano
        Menu menuVeggi = new Menu("Il Verde Gusto", TipoRistoranteEnum.VEGETARIANO);

        PrimoPiatto tagliatelle = new PrimoPiatto("Tagliatelle all’ uovo con verdure scottate in salsa di soia", 12.00, 285);
        PrimoPiatto orecchiette = new PrimoPiatto("Orecchiette con porcini e ricotta affumicata", 13.50, 340);
        PrimoPiatto ravioli = new PrimoPiatto("Ravioli fritti ripieni con squacquerone ed erbette", 12.50, 410);
        SecondoPiatto lenticchie = new SecondoPiatto("Lenticchie condite con latte di cocco", 10.00, 150.0, TipoRistoranteEnum.VEGETARIANO);
        SecondoPiatto purea = new SecondoPiatto("Crema di patate allo zafferano", 9.50, 140.0, TipoRistoranteEnum.VEGETARIANO);
        SecondoPiatto verdureCotte = new SecondoPiatto("Verdure cotte di stagione coperte con formaggio fresco", 12.00, 190.0,TipoRistoranteEnum.VEGETARIANO);
        Dolce torta = new Dolce("Torta al latte di cocco e cioccolato fondente", 5.50, "15");
        Dolce crostata = new Dolce("Crostata vegan alle mele caramellate", 4.50, "13");
        Dolce sfogliatine = new Dolce("Sfogliatine di pere e marmellata", 4.00, "11");
        Bevanda gazzosa = new Bevanda("Gazzosa", 3.50, 0.0);

        menuVeggi.addPortata(tagliatelle);
        menuVeggi.addPortata(orecchiette);
        menuVeggi.addPortata(ravioli);
        menuVeggi.addPortata(lenticchie);
        menuVeggi.addPortata(purea);
        menuVeggi.addPortata(verdureCotte);
        menuVeggi.addPortata(torta);
        menuVeggi.addPortata(crostata);
        menuVeggi.addPortata(sfogliatine);
        menuVeggi.addPortata(acquaMinerale);
        menuVeggi.addPortata(gazzosa);
        menuVeggi.addPortata(birra);

        //Chiamata del ristorante
        Ristorante ristorante = new Ristorante("Team5 Restaurant", "1", new Indirizzo("Via Genova Thaon di Revel", "Milano", 3, 20159, "Milano", ""));

        ristorante.addMenu(menuCarne);
        ristorante.addMenu(menuPesce);
        ristorante.addMenu(menuVeggi);

        ristorante.printOrdinazione();
    }
}
