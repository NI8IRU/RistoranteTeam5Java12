package database;

import portate.Bevanda;
import java.sql.*;
import java.util.ArrayList;

/**
 * La classe BevandaDAO implementa l'interfaccia PortataDAO per gestire le operazioni di accesso al database
 * per gli oggetti di tipo Bevanda.
 */
public class BevandaDAO implements InterfacciaDAO<Bevanda> {

    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Trova un oggetto Bevanda nel database dato il suo ID.
     *
     * @param id l'ID dell'oggetto Bevanda da trovare
     * @return l'oggetto Bevanda corrispondente all'ID, o null se non trovato
     */
    @Override
    public Bevanda findById(Integer id) {
        Bevanda bevanda = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bevanda WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                bevanda = new Bevanda(rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getDouble("PERCENTUALE_ALC"));
                bevanda.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bevanda;
    }

    /**
     * Restituisce tutti gli oggetti Bevanda presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti Bevanda presenti nel database
     */
    @Override
    public ArrayList<Bevanda> findAll() {
        ArrayList<Bevanda> bevande = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM bevanda");
            while (rs.next()) {
                Bevanda bevanda = new Bevanda(rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getDouble("PERCENTUALE_ALC"));
                bevanda.setId(rs.getInt("ID"));
                bevande.add(bevanda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bevande;
    }

    /**
     * Inserisce un nuovo oggetto Bevanda nel database.
     *
     * @param bevanda l'oggetto Bevanda da inserire nel database
     */
    @Override
    public void inserisci(Bevanda bevanda) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO bevanda (NOME, PREZZO, PERCENTUALE_ALC) VALUES (?, ?, ?)")) {
            stmt.setString(1, bevanda.getNome());
            stmt.setDouble(2, bevanda.getPrezzo());
            stmt.setDouble(3, bevanda.getPercentAlcol());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Aggiorna i dati di un oggetto Bevanda nel database.
     *
     * @param bevanda l'oggetto Bevanda da aggiornare nel database
     */
    @Override
    public void aggiorna(Bevanda bevanda) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE bevanda SET NOME = ?, PREZZO = ?, PERCENTUALE_ALC = ? WHERE ID = ?")) {
            stmt.setString(1, bevanda.getNome());
            stmt.setDouble(2, bevanda.getPrezzo());
            stmt.setDouble(3, bevanda.getPercentAlcol());
            stmt.setInt(4, bevanda.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un oggetto Bevanda dal database dato il suo ID.
     *
     * @param id l'ID dell'oggetto Bevanda da eliminare
     */
    @Override
    public void elimina(Integer id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM bevanda WHERE ID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}