import enumertion.ColorEnum;
import enumertion.StelleRistoranteEnum;
import enumertion.TipoEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.PrimoPiatto;
import portate.SecondoPiatto;

public class Main {

    public static void main(String[] args) {

        //Menù test
        PrimoPiatto primoPiatto = new PrimoPiatto("Primo Piatto", 4.5, 23, TipoEnum.CARNIVORO);
        SecondoPiatto secondoPiatto = new SecondoPiatto("Secondo Piatto", 5.2, 2.4, TipoEnum.ALL);
        Dolce dolce = new Dolce("Dolce", 4.0, 30.0);
        Bevanda bevanda = new Bevanda("Bevanda", 2.0, 0.0);

        Menu menuCarne = new Menu("Menù Carnivoro", TipoEnum.CARNIVORO);

        menuCarne.addPortata(dolce);
        menuCarne.addPortata(bevanda);
        menuCarne.addPortata(secondoPiatto);
        menuCarne.addPortata(primoPiatto);

        //Chiamata del ristorante
        Ristorante ristorante = new Ristorante("Team5 Restaurant", "Mario Astori",
                StelleRistoranteEnum.DUE_STELLE, new Indirizzo("Via Genova Thaon di Revel",
                "Milano", 3, 20159, "Milano", ""));

        ristorante.addMenu(menuCarne);
        ristorante.printMenuScelto(ColorEnum.BG_BIANCO);

        DataBaseConnection.init();

    }
}
