import database.*;
import enumeration.StelleRistoranteEnum;
import enumeration.TipoEnum;
import ristorante.Indirizzo;
import ristorante.Menu;
import ristorante.Ristorante;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante("Team5 Restaurant", "Mario Astori",
                StelleRistoranteEnum.DUE_STELLE, new Indirizzo("Via Genova Thaon di Revel",
                "Milano", 3, 20159, "Milano", ""));

        MenuDAO menuDAO = new MenuDAO();
        ArrayList<Menu> menus = menuDAO.allMenus();
        for (Menu menu : menus) {
            ristorante.addMenu(menu);
        }
        ristorante.printMenuTipoScelto(TipoEnum.PESCE);
    }
}
