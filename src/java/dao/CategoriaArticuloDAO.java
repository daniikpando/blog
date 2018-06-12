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
import models.Articulo;
import models.Categoria;
import models.CategoriaArticulo;
import utils.Resources;

/**
 *
 * @author daniel
 */
public class CategoriaArticuloDAO {
    private static final String INSERT = "INSERT categoria_articulo(id_articulo, id_categoria) VALUES(?, ? )";
    private static final String GET_ARTICLE_BY_CATEGORY = "call obtenerArticuloPorCategoria(?)";
    
    private Connection conn;
    private ResultSet rs;
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
    
    public CategoriaArticulo obtenerArticulosPorCategoria(int id){
        CategoriaArticulo ca = new CategoriaArticulo();
        try{ 
            conn = ConnectionSQL.getConnection();
            stmt = conn.prepareStatement(GET_ARTICLE_BY_CATEGORY);
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            int i = 0;
            while(rs.next()){
                if(i == 0){
                    Categoria categoria = new Categoria();
                    categoria.setId(id);
                    categoria.setNombre(rs.getString("nombre"));
                    ca.getCategoria().add(categoria);
                    i++;
                }
                ca.getArticulo().add(convertir());
            }
            
        }catch(SQLException ex){ 
            System.out.println(ex.getMessage());
        }finally{
            Resources.closeResourcesSQL(conn, null, stmt);
        }
        return ca;
    }
    
    private Articulo convertir() throws SQLException{
        Articulo art = new Articulo();
        art.setId(rs.getInt("id_articulo"));
        art.setTitulo(rs.getString("titulo"));
        art.setDescripcion(rs.getString("descripcion"));
        art.setFecha_creacion(rs.getDate("fecha_creacion").toLocalDate());
        
        return art;
    }
}
