package java.util.com;
import java.sql.*;
class DBConnection{
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/harsh"; // DB name
        String user = "root"; // Your MySQL username
        String password = "Harshit@2005"; 
        Connection con = null;
        try{
            // 1. Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the database!");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}