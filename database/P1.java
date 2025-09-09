import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class P1 {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/harsh"; // DB name
        String user = "root"; // Your MySQL username
        String password = "Harshit@2005"; // Your MySQL password
        try {
            // 1. Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the database!");

            // 3. Create statement
            Statement stmt = con.createStatement();
            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users");

            // 5. Process result
            while (rs.next()) {
                System.out.println(rs.getInt("user_id") + " - " +
                                   rs.getString("username") + " - " +
                                   rs.getString("email"));
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
