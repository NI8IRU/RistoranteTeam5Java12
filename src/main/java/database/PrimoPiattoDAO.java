package database;

import enumertion.TipoEnum;
import portate.Bevanda;
import portate.PrimoPiatto;

import java.sql.*;
import java.util.ArrayList;

public class PrimoPiattoDAO implements  PortataDAO<PrimoPiatto>{


    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";


    @Override
    public PrimoPiatto findById(Integer id) {
        PrimoPiatto primoPiatto = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM primopiatto WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                primoPiatto = new PrimoPiatto(rs.getString("TIPO_MENU"), rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getInt("KCAL_PER_ETTO"));
                primoPiatto.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return primoPiatto;
    }

    @Override
    public ArrayList<PrimoPiatto> findAll() {
        ArrayList<PrimoPiatto> primiPiatti = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM primopiatto");
            while (rs.next()) {
                PrimoPiatto primoPiatto = new PrimoPiatto( rs.getString("TIPO_MENU"), rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getInt("KCAL_PER_ETTO"));
                primoPiatto.setId(rs.getInt("ID"));
                primiPiatti.add(primoPiatto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return primiPiatti;
    }

    @Override
    public void inserisci(PrimoPiatto primoPiatto){

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO primopiatto (TIPO_MENU, NOME, PREZZO, KCAL_PER_ETTO) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, primoPiatto.getTipoEnum().toString());
            stmt.setString(2, primoPiatto.getNome());
            stmt.setDouble(3, primoPiatto.getPrezzo());
            stmt.setDouble(4, primoPiatto.getKcalPerEtto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void aggiorna(PrimoPiatto primoPiatto) {

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE primopiatto SET NOME = ?, PREZZO = ?, KCAL_PER_ETTO = ? WHERE ID = ?")) {
            stmt.setString(1, primoPiatto.getNome());
            stmt.setDouble(2, primoPiatto.getPrezzo());
            stmt.setDouble(3, primoPiatto.getKcalPerEtto());
            stmt.setInt(4, primoPiatto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void elimina(Integer id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM primopiatto WHERE ID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
