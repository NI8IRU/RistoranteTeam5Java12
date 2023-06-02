package database;

import enumeration.TipoEnum;
import portate.PrimoPiatto;

import java.sql.*;
import java.util.ArrayList;

/**
 * La classe PrimoPiattoDAO implementa l'interfaccia PortataDAO per gestire le operazioni di accesso al database
 * per gli oggetti di tipo PrimoPiatto.
 */
public class PrimoPiattoDAO implements InterfacciaDAO<PrimoPiatto> {

    private static final String URL = "jdbc:mysql://localhost:3306/portate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Trova un oggetto PrimoPiatto nel database dato il suo ID.
     *
     * @param id l'ID dell'oggetto PrimoPiatto da trovare
     * @return l'oggetto PrimoPiatto corrispondente all'ID, o null se non trovato
     */
    @Override
    public PrimoPiatto findById(Integer id) {
        PrimoPiatto primoPiatto = null;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM primopiatto WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                primoPiatto = new PrimoPiatto(tipoPortata(rs), rs.getString("NOME_PIATTO"), rs.getDouble("PREZZO"), rs.getInt("KCAL_PER_ETTO"));
                primoPiatto.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return primoPiatto;
    }

    /**
     * Restituisce tutti gli oggetti PrimoPiatto presenti nel database.
     *
     * @return un ArrayList contenente tutti gli oggetti PrimoPiatto presenti nel database
     */
    @Override
    public ArrayList<PrimoPiatto> findAll() {
        ArrayList<PrimoPiatto> primiPiatti = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM primopiatto");
            while (rs.next()) {
                PrimoPiatto primoPiatto = new PrimoPiatto(tipoPortata(rs), rs.getString("NOME_PIATTO"), rs.getDouble("PREZZO"), rs.getInt("KCAL_PER_ETTO"));
                primoPiatto.setId(rs.getInt("ID"));
                primiPiatti.add(primoPiatto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return primiPiatti;
    }

    /**
     * Inserisce un nuovo oggetto PrimoPiatto nel database.
     *
     * @param primoPiatto l'oggetto PrimoPiatto da inserire nel database
     */
    @Override
    public void inserisci(PrimoPiatto primoPiatto) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO primopiatto (TIPO_MENU, NOME_PIATTO, PREZZO, KCAL_PER_ETTO) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, primoPiatto.getTipoEnum().toString());
            stmt.setString(2, primoPiatto.getNome());
            stmt.setDouble(3, primoPiatto.getPrezzo());
            stmt.setDouble(4, primoPiatto.getKcalPerEtto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Aggiorna i dati di un oggetto PrimoPiatto nel database.
     *
     * @param primoPiatto l'oggetto PrimoPiatto da aggiornare nel database
     */
    @Override
    public void aggiorna(PrimoPiatto primoPiatto) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE primopiatto SET NOME_PIATTO = ?, PREZZO = ?, KCAL_PER_ETTO = ? WHERE ID = ?")) {
            stmt.setString(1, primoPiatto.getNome());
            stmt.setDouble(2, primoPiatto.getPrezzo());
            stmt.setDouble(3, primoPiatto.getKcalPerEtto());
            stmt.setInt(4, primoPiatto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un oggetto PrimoPiatto dal database dato il suo ID.
     *
     * @param id l'ID dell'oggetto PrimoPiatto da eliminare
     */
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
