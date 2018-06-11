/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Categoria;
import utils.Resources;

/**
 *
 * @author daniel
 */
public class CategoriaDAO {
    
    private static final String GETALL = "SELECT id, nombre, fecha_creacion, fecha_actualizacion FROM categoria";
   
    
    public List<Categoria> obtenerCategorias()  {
        List<Categoria> categorias = new ArrayList<> ();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
    
        try {
            conn = ConnectionSQL.getConnection();
            stmt = conn.prepareStatement(GETALL);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                categorias.add(convertir(rs));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            Resources.closeResourcesSQL(conn, rs, stmt);
        }
        return categorias;
    }
    private Categoria convertir(ResultSet r) throws SQLException {
        Categoria categoria = new Categoria(
                r.getInt("id"),
                r.getString("nombre"),
                r.getDate("fecha_creacion").toLocalDate(),
                r.getDate("fecha_actualizacion").toLocalDate()
        );
        return categoria;
    }
}
