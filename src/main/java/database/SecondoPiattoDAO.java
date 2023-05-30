package database;

import enumeration.TipoEnum;
import portate.SecondoPiatto;

import java.sql.*;
import java.util.ArrayList;

/**
 * La classe SecondoPiattoDAO implementa l'interfaccia PortataDAO per gestire le operazioni di accesso al database
 * per gli oggetti di tipo SecondoPiatto.
 */
public class SecondoPiattoDAO implements PortataDAO<SecondoPiatto> {

    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Trova un oggetto SecondoPiatto nel database dato il suo ID.
     *
     * @param id l'ID dell'oggetto SecondoPiatto da trovare
     * @return l'oggetto SecondoPiatto corrispondente all'ID, o null se non trovato
     */
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

    /**
     * Restituisce tutti gli oggetti SecondoPiatto presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti SecondoPiatto presenti nel database
     */
    @Override
    public ArrayList<SecondoPiatto> findAll() {
        ArrayList<SecondoPiatto> secondiPiatti = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM secondopiatto");
            while (rs.next()) {
                SecondoPiatto secondoPiatto = new SecondoPiatto(tipoPortata(rs), rs.getString("NOME_PIATTO"), rs.getDouble("PREZZO"), rs.getDouble("PESO_PIATTO"));
                secondoPiatto.setId(rs.getInt("ID"));
                secondiPiatti.add(secondoPiatto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return secondiPiatti;
    }

    /**
     * Inserisce un nuovo oggetto SecondoPiatto nel database.
     *
     * @param secondoPiatto l'oggetto SecondoPiatto da inserire nel database
     */
    @Override
    public void inserisci(SecondoPiatto secondoPiatto) {
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

    /**
     * Aggiorna i dati di un oggetto SecondoPiatto nel database.
     *
     * @param secondoPiatto l'oggetto SecondoPiatto da aggiornare nel database
     */
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

    /**
     * Elimina un oggetto SecondoPiatto dal database dato il suo ID.
     *
     * @param id l'ID dell'oggetto SecondoPiatto da eliminare
     */
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

    /**
     * Restituisce il valore dell'enumerazione TipoEnum corrispondente alla stringa presente nel ResultSet.
     *
     * @param rs il ResultSet contenente la colonna "TIPO_MENU"
     * @return il valore dell'enumerazione TipoEnum
     * @throws SQLException se si verifica un errore durante l'accesso al ResultSet
     */
    private TipoEnum tipoPortata(ResultSet rs) throws SQLException {
        return switch (rs.getString("TIPO_MENU")) {
            case "Carnivoro" -> TipoEnum.CARNIVORO;
            case "Pesce" -> TipoEnum.PESCE;
            case "Vegetariano" -> TipoEnum.VEGETARIANO;
            default -> TipoEnum.ALL;
        };
    }
}