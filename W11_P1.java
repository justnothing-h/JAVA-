
    import java.sql.*;

public class W11_P1 {

    public static void main(String args[]) {

        try {

            Connection conn = null;
            Statement stmt = null;

            String DB_URL = "jdbc:sqlite:/tempfs/db";

            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // open connection
            conn = DriverManager.getConnection(DB_URL);

            // check connection validity
            System.out.print(conn.isValid(1));

            // close connection
            conn.close();

        }

        catch (Exception e) {

            System.out.println(e);

        }

    }
}
