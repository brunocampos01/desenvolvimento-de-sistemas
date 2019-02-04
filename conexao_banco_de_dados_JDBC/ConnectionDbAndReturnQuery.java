import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionDbAndReturnQuery {
    public static void main (String args []) {

        // Constants
        private static final String DATABASE_DNS = "localhost";
        private static final String DATABASE_URL = "jdbc:mysql://";
        private static final String MYSQL_USER = "root";
        private static final String MYSQL_PASSWD = "root";

        Connection conn = null;     // manager connetion
        Statement statement = null; // manager query
        ResultSet rs = null;

        try {
            // Open a connection
            System.out.println("Connecting to database...");

            conn = DriverManager.getConnection(
                    DATABASE_URL + DATABASE_DNS,
                    MYSQL_USER,
                    MYSQL_PASSWD);

            //create statement (cursor)
            String query = "SELECT * FROM fights LIMIT 10;";
            Statement stmt = conn.createStatement();    // Statement = cursor() in Python

            // Storage in memory result query
            ResultSet rs = stmt.executeQuery(query);    // ResultSet return a cursor

            // Return each line
            while (rs.next()) {
                System.out.println(rs.getString());
            }

        } catch (SQLException e) {
            System.out.Println("Error when execute QUERY: " + e.getMessage());
            sqlException.printStackTrace();
        } finally {
            //finally block used to close resources
            if (conn != null || statement != null ||  rs != null) {
                conn.close();
                statement.close();
                rs.close();
            }
        }
    }
}