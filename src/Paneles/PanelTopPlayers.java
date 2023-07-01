package Paneles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import snakeandladders.Ventana_fichas;
import snakeandladders.Ventana_ladeboard;

public final class PanelTopPlayers extends javax.swing.JPanel {

//Variables globales
    private Timer timer;

    public PanelTopPlayers() {
        initComponents();
        //Metodos y configuraciones del jFrame
        configurarTabla();
        configurandoBotonBack();
        configurarHeader();
        configurarTablaAzul();

        timer = new Timer(2, e -> {
            // Cambiar a la siguiente ventana (Ventana_mapa)
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
           Ventana_ladeboard mp = new Ventana_ladeboard ();
            frame.dispose();
            mp.setVisible(true);
        });
        timer.setRepeats(false); // Para que el Timer solo se ejecute una vez
        
        configurandoTabla();
    }
    
    public void configurandoTabla(){
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jTable1.setShowGrid(false);
        jTable1.setBorder(BorderFactory.createEmptyBorder()); // Quítale el borde al JTable

        JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.red); // Cambia el color de fondo

        // También puedes quitar el borde de la tabla azul, si lo deseas
        lblTablaAzul.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public void configurarTabla() {
        lblTabla.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/Tabla.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblTabla.getWidth(), lblTabla.getHeight(), Image.SCALE_SMOOTH);
                lblTabla.setIcon(new ImageIcon(imagen));
            }
        });

    }

  

    public void configurarTablaAzul() {
        lblTabla.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/blueTable.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblTablaAzul.getWidth(), lblTablaAzul.getHeight(), Image.SCALE_SMOOTH);
                lblTablaAzul.setIcon(new ImageIcon(imagen));
            }
        });

    }

    public final void configurandoBotonBack() {
        botonBack.setOpaque(false); // Hacer el botón transparente
        botonBack.setContentAreaFilled(false); // Establecer el área de contenido del botón como transparente
        botonBack.setBorderPainted(false);

        botonBack.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/back-button.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(botonBack.getWidth(), botonBack.getHeight(), Image.SCALE_SMOOTH);
                botonBack.setIcon(new ImageIcon(imagen));
            }
        });
    }

    public void configurarHeader() {
        lblHeader.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/registrer.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblHeader.getWidth(), lblHeader.getHeight(), Image.SCALE_SMOOTH);
                lblHeader.setIcon(new ImageIcon(imagen));
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonBack = new javax.swing.JButton();
        lblTablaAzul = new javax.swing.JLabel();
        lblTabla = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(590, 380));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setMaximumSize(new java.awt.Dimension(1350, 800));
        jPanel3.setOpaque(false);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOP 3 PLAYERS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 70));
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 450, 80));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "3", "5"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAlignmentX(0.6F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setEditingColumn(2);
        jTable1.setEditingRow(2);
        jTable1.setEnabled(false);
        jTable1.setOpaque(false);
        jTable1.setRowHeight(60);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 790, 330));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1080, 640));

        botonBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBack.setBorder(null);
        botonBack.setBorderPainted(false);
        botonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackActionPerformed(evt);
            }
        });
        jPanel4.add(botonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 120, 110));
        jPanel4.add(lblTablaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 980, 470));
        jPanel4.add(lblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1060, 610));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 1200, 780));

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-155, -5, 1350, 800));

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    //---------EVENTOS-------------
    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed

        timer.start();

    }//GEN-LAST:event_botonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JLabel lblTablaAzul;
    // End of variables declaration//GEN-END:variables

}
