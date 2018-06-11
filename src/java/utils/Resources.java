/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public final class Resources {
    
    private Resources(){
        
    }
    /**
     * Esta funcion es utilizada para liberar memoria
     * @param conn es conexion a la base de datos
     * @param rs es el set de resultados que arroja la base de datos
     * @param stmt es la sentencia preparada para hacer queries a la base de datos
     */
    public static void closeResourcesSQL(Connection conn, ResultSet rs, PreparedStatement stmt){
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {}
    }
}
