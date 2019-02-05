import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionDB {
    public static void main (String args []) {

        // Constants 
        final String DATABASE_DNS = "localhost";
        final String DATABASE_URL = "jdbc:mysql://";
        final String MYSQL_USER = "root";
        final String MYSQL_PASSWD = "root";
        
        Connection conn = null;     // manager connetion
        Statement statement = null; // manager query

        try {
            // Open a connection
            System.out.println("Connecting to database...");

            conn = DriverManager.getConnection(
                    DATABASE_URL + DATABASE_DNS,
                    MYSQL_USER,
                    MYSQL_PASSWD);

            //create statement (cursor) to execute query in DB
            System.out.println("Creating database...");

            String query = "CREATE DATABASE ´creed´;";
            Statement stmt = conn.createStatement();    // Statement = cursor()
            stmt.execute(query);

        } catch (SQLException e) {
            System.out.println("Error when execute QUERY: " + e.getMessage());
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            if (conn != null || statement != null) {
                try {
                    conn.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}