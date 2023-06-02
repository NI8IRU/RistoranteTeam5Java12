package database;

import portate.Dolce;

import java.sql.*;
import java.util.ArrayList;

/**
 * La classe DolceDAO implementa l'interfaccia PortataDAO per gestire le operazioni di accesso al database
 * per gli oggetti di tipo Dolce.
 */
public class DolceDAO implements InterfacciaDAO<Dolce> {
    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Trova un oggetto Dolce nel database dato il suo ID.
     *
     * @param id l'ID dell'oggetto Dolce da trovare
     * @return l'oggetto Dolce corrispondente all'ID, o null se non trovato
     */
    @Override
    public Dolce findById(Integer id) {
        Dolce dolce = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM dolce WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                dolce = new Dolce(rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getDouble("PER_ZUCCHERI"));
                dolce.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dolce;
    }

    /**
     * Restituisce tutti gli oggetti Dolce presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti Dolce presenti nel database
     */
    @Override
    public ArrayList<Dolce> findAll() {
        ArrayList<Dolce> dolci = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM dolce");
            while (rs.next()) {
                Dolce dolce = new Dolce(rs.getString("NOME"), rs.getDouble("PREZZO"), rs.getDouble("PER_ZUCCHERI"));
                dolce.setId(rs.getInt("ID"));
                dolci.add(dolce);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dolci;
    }

    /**
     * Inserisce un nuovo oggetto Dolce nel database.
     *
     * @param dolce l'oggetto Dolce da inserire nel database
     */
    @Override
    public void inserisci(Dolce dolce) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO dolce (NOME, PREZZO, PER_ZUCCHERI) VALUES (?, ?, ?)")) {
            stmt.setString(1, dolce.getNome());
            stmt.setDouble(2, dolce.getPrezzo());
            stmt.setDouble(3, dolce.getPerZuccheri());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Aggiorna i dati di un oggetto Dolce nel database.
     *
     * @param dolce l'oggetto Dolce da aggiornare nel database
     */
    @Override
    public void aggiorna(Dolce dolce) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE dolce SET NOME = ?, PREZZO = ?, PER_ZUCCHERI = ? WHERE ID = ?")) {
            stmt.setString(1, dolce.getNome());
            stmt.setDouble(2, dolce.getPrezzo());
            stmt.setDouble(3, dolce.getPerZuccheri());
            stmt.setInt(4, dolce.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un oggetto Dolce dal database dato il suo ID.
     *
     * @param id l'ID dell'oggetto Dolce da eliminare
     */
    @Override
    public void elimina(Integer id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM dolce WHERE ID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
