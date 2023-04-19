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

        //aggiunto menu a base di pesce

        Menu menuPesce = new Menu("Fantasie di Mare",TipoRistoranteEnum.PESCE);

        PrimoPiatto linguine =new PrimoPiatto("Linguine ai frutti di mare freschi",15.00,480);
        PrimoPiatto risotto =new PrimoPiatto("Risotto Venere con zucchine e gamberi",13.00,137);
        PrimoPiatto paccheri=new PrimoPiatto("Paccheri al sugo di calamari",14.00,370);

        SecondoPiatto orata = new SecondoPiatto("Orata al cartoccio",16.50,450.0);
        SecondoPiatto involtiniSpada = new SecondoPiatto("Involtini di pesce spada e melanzane",13.50,200.0);
        SecondoPiatto filettoCernia = new SecondoPiatto("Filetto di cernia alla Mediterranea", 18.00,500.0);

        Dolce sorbetto = new Dolce("Sorbetto al limone e menta fresca",4.50,"12");
        Dolce sbriciolata= new Dolce("Sbriciolata alle fragole",5.00,"18");
        Dolce pannaCaffe= new Dolce("Panna cotta al caffè e cioccolato",5.00,"15");

        Bevanda vinoChard = new Bevanda("Vino bianco Chardonnay del Salento ",13.00,13.0);
        Bevanda acquaMinerale = new Bevanda("Acqua minerale naturale o frizzante",2.00,0.0);
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

        menuPesce.printMenu();




    }
}
