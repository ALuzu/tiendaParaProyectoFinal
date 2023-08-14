package Views;


import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
        this.rellenar(this.cocaCola,"src/imagenes/cocacola1.jpg");
        this.rellenar(this.jugo,"src/imagenes/jugo1.jpg");
        this.rellenar(this.galletas,"src/imagenes/galletas1.jpeg");
        this.rellenar(this.papas,"src/imagenes/papas.jpeg");
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
        jugo = new javax.swing.JButton();
        cocaCola = new javax.swing.JButton();
        galletas = new javax.swing.JButton();
        papas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel2.setText("Bienvenido, Eliga su producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, 30));

        pago.setText("REALIZAR PAGO");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        jPanel1.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel1.setText("Ingrese el dinero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 30));
        jPanel1.add(dineroTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, -1));

        jugo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugo1.jpg"))); // NOI18N
        jugo.setToolTipText("Jugo - $0.45");
        jugo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugoActionPerformed(evt);
            }
        });
        jPanel1.add(jugo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 130));

        cocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cocacola1.jpg"))); // NOI18N
        cocaCola.setToolTipText("Coca Cola - $0.50");
        cocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocaColaActionPerformed(evt);
            }
        });
        jPanel1.add(cocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 130));

        galletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/galletas1.jpeg"))); // NOI18N
        galletas.setToolTipText("Galletas - $0.65");
        galletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galletasActionPerformed(evt);
            }
        });
        jPanel1.add(galletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 130));

        papas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papas.jpeg"))); // NOI18N
        papas.setToolTipText("Papas - $1.00");
        papas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasActionPerformed(evt);
            }
        });
        jPanel1.add(papas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
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

    private void cocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocaColaActionPerformed
        producto=producto+1;
        boton=1;
    }//GEN-LAST:event_cocaColaActionPerformed

    private void jugoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugoActionPerformed
        producto=producto+1;
        boton=2;
    }//GEN-LAST:event_jugoActionPerformed

    private void galletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galletasActionPerformed
        producto=producto+1;
        boton=3;
    }//GEN-LAST:event_galletasActionPerformed

    private void papasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasActionPerformed
        producto=producto+1;
        boton=4;
    }//GEN-LAST:event_papasActionPerformed

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

    private void rellenar(JButton button, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton admin;
    private javax.swing.JButton cocaCola;
    private javax.swing.JTextField dineroTotal;
    private javax.swing.JButton galletas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugo;
    private javax.swing.JButton pago;
    private javax.swing.JButton papas;
    // End of variables declaration//GEN-END:variables
}
