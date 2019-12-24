import java.sql.*;

public class ConnectionDbAndReturnQuery {
    public static void main (String args []) {

        // Constants
        final String DATABASE_DNS = "localhost";
        final String DATABASE_URL = "jdbc:mysql://";
        final String MYSQL_USER = "root";
        final String MYSQL_PASSWD = "root";

        Connection conn = null;                 // manager connetion
        Statement statement = null;             // manager query
        ResultSet rs = (ResultSet) statement;   // manager result query

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
            rs = stmt.executeQuery(query);    // ResultSet return a cursor

            // Return each line
            while (rs.next()) {
                System.out.println(rs);
            }

        } catch (SQLException e) {
            System.out.println("Error when execute QUERY: " + e.getMessage());
            e.printStackTrace();
        } finally {

            //finally block used to close resources
            if (conn != null || statement != null ||  rs != null) {
                try {
                    conn.close();
                    statement.close();
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}