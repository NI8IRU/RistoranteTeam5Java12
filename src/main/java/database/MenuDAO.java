package database;

import enumeration.TipoEnum;
import ristorante.Menu;
import java.sql.*;
import java.util.ArrayList;

/**
 * La classe MenuDAO gestisce le operazioni di accesso al database per gli oggetti di tipo Menu.
 */
public class MenuDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    private final PrimoPiattoDAO primoPiattoDAO;
    private final SecondoPiattoDAO secondoPiattoDAO;
    private final DolceDAO dolceDAO;
    private final BevandaDAO bevandaDAO;

    /**
     * Costruttore della classe MenuDAO che inizializza le istanze delle classi DAO per le diverse tipologie di portate.
     */
    public MenuDAO() {
        primoPiattoDAO = new PrimoPiattoDAO();
        secondoPiattoDAO = new SecondoPiattoDAO();
        dolceDAO = new DolceDAO();
        bevandaDAO = new BevandaDAO();
    }

    /**
     * Restituisce tutti i menu presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti Menu presenti nel database
     */
    public ArrayList<Menu> allMenus() {
        ArrayList<Menu> menus = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM menu");
            while (rs.next()) {
                Menu menu = new Menu(rs.getString("NOME"), tipoMenu(rs));
                menu.setId(rs.getInt("ID"));
                menu.addPortata(primoPiattoDAO.findById(rs.getInt("ID_PRIMO")));
                menu.addPortata(secondoPiattoDAO.findById(rs.getInt("ID_SECONDO")));
                menu.addPortata(dolceDAO.findById(rs.getInt("ID_DOLCE")));
                menu.addPortata(bevandaDAO.findById(rs.getInt("ID_BEVANDA")));
                menu.addPortata(bevandaDAO.findById(rs.getInt("ACQUA")));
                menus.add(menu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menus;
    }

    /**
     * Restituisce il tipo di menu a partire dal ResultSet.
     *
     * @param rs il ResultSet contenente i dati del menu
     * @return il tipo di menu corrispondente
     * @throws SQLException se si verifica un errore durante l'accesso ai dati nel ResultSet
     */
    private TipoEnum tipoMenu(ResultSet rs) throws SQLException {
        return switch (rs.getString("TIPO_MENU")) {
            case "Carnivoro" -> TipoEnum.CARNIVORO;
            case "Pesce" -> TipoEnum.PESCE;
            case "Vegetariano" -> TipoEnum.VEGETARIANO;
            default -> TipoEnum.ALL;
        };
    }
}
