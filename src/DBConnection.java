
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author User01
 */
public class DBConnection {
    
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/barangayy_db",
                "root",
                ""
            );
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}