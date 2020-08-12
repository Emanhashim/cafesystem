/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nathan
 */
public class ConnectToDB {
    public static Connection getConnected() throws SQLException {
String dbURL = "jdbc:mysql://localhost:3306/cafesystem";
String dbUser = "root";
String dbPass = "nathan";
return DriverManager.getConnection(dbURL, dbUser, dbPass);
}

    
}
