/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjunta.maquina2;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.List;

/**
 *
 * @author Andrés Luzuriaga
 */
public class conexion {

    public static DBCollection getCollection(String usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public MongoClient crearConexion(){
        MongoClient mongo = null;
        String servidor = "localhost"; 
        int puerto = 27017;
        try{
            mongo = new MongoClient(servidor,puerto);
            
            List<String> NombresBD = mongo.getDatabaseNames(); 
            System.out.println("Conexion Establecida, la lista BD son: " + NombresBD.toString());
            
        }catch(MongoException e){
            System.out.println("Error en la conexion, error: "+e.toString());
        }
        return mongo;
    }
}
