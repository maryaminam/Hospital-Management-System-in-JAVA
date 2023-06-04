
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zainab
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class databaseconnection {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = ("jdbc:mysql://localhost:3306/hms");
    final static String USER = "root";
    final static String PASS = "";
   public static Connection connection(){
       try {
           Class.forName(JDBC_DRIVER);
           Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
           return conn;
       } catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
        return null;
   }
    
        
}

    
