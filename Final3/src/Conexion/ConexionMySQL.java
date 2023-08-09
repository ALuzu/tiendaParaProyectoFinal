
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion"+e);
        }
        return cn;
    }
}
