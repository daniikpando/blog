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
import models.Usuario;
import utils.Resources;

/**
 *
 * @author daniel
 */
public class UserDAO {
    
    private static final String GET_BY_EMAIL_AND_PASS = "SELECT id,username,correo, fecha_creacion, fecha_actualizacion FROM usuario WHERE correo= ? AND contrasena = ? ";
    private static final String CREATE_USER = "INSERT INTO usuario( username, correo, contrasena, confirmacion_contrasena) VALUES(?,?,?,?)";
    
    private Connection conn;
    private ResultSet rs = null;
    private PreparedStatement stmt;
    
    
    public Usuario crearUsuario(Usuario usuario) throws Exception{ 
        
        try{
            if(usuario.getContraseña().equals(usuario.getConfirmacion_contraseña())){
                conn = ConnectionSQL.getConnection();
                stmt = conn.prepareStatement(CREATE_USER);
                stmt.setString(1, usuario.getUsername());
                stmt.setString(2, usuario.getCorreo());
                stmt.setString(3, usuario.getContraseña());
                stmt.setString(4, usuario.getConfirmacion_contraseña());
                
                int rows = stmt.executeUpdate();
                
                if(rows == 1){
                    usuario = getUserByEmailAndPass(usuario.getCorreo(), usuario.getContraseña());
                }else{
                    throw new Exception("No se creo un registro adecuado de un usuario");
                }
            }else{
                throw new Exception("No se pudo guardar el usuario porque las contraseñas no coinciden");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return usuario;
    }
    
    public Usuario getUserByEmailAndPass(String email, String pass){
        Usuario u = null;
        try{
            if(conn == null) conn = ConnectionSQL.getConnection();
            
            stmt = conn.prepareStatement(GET_BY_EMAIL_AND_PASS);
            
            stmt.setString(1, email);
            stmt.setString(2, pass);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                u = convertir(rs);
            }
            
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            Resources.closeResourcesSQL(conn, rs, stmt);
        }
        return u;
    }
    
    private Usuario convertir(ResultSet r) throws SQLException{
        Usuario u = new Usuario();
        u.setId(r.getInt("id"));
        u.setUsername(r.getString("username"));
        u.setCorreo(r.getString("correo"));
        u.setFecha_creacion(r.getDate("fecha_creacion").toLocalDate());
        u.setFecha_actualizacion(r.getDate("fecha_actualizacion").toLocalDate());
        return u;
    }
}
