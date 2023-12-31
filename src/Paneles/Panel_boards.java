/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import snakeandladders.Ventana_ladeboard;

/**
 *
 * @author Admin
 */
public class Panel_boards extends javax.swing.JPanel {

    /**
     * Creates new form Panel_boards
     */
    public Panel_boards() {
        initComponents();
        
        setResizedImageIcon(LblTabla, "/Imagenes/Tabla.png");
        setResizedImageIcon(lblboards1, "/Imagenes/boards.png");
        setResizedImageIcon(lblboards2, "/Imagenes/boards.png");
        setResizedImageIcon(lblboards3, "/Imagenes/boards.png");
        setResizedImageIcon(lblusername, "/Imagenes/username.png");
        setResizedImageIcon(lblimagenTablero1, "/Imagenes/Tablero1.png");
        setResizedImageIcon(lblimagentablero2, "/Imagenes/Tablero2.png");
        setResizedImageIcon(lblimagentablero3, "/Imagenes/Tablero3.png");
        setResizedImageIconForButton(btnback, "/Imagenes/back-button.png");
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
        jLabel3 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblimagentablero3 = new javax.swing.JLabel();
        lblboards3 = new javax.swing.JLabel();
        lblimagenTablero1 = new javax.swing.JLabel();
        lblboards1 = new javax.swing.JLabel();
        lblimagentablero2 = new javax.swing.JLabel();
        lblboards2 = new javax.swing.JLabel();
        LblTabla = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("              Boards");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 340, 40));

        lblusername.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 510, 110));

        btnback.setText("jButton1");
        btnback.setBorder(null);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 170, 150));

        lblimagentablero3.setText("jLabel4");
        jPanel1.add(lblimagentablero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 230, 200));

        lblboards3.setText("jLabel1");
        jPanel1.add(lblboards3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 270, 310));

        lblimagenTablero1.setText("jLabel4");
        jPanel1.add(lblimagenTablero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, 200));

        lblboards1.setText("jLabel1");
        jPanel1.add(lblboards1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 270, 310));

        lblimagentablero2.setText("jLabel4");
        jPanel1.add(lblimagentablero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 230, 200));

        lblboards2.setText("jLabel1");
        jPanel1.add(lblboards2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 270, 310));

        LblTabla.setText("jLabel1");
        jPanel1.add(LblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 991, 686));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1390, 720));
    }// </editor-fold>//GEN-END:initComponents
    
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
    
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene la referencia al JFrame actual
        Ventana_ladeboard VL = new Ventana_ladeboard();

        VL.setVisible(true);
        frame.dispose(); // Cierra el JFrame actual
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTabla;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblboards1;
    private javax.swing.JLabel lblboards2;
    private javax.swing.JLabel lblboards3;
    private javax.swing.JLabel lblimagenTablero1;
    private javax.swing.JLabel lblimagentablero2;
    private javax.swing.JLabel lblimagentablero3;
    private javax.swing.JLabel lblusername;
    // End of variables declaration//GEN-END:variables
}
