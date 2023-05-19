import enumertion.ColorEnum;
import enumertion.StelleRistoranteEnum;
import enumertion.TipoEnum;
import portate.Bevanda;
import portate.Dolce;
import portate.portatePrincipali.PortataCarne;

public class Main {

    public static void main(String[] args) {

        //Menù test
        PortataCarne portataCarne = new PortataCarne("Carne", 10.0, 200);
        Dolce dolce = new Dolce("Dolce", 4.0, 30.0);
        Bevanda bevanda = new Bevanda("Bevanda", 2.0, 0.0);

        Menu menuCarne = new Menu("Menù Carnivoro");
        menuCarne.addPortata(portataCarne);
        menuCarne.addPortata(dolce);
        menuCarne.addPortata(bevanda);

        //Chiamata del ristorante
        Ristorante ristorante = new Ristorante("Team5 Restaurant", "Mario Astori",
                StelleRistoranteEnum.DUE_STELLE, new Indirizzo("Via Genova Thaon di Revel",
                "Milano", 3, 20159, "Milano", ""));

        ristorante.addMenu(menuCarne);

        
        ristorante.printMenuScelto(ColorEnum.BG_VIOLA);

        DataBaseConnection.init();
    }
}
