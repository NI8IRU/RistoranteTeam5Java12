import database.BevandaDAO;
import database.DolceDAO;
import database.PrimoPiattoDAO;
import database.SecondoPiattoDAO;
import enumeration.StelleRistoranteEnum;
import enumeration.TipoEnum;
import ristorante.Indirizzo;
import ristorante.Menu;
import ristorante.Ristorante;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Team5 Restaurant", "Mario Astori",
                StelleRistoranteEnum.DUE_STELLE, new Indirizzo("Via Genova Thaon di Revel",
                "Milano", 3, 20159, "Milano", ""));

        Menu menuCarne = new Menu("Fragranza Carnivora", TipoEnum.CARNIVORO);
        menuCarne.addPortata(new PrimoPiattoDAO().findById(2));
        menuCarne.addPortata(new SecondoPiattoDAO().findById(3));
        menuCarne.addPortata(new DolceDAO().findById(3));
        menuCarne.addPortata(new DolceDAO().findById(5));
        menuCarne.addPortata(new BevandaDAO().findById(1));
        menuCarne.addPortata(new BevandaDAO().findById(6));

        Menu menuCarne2 = new Menu("I Sapori del Bracconiere", TipoEnum.CARNIVORO);
        menuCarne2.addPortata(new PrimoPiattoDAO().findById(1));
        menuCarne2.addPortata(new SecondoPiattoDAO().findById(2));
        menuCarne2.addPortata(new DolceDAO().findById(1));
        menuCarne2.addPortata(new BevandaDAO().findById(2));
        menuCarne2.addPortata(new BevandaDAO().findById(5));

        Menu menuPesce = new Menu("Fantasie di Mare", TipoEnum.PESCE);
        menuPesce.addPortata(new PrimoPiattoDAO().findById(6));
        menuPesce.addPortata(new SecondoPiattoDAO().findById(5));
        menuPesce.addPortata(new DolceDAO().findById(9));
        menuPesce.addPortata(new BevandaDAO().findById(1));
        menuPesce.addPortata(new BevandaDAO().findById(3));

        Menu menuPesce2 = new Menu("Viaggio Marino", TipoEnum.PESCE);
        menuPesce2.addPortata(new PrimoPiattoDAO().findById(4));
        menuPesce2.addPortata(new SecondoPiattoDAO().findById(5));
        menuPesce2.addPortata(new DolceDAO().findById(6));
        menuPesce2.addPortata(new BevandaDAO().findById(2));
        menuPesce2.addPortata(new BevandaDAO().findById(5));

        Menu menuVeggi = new Menu("Il Verde Gusto", TipoEnum.VEGETARIANO);
        menuVeggi.addPortata(new PrimoPiattoDAO().findById(9));
        menuVeggi.addPortata(new SecondoPiattoDAO().findById(8));
        menuVeggi.addPortata(new DolceDAO().findById(8));
        menuVeggi.addPortata(new BevandaDAO().findById(4));

        Menu menuVeggi2 = new Menu("Giardino delle Delizie", TipoEnum.VEGETARIANO);
        menuVeggi2.addPortata(new PrimoPiattoDAO().findById(7));
        menuVeggi2.addPortata(new SecondoPiattoDAO().findById(9));
        menuVeggi2.addPortata(new DolceDAO().findById(7));
        menuVeggi2.addPortata(new BevandaDAO().findById(6));

        ristorante.addMenu(menuCarne);
        ristorante.addMenu(menuCarne2);
        ristorante.addMenu(menuPesce);
        ristorante.addMenu(menuPesce2);
        ristorante.addMenu(menuVeggi);
        ristorante.addMenu(menuVeggi2);

        ristorante.printMenuTipoScelto(TipoEnum.PESCE);
    }
}
