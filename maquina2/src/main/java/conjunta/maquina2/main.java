/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjunta.maquina2;

import conjunta.maquina2.Views.adminLogin;

/**
 *
 * @author Andrés Luzuriaga
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion objConexion = new conexion();
        objConexion.crearConexion();
        adminLogin log = new adminLogin();
        log.setVisible(true);
    }
    
}
