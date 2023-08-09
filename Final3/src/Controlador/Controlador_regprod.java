
package Controlador;

import Vista.RegistroProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador_regprod implements ActionListener{
    RegistroProducto regprod;

    public Controlador_regprod(RegistroProducto regprod) {
        this.regprod = regprod;
        this.regprod.GUARDAR.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==regprod){
            System.out.println("ok");            
        }
    }
    
}
