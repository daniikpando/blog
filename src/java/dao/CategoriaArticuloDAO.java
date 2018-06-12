/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Resources;

/**
 *
 * @author daniel
 */
public class CategoriaArticuloDAO {
    private static final String INSERT = "INSERT categoria_articulo(id_articulo, id_categoria) VALUES(?, ? )";
    
    private Connection conn;
    //private ResultSet rs;
    private PreparedStatement stmt;
    
    
    public void insertarCategoriaArticulo(int categoria, int articulo) {
        try{ 
            conn = ConnectionSQL.getConnection();
            stmt = conn.prepareStatement(INSERT);
            stmt.setInt(1, articulo);
            stmt.setInt(2, categoria);
            
            int row = stmt.executeUpdate();
            
            System.out.println("Filas afectadas: " + row);
        }catch(SQLException ex){ 
            System.out.println(ex.getMessage());
        }finally{
            Resources.closeResourcesSQL(conn, null, stmt);
        }
    }
}
