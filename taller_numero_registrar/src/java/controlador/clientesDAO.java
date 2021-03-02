/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Conexion;
import modelo.clientes;

/**
 *
 * @author oscar sanabria
 */
public class clientesDAO {
    
   public void agregar(clientes p) {
       Conexion c=new Conexion();
        String sql = "insert into clientes(nombre, documento, lugar)values(?,?,?)";
        try {
           Connection con = c.getConn();
           PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
             ps.setInt(2, p.getDocumento());
              ps.setString(3, p.getLugar());
          
            ps.executeUpdate();
        } catch (Exception e) {
       }
     
}
 
}
