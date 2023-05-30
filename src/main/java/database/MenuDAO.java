package database;

import enumeration.TipoEnum;
import portate.Bevanda;
import portate.PrimoPiatto;
import ristorante.Menu;

import java.sql.*;
import java.util.ArrayList;

public class MenuDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    PrimoPiattoDAO primoPiattoDAO;
    SecondoPiattoDAO secondoPiattoDAO;
    DolceDAO dolceDAO;
    BevandaDAO bevandaDAO;

    public MenuDAO() {
        primoPiattoDAO = new PrimoPiattoDAO();
        secondoPiattoDAO = new SecondoPiattoDAO();
        dolceDAO = new DolceDAO();
        bevandaDAO = new BevandaDAO();
    }

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

    private TipoEnum tipoMenu (ResultSet rs) throws SQLException {
        return switch (rs.getString("TIPO_MENU")) {
            case ("Carnivoro") -> TipoEnum.CARNIVORO;
            case ("Pesce") -> TipoEnum.PESCE;
            case ("Vegetariano") -> TipoEnum.VEGETARIANO;
            default -> TipoEnum.ALL;
        };
    }
}
