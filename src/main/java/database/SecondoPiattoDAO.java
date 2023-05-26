package database;

import enumeration.TipoEnum;
import portate.SecondoPiatto;

import java.sql.*;
import java.util.ArrayList;

public class SecondoPiattoDAO implements  PortataDAO<SecondoPiatto>{


    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";


    @Override
    public SecondoPiatto findById(Integer id) {
        SecondoPiatto secondoPiatto = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM secondopiatto WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                secondoPiatto = new SecondoPiatto(tipoPortata(rs), rs.getString("NOME_PIATTO"), rs.getDouble("PREZZO"), rs.getDouble("PESO_PIATTO"));
                secondoPiatto.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return secondoPiatto;
    }

    @Override
    public ArrayList<SecondoPiatto> findAll() {
        ArrayList<SecondoPiatto> secondiPiatti = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM secondopiatto");
            while (rs.next()) {
                SecondoPiatto secondoPiatto = new SecondoPiatto( tipoPortata(rs), rs.getString("NOME_PIATTO"), rs.getDouble("PREZZO"), rs.getDouble("PESO_PIATTO"));
                secondoPiatto.setId(rs.getInt("ID"));
                secondiPiatti.add(secondoPiatto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return secondiPiatti;
    }

    @Override
    public void inserisci(SecondoPiatto secondoPiatto){

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO secondopiatto (TIPO_MENU, NOME_PIATTO, PREZZO, PESO_PIATTO) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, secondoPiatto.getTipoEnum().toString());
            stmt.setString(2, secondoPiatto.getNome());
            stmt.setDouble(3, secondoPiatto.getPrezzo());
            stmt.setDouble(4, secondoPiatto.getPesoPiatto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void aggiorna(SecondoPiatto secondoPiatto) {

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE secondopiatto SET NOME_PIATTO = ?, PREZZO = ?, PESO_PIATTO = ? WHERE ID = ?")) {
            stmt.setString(1, secondoPiatto.getNome());
            stmt.setDouble(2, secondoPiatto.getPrezzo());
            stmt.setDouble(3, secondoPiatto.getPesoPiatto());
            stmt.setInt(4, secondoPiatto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void elimina(Integer id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM secondopiatto WHERE ID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private TipoEnum tipoPortata (ResultSet rs) throws SQLException {
        return switch (rs.getString("TIPO_MENU")) {
            case ("Carnivoro") -> TipoEnum.CARNIVORO;
            case ("Pesce") -> TipoEnum.PESCE;
            case ("Vegetariano") -> TipoEnum.VEGETARIANO;
            default -> TipoEnum.ALL;
        };
    }
}
