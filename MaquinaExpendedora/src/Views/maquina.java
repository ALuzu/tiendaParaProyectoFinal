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

    int producto, boton, dinero;
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
        admin = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pago = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dineroTotal = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        fotoPapas = new javax.swing.JLabel();
        fotoCoca = new javax.swing.JLabel();
        fotoGalletas = new javax.swing.JLabel();
        fotoJugo = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel2.setText("Bienvenido, Eliga su producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 30));

        pago.setText("REALIZAR PAGO");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        jPanel1.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel1.setText("Ingrese el dinero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, 30));
        jPanel1.add(dineroTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 110, -1));

        fotoPapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papas.jpeg"))); // NOI18N
        fotoPapas.setToolTipText("Papas - $1,00");
        jPanel1.add(fotoPapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, 110));

        fotoCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocacola1.jpg"))); // NOI18N
        fotoCoca.setToolTipText("Coca Cola - $0.50");
        jPanel1.add(fotoCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 110));

        fotoGalletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/galletas1.jpeg"))); // NOI18N
        fotoGalletas.setToolTipText("Galletas - $0.65");
        jPanel1.add(fotoGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 110));

        fotoJugo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugo1.jpg"))); // NOI18N
        fotoJugo.setToolTipText("Jugo - $0.35");
        jPanel1.add(fotoJugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, 110));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, -1));
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 110, -1));
        jPanel1.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 110, -1));

        jLabel3.setText("Coca Cola - $0.50");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel4.setText("Jugo - $0.35");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel5.setText("Galletas - $0.60");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel6.setText("Papas - $1.00");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(null, "Desea salir del pregrama?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (salir==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        login newframe = new login();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        dinero = (int) Float.parseFloat(dineroTotal.getText());
        float total, cambio;
        float precioCoca = (float) 0.5, precioJugo =(float) 0.45, precioGalletas =(float) 0.65, precioPapas =(float) 1.00;
        if(boton==1){
            total = producto*precioCoca;
            cambio = dinero - total;
            if(cambio>0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $"+cambio);
            }
            if(cambio<0){
                JOptionPane.showMessageDialog(rootPane, "Saldo Insuficiente. \nFaltan $"+cambio);
            }
            if(cambio==0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $0");
            }
        }
        if(boton==2){
            total = producto*precioJugo;
            cambio = dinero - total;
            if(cambio>0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $"+cambio);
            }
            if(cambio<0){
                JOptionPane.showMessageDialog(rootPane, "Saldo Insuficiente. \nFaltan $"+cambio);
            }
            if(cambio==0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $0");
            }
        }
        if(boton==3){
            total = producto*precioGalletas;
            cambio = dinero - total;
            if(cambio>0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $"+cambio);
            }
            if(cambio<0){
                JOptionPane.showMessageDialog(rootPane, "Saldo Insuficiente. \nFaltan $"+cambio);
            }
            if(cambio==0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $0");
            }
        }
        if(boton==4){
            total = producto*precioPapas;
            cambio = dinero - total;
            if(cambio>0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $"+cambio);
            }
            if(cambio<0){
                JOptionPane.showMessageDialog(rootPane, "Saldo Insuficiente. \nFaltan $"+cambio);
            }
            if(cambio==0){
                JOptionPane.showMessageDialog(rootPane, "Gracias por si compra. \nSu cambio es $0");
            }
        }
    }//GEN-LAST:event_pagoActionPerformed

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

    private void rellenar(JLabel button, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton admin;
    private javax.swing.JTextField dineroTotal;
    private javax.swing.JLabel fotoCoca;
    private javax.swing.JLabel fotoGalletas;
    private javax.swing.JLabel fotoJugo;
    private javax.swing.JLabel fotoPapas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JButton pago;
    // End of variables declaration//GEN-END:variables
}
