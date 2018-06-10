package dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;
/**
 * Clase que me permite la conexion a la base de datos
 * @author daniel
 */
public class ConnectionSQL {
    
    
    public static Connection getConnection() {
        Connection cn = null; 
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdniblog");
            cn = ds.getConnection();
            System.out.println("Se conecto a la base de datos");
        }
        catch(NamingException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
}
