package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//import java.sql.*;
//import javax.swing.*;
public class MySql {

    Connection conn = null;

    public static Connection connectDB() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/katana", "root", "");
            JOptionPane.showMessageDialog(null, "Connected");//view
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection to server failed,make sure the server is running");
            //e
            return null;
        }
    }
}
