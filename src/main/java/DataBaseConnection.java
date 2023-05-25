import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnection{

    public static void init() {
        try (Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/portate", "root", "password"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from bevande")){
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getDouble(2) + " " + resultSet.getDouble(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
