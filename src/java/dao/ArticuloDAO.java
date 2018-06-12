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
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Articulo;
import models.Usuario;
import utils.Resources;

public class ArticuloDAO {
    private static final String INSERT = "call insertarArticulo(?, ?, ?, ?)";
    private static final String GET_BY_ID = "call obtenerArticulo(?)";
    
    
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement stmt;
   
    public int insertarArticulo(Articulo art){
        int id = 0; 
        try{
            conn = ConnectionSQL.getConnection();   
            stmt = conn.prepareStatement(INSERT);
            
            stmt.setString(1, art.getTitulo());
            stmt.setString(2, art.getContenido());
            stmt.setString(3, art.getDescripcion());
            stmt.setInt(4, art.getUsuario().getId());
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("id_articulo");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally{
            Resources.closeResourcesSQL(conn, rs, stmt);
        }
        return id;
    }
    
    public Articulo obtenerArticulo(int id){
        Articulo articulo = null;
        
        try{
            conn = ConnectionSQL.getConnection();
            stmt = conn.prepareStatement(GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsername(rs.getString("username"));
                usuario.setCorreo(rs.getString("correo"));
                articulo = new Articulo(
                        rs.getInt("id_articulo"),
                        rs.getString("titulo"),
                        rs.getString("contenido"),
                        rs.getString("descripcion"),
                        rs.getDate("fecha_creacion").toLocalDate(),
                        rs.getDate("fecha_actualizacion").toLocalDate(),
                        usuario
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            Resources.closeResourcesSQL(conn, rs, stmt);
        }
        return articulo;
    }
    
}
