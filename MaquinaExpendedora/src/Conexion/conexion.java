package Conexion;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrés Luzuriaga
 */
public class conexion {
   private static Connection conn;
   private static final String DRIVER = "com.mysql.jdbc.Driver";
   private static final String USER = "root";
   private static final String PASSWORD = "";
   private static final String URL = "jdbc:mysql://localhost:3306/registro";

    public conexion() {
        conn = null;
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
            if(conn !=null){
                System.out.println("Conexion Establecida");
            } 
        } catch (ClassNotFoundException | SQLException e){
                System.out.println("Error en Conexion" +e);
        }
    }


    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if(conn==null){
            System.out.println("Conexion Terminada");
        }
        
    }
}