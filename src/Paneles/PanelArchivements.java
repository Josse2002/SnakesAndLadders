/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import snakeandladders.VentanaListPlayers;
import snakeandladders.Ventana_TopPlayers;
import snakeandladders.Ventana_inicio;
import snakeandladders.Ventana_multiplayer;
import snakeandladders.Ventana_specificplayer;
import snakeandladders.Ventanan_oneplayer;

/**
 *
 * @author JOSE
 */
public class PanelArchivements extends javax.swing.JPanel {

    /**
     * Creates new form Panel_inicio
     */
    public PanelArchivements() {
        initComponents();
        
    setResizedImageIconForButton(top3,"/Imagenes/oneplayer.png");
    setResizedImageIconForButton(btnList,"/Imagenes/multiplayer.png");
    setResizedImageIconForButton(boardButton,"/Imagenes/leaders.png");
       setResizedImageIconForButton(imageSpecific,"/Imagenes/leaders.png");
    setResizedImageIconForButton(btnsexit,"/Imagenes/exit.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        top3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnList = new javax.swing.JButton();
        btnsexit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        boardButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        boardButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        boardButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        imageSpecific = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("top 3 players");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 530, 110));

        top3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top3ActionPerformed(evt);
            }
        });
        jPanel1.add(top3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 530, 100));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LIST OF PLAYERS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 660, 110));

        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });
        jPanel1.add(btnList, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 660, 100));

        btnsexit.setText("jButton1");
        btnsexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 170, 160));

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BOARD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 110));

        boardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(boardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 100));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BOARD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 110));

        boardButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boardButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 100));

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BOARD");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 110));

        boardButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boardButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 530, 100));

        jLabel13.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SPECIFIC PLAYER");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 530, 110));

        imageSpecific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageSpecificActionPerformed(evt);
            }
        });
        jPanel1.add(imageSpecific, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 530, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void top3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top3ActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene la referencia al JFrame actual
        Ventana_TopPlayers Va = new Ventana_TopPlayers();
        Va.setVisible(true);
        frame.dispose(); // Cierra el JFrame actua
    }//GEN-LAST:event_top3ActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene la referencia al JFrame actual
        VentanaListPlayers Va = new VentanaListPlayers();
        Va.setVisible(true);
        frame.dispose(); // Cierra el JFrame actua
    }//GEN-LAST:event_btnListActionPerformed

    private void btnsexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsexitActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        Ventana_inicio vtn = new Ventana_inicio();
        vtn.setVisible(true);
        frame.dispose();
        
    }//GEN-LAST:event_btnsexitActionPerformed

    private void boardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardButtonActionPerformed

    private void boardButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardButton1ActionPerformed

    private void boardButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardButton2ActionPerformed

    private void imageSpecificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageSpecificActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
 
        Ventana_specificplayer spf = new Ventana_specificplayer();
        spf.setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_imageSpecificActionPerformed
    
    //ResizedImagenIcon for JLabel
   private void setResizedImageIcon(JLabel label, String imagePath) {
    label.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentResized(java.awt.event.ComponentEvent evt) {
            ImageIcon imagenIcono = new ImageIcon(getClass().getResource(imagePath));
            Image imagen = imagenIcono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imagen));
        }
    });
}
   
   //ResizedImageIcon for button
private void setResizedImageIconForButton(JButton button, String imagePath) {
    button.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentResized(java.awt.event.ComponentEvent evt) {
            ImageIcon imagenIcono = new ImageIcon(getClass().getResource(imagePath));
            Image imagen = imagenIcono.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(imagen));
            button.setBackground(new Color(0, 0, 0, 0));
        }
    });
}
    
    //setTransparentBackground
    private void setTransparentBackground(JComponent component) {
    component.setOpaque(false);
    component.setBackground(new Color(0, 0, 0, 0));
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boardButton;
    private javax.swing.JButton boardButton1;
    private javax.swing.JButton boardButton2;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnsexit;
    private javax.swing.JButton imageSpecific;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton top3;
    // End of variables declaration//GEN-END:variables
}