/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author oscar sanabria
 */
public class Conexion {

    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "registros";
    private String url = "jdbc:mysql://localhost:3306/" + baseDatos + "?serverTimezone=UTC";

  
    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se ha establecido la conexion" + "\n" + url);
            } else {
                System.out.println("Conexion establecida");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.out.println("error");
        }
    }

    public Connection getConn() {
        return conn;
    }
   
    public void CerrarConexion() throws SQLException {
        if (conn != null){
            conn.close();
        }
    }
    
}
