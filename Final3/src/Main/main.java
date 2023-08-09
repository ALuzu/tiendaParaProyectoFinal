
package Main;

import Controlador.Controlador_regprod;
import Vista.RegistroProducto;

public class main {

   public static RegistroProducto regprod;
   public static Controlador.Controlador_regprod cregprod;
    public static void main(String[] args) {
        regprod=new RegistroProducto();
        regprod.setVisible(true);
        regprod.setLocationRelativeTo(null);
        cregprod= new Controlador_regprod(regprod);
    }
    
}
