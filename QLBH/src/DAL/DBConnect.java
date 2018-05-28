/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hoang
 */
public class DBConnect {
   static Connection conn;
   static String dbURL = "jdbc:sqlserver://LYCHEE\\HOANG;databaseName=QLBH;username=sa;password=sa";
   public static Connection MoKetNoi(){
   try {        
        conn = DriverManager.getConnection(dbURL);
        if (conn != null) {
        System.out.println("Connected");
        return conn;
        }
    } catch (SQLException ex) {
        System.err.println("Cannot connect database, " + ex);     
        }
        return null;
   }
}
