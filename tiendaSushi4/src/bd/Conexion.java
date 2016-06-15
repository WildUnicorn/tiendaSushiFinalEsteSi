package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Piaa FernanDaa
 */
public class Conexion {
    
private Connection con;// Establecer la conexión
    private Statement sen; // Ejecutar consultas
    private ResultSet rs;  // Recorrer los resultados (Tabla)
    
    public Conexion(String server, String bd, String user, String pass) throws SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
        
        String url = protocolo + 
                server + "/" + 
                bd + "?" + 
                lineaUser + "&" +
                lineaPass;
        
        System.out.println(url);
        
        con = DriverManager.getConnection(url);
    }
    
    /*
    consultas actualizan los datos ---> delete,insert,update
    ver datos ---> select
    */
    
    
    //insert,,delate ,update
    public void ejecutar (String q)throws SQLException{
        sen = con.createStatement();
        sen.execute(q);
        desconectar();
        
        
        
    }
    
    public ResultSet ejecutarSelect(String query)throws SQLException{
        sen=con.createStatement();
        rs =sen.executeQuery(query);
        return rs;
        
    }
    
    public void desconectar() throws SQLException{
        sen.close();;
    }
}

