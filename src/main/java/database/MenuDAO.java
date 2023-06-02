package database;

import enumeration.TipoEnum;
import portate.Dolce;
import ristorante.Menu;
import java.sql.*;
import java.util.ArrayList;

/**
 * La classe MenuDAO gestisce le operazioni di accesso al database per gli oggetti di tipo Menu.
 */
public class MenuDAO implements InterfacciaDAO<Menu> {
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
     * Trova un Menù nel database dato il suo ID.
     *
     * @param id l'ID del Menù da trovare
     * @return Menù corrispondente all'ID, o null se non trovato
     */
    @Override
    public Menu findById(Integer id) {
        Menu menu = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM menu WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                menu = new Menu(rs.getString("NOME"), tipoMenu(rs));
                menu.setId(rs.getInt("ID"));
                menu.addPortata(primoPiattoDAO.findById(rs.getInt("ID_PRIMO")));
                menu.addPortata(secondoPiattoDAO.findById(rs.getInt("ID_SECONDO")));
                menu.addPortata(dolceDAO.findById(rs.getInt("ID_DOLCE")));
                menu.addPortata(bevandaDAO.findById(rs.getInt("ID_BEVANDA")));
                menu.addPortata(bevandaDAO.findById(rs.getInt("ACQUA")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menu;
    }
    /**
     * Restituisce tutti i menu presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti Menu presenti nel database
     */
    @Override
    public ArrayList<Menu> findAll() {
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
     * Inserisce un nuovo Menù nel database.
     *
     * @param menu Menù da inserire nel database
     */
    @Override
    public void inserisci(Menu menu) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO menu (NOME, TIPO_MENU, ID_PRIMO, ID_SECONDO, ID_DOLCE, ID_BEVANDA, ACQUA) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, menu.getNome());
            stmt.setString(2, menu.getTipo().toString());
            for (int i = 0; i < menu.getPortate().size(); i++) {
                stmt.setInt((i + 3), menu.getPortate().get(i).getId());
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Aggiorna i dati di un Menù nel database.
     *
     * @param menu Menù da aggiornare nel database
     */
    @Override
    public void aggiorna(Menu menu) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE menu SET NOME = ?, TIPO_MENU = ?, ID_PRIMO = ?, ID_SECONDO = ?, ID_DOLCE = ?, ID_BEVANDA = ?, ACQUA = ? WHERE ID = ?")) {
            stmt.setString(1, menu.getNome());
            stmt.setString(2, menu.getTipo().toString());
            for (int i = 0; i < menu.getPortate().size(); i++) {
                stmt.setInt((i + 3), menu.getPortate().get(i).getId());
            }
            stmt.setInt(8, menu.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un Menù dal database dato il suo ID.
     *
     * @param id l'ID del Menù da eliminare
     */
    @Override
    public void elimina(Integer id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM menu WHERE ID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
