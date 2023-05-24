package database;
import portate.Bevanda;
import java.sql.*;
import java.util.ArrayList;

public class BevandaDAO implements PortataDAO<Bevanda>{


        private static final String URL = "jdbc:mysql://localhost:3306/portate";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "password";

        @Override
        public Bevanda findById(int id) {
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

    @Override
    public void inserisci(Bevanda bevanda) {
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO bevanda (ID, NOME, PREZZO, PERCENTUALE_ALC) VALUES (?, ?, ?, ?)")) {
                stmt.setInt(1, bevanda.getId());
                stmt.setString(2, bevanda.getNome());
                stmt.setDouble(3, bevanda.getPrezzo());
                stmt.setDouble(4, bevanda.getPercentAlcol());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

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

        @Override
        public void elimina(int id) {
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM bevanda WHERE ID = ?")) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }