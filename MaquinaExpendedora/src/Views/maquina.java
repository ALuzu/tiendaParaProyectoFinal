package Views;


import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andrés Luzuriaga
 */
public class maquina extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
        
    public maquina() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.rellenar(this.fotoCoca,"src/imagenes/cocacola1.jpg");
        this.rellenar(this.fotoJugo,"src/imagenes/jugo1.jpg");
        this.rellenar(this.fotoGalletas,"src/imagenes/galletas1.jpeg");
        this.rellenar(this.fotoPapas,"src/imagenes/papas.jpeg");
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pago = new javax.swing.JButton();
        dineroTotal = new javax.swing.JTextField();
        cantidadPapas = new javax.swing.JSpinner();
        fotoPapas = new javax.swing.JLabel();
        fotoCoca = new javax.swing.JLabel();
        fotoGalletas = new javax.swing.JLabel();
        fotoJugo = new javax.swing.JLabel();
        cantidadCoca = new javax.swing.JSpinner();
        cantidadGalletas = new javax.swing.JSpinner();
        cantidadJugo = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pfinalCoca = new javax.swing.JLabel();
        agregarCoca = new javax.swing.JButton();
        agregarJugo = new javax.swing.JButton();
        agregarGalletas = new javax.swing.JButton();
        agregarPapas = new javax.swing.JButton();
        pfinalJugo = new javax.swing.JLabel();
        pfinalGalletas = new javax.swing.JLabel();
        pfinalPapas = new javax.swing.JLabel();
        pFinal = new javax.swing.JLabel();
        precioFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel2.setText("Welcome! Choose you product");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 30));

        pago.setText("MAKE PAYMENT");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        jPanel1.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        dineroTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Add the payment amount"));
        jPanel1.add(dineroTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 200, -1));

        cantidadPapas.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel1.add(cantidadPapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 110, -1));

        fotoPapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papas.jpeg"))); // NOI18N
        fotoPapas.setToolTipText("Papas - $1,00");
        jPanel1.add(fotoPapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 120, 110));

        fotoCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocacola1.jpg"))); // NOI18N
        fotoCoca.setToolTipText("Coca Cola - $0.50");
        jPanel1.add(fotoCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 110));

        fotoGalletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/galletas1.jpeg"))); // NOI18N
        fotoGalletas.setToolTipText("Galletas - $0.65");
        jPanel1.add(fotoGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 110));

        fotoJugo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugo1.jpg"))); // NOI18N
        fotoJugo.setToolTipText("Jugo - $0.35");
        jPanel1.add(fotoJugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 120, 110));

        cantidadCoca.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel1.add(cantidadCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, -1));

        cantidadGalletas.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel1.add(cantidadGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, -1));

        cantidadJugo.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        jPanel1.add(cantidadJugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 110, -1));

        jLabel3.setText("COKE - $0.50");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setText("JUICE - $0.35");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel5.setText("COOKIES - $0.60");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel6.setText("CHIPS - $1.00");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        pfinalCoca.setBackground(new java.awt.Color(255, 255, 255));
        pfinalCoca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Final Price per Product (Coke)"));
        jPanel1.add(pfinalCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 240, 50));

        agregarCoca.setText("ADD");
        agregarCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCocaActionPerformed(evt);
            }
        });
        jPanel1.add(agregarCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        agregarJugo.setText("ADD");
        agregarJugo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarJugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        agregarGalletas.setText("ADD");
        agregarGalletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarGalletasActionPerformed(evt);
            }
        });
        jPanel1.add(agregarGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        agregarPapas.setText("ADD");
        agregarPapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPapasActionPerformed(evt);
            }
        });
        jPanel1.add(agregarPapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        pfinalJugo.setBackground(new java.awt.Color(255, 255, 255));
        pfinalJugo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Final Price per Product (Juice)"));
        jPanel1.add(pfinalJugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 240, 50));

        pfinalGalletas.setBackground(new java.awt.Color(255, 255, 255));
        pfinalGalletas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Final Price per Product (Cookies)"));
        jPanel1.add(pfinalGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 240, 50));

        pfinalPapas.setBackground(new java.awt.Color(255, 255, 255));
        pfinalPapas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Final Price per Product (Chips)"));
        jPanel1.add(pfinalPapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 240, 50));

        pFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total Price"));
        jPanel1.add(pFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 180, 50));

        precioFinal.setText("TOTAL");
        precioFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFinalActionPerformed(evt);
            }
        });
        jPanel1.add(precioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "CONFIRM EXIT?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (salir==JOptionPane.YES_NO_OPTION){
        masterPassword newframe = new masterPassword();
        newframe.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        float total, cambio;
        float efectivo;
        total = Float.parseFloat(pFinal.getText());
        efectivo = Float.parseFloat(dineroTotal.getText());
        if (efectivo>=total) {
        cambio=efectivo-total;
    } else {
        do {                
            efectivo=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter an amount higher or equal to: "+total));
        } while (efectivo<=efectivo-total);
        cambio=efectivo-total;
    }
        JOptionPane.showMessageDialog(null, """
                                         ------- BILL ------- 
                                         TOTAL AMOUNT \t"""+efectivo
                                         + "\n TO PAY "+total
                                       + "\n CHANGE "+cambio);
        limpiar();
    }//GEN-LAST:event_pagoActionPerformed

    private void agregarCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCocaActionPerformed
        float valor =  (float) cantidadCoca.getValue();
        float total = valor * 0.5f;
        pfinalCoca.setText(String.valueOf(total));
    }//GEN-LAST:event_agregarCocaActionPerformed

    private void agregarJugoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugoActionPerformed
        float valor =  (float) cantidadJugo.getValue();
        float total = valor * 0.35f;
        pfinalJugo.setText(String.valueOf(total));
    }//GEN-LAST:event_agregarJugoActionPerformed

    private void agregarGalletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarGalletasActionPerformed
        float valor =  (float) cantidadGalletas.getValue();
        float total = valor * 0.60f;
        pfinalGalletas.setText(String.valueOf(total));
    }//GEN-LAST:event_agregarGalletasActionPerformed

    private void agregarPapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPapasActionPerformed
        float valor =  (float) cantidadPapas.getValue();
        float total = valor * 1.00f;
        pfinalPapas.setText(String.valueOf(total));
    }//GEN-LAST:event_agregarPapasActionPerformed

    private void precioFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFinalActionPerformed
        float pCoca, pJugo, pGalletas, pPapas;
        float total;
        pCoca = Float.parseFloat(pfinalCoca.getText());
        pJugo = Float.parseFloat(pfinalJugo.getText());
        pGalletas = Float.parseFloat(pfinalGalletas.getText());
        pPapas = Float.parseFloat(pfinalPapas.getText());
        total = pCoca + pJugo + pGalletas + pPapas;
        pFinal.setText(String.valueOf(total));
    }//GEN-LAST:event_precioFinalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maquina().setVisible(true);
            }
        });
    }

    
    public void limpiar(){
        this.dineroTotal.setText(null);
        this.pfinalCoca.setText(null);
        this.pfinalGalletas.setText(null);
        this.pfinalJugo.setText(null);
        this.pfinalPapas.setText(null);
        this.pFinal.setText(null);
    } 
    private void rellenar(JLabel button, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton agregarCoca;
    private javax.swing.JButton agregarGalletas;
    private javax.swing.JButton agregarJugo;
    private javax.swing.JButton agregarPapas;
    private javax.swing.JSpinner cantidadCoca;
    private javax.swing.JSpinner cantidadGalletas;
    private javax.swing.JSpinner cantidadJugo;
    private javax.swing.JSpinner cantidadPapas;
    private javax.swing.JTextField dineroTotal;
    private javax.swing.JLabel fotoCoca;
    private javax.swing.JLabel fotoGalletas;
    private javax.swing.JLabel fotoJugo;
    private javax.swing.JLabel fotoPapas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pFinal;
    private javax.swing.JButton pago;
    private javax.swing.JLabel pfinalCoca;
    private javax.swing.JLabel pfinalGalletas;
    private javax.swing.JLabel pfinalJugo;
    private javax.swing.JLabel pfinalPapas;
    private javax.swing.JButton precioFinal;
    // End of variables declaration//GEN-END:variables
}
