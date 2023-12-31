/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author santo
 */
public class PanelGanador extends javax.swing.JPanel {

    /**
     * Creates new form PanelGanador
     */
    public PanelGanador() {
        initComponents();
        
        MenuWinner.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/MenuPrincipalWinner.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(MenuWinner.getWidth(), MenuWinner.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon tablaIcono = new ImageIcon(imagen);
                MenuWinner.setIcon(tablaIcono);
            }
        });
        
        GatoBongoLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/GatoBongo.gif"));
                Image imagen = imagenIcono.getImage().getScaledInstance(GatoBongoLabel.getWidth(), GatoBongoLabel.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon gifIcono = new ImageIcon(imagen);
                GatoBongoLabel.setIcon(gifIcono);
            }
        });
        
        Confetti.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/Confetti.gif"));
                Image imagen = imagenIcono.getImage().getScaledInstance(Confetti.getWidth(), Confetti.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon gifIcono = new ImageIcon(imagen);
                Confetti.setIcon(gifIcono);
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confetti = new javax.swing.JLabel();
        NameP1 = new javax.swing.JLabel();
        LabelNameWinner = new javax.swing.JLabel();
        GatoBongoLabel = new javax.swing.JLabel();
        NumberOne1 = new javax.swing.JLabel();
        NumberOne = new javax.swing.JLabel();
        MenuWinner = new javax.swing.JLabel();
        Tabla = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(Confetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        NameP1.setFont(new java.awt.Font("Showcard Gothic", 1, 70)); // NOI18N
        NameP1.setForeground(new java.awt.Color(255, 255, 255));
        NameP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameP1.setText("congratulations!!!");
        add(NameP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 840, 200));

        LabelNameWinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TablaWinner.png"))); // NOI18N
        add(LabelNameWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));
        add(GatoBongoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 180, 190));

        NumberOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NumberOne.png"))); // NOI18N
        add(NumberOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        NumberOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NumberOne.png"))); // NOI18N
        add(NumberOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, -1, -1));

        MenuWinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuPrincipalWinner.png"))); // NOI18N
        add(MenuWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 530, 120));

        Tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla.png"))); // NOI18N
        add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 1030, 610));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confetti;
    private javax.swing.JLabel GatoBongoLabel;
    private javax.swing.JLabel LabelNameWinner;
    private javax.swing.JLabel MenuWinner;
    private javax.swing.JLabel NameP1;
    private javax.swing.JLabel NumberOne;
    private javax.swing.JLabel NumberOne1;
    private javax.swing.JLabel Tabla;
    // End of variables declaration//GEN-END:variables
}
