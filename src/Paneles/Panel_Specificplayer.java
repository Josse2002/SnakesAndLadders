/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.awt.Color;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import snakeandladders.Ventana_ladeboard;

/**
 *
 * @author Admin
 */
public class Panel_Specificplayer extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Specificplayer
     */
    public Panel_Specificplayer() {
        initComponents();
        setResizedImageIcon(LblTabla, "/Imagenes/Tabla.png");
        setResizedImageIcon(lblusername1, "/Imagenes/username.png");
        setResizedImageIcon(lbldescripcion, "/Imagenes/usernameWrite.png");
        setResizedImageIcon(lblusername, "/Imagenes/username.png");
        setResizedImageIcon(txtresultado, "/Imagenes/greenTable.png");
        setResizedImageIconForButton(btnback, "/Imagenes/back-button.png");
        setResizedImageIconForButton(btnBuscar, "/Imagenes/login.png");
        configurandoTabla();
    }
    
    public void configurandoTabla(){
        tablaPlayerSpecific.setOpaque(false);
        ((DefaultTableCellRenderer) tablaPlayerSpecific.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tablaPlayerSpecific.setShowGrid(false);
        tablaPlayerSpecific.setBorder(BorderFactory.createEmptyBorder()); // Quítale el borde al JTable

        JTableHeader Theader = tablaPlayerSpecific.getTableHeader();
        Theader.setBackground(Color.red); // Cambia el color de fondo
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlayerSpecific = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lblusername1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lbldescripcion = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        LblTabla = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        tablaPlayerSpecific.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        tablaPlayerSpecific.setForeground(new java.awt.Color(255, 255, 255));
        tablaPlayerSpecific.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Alias", "Sexo", "Edad"
            }
        ));
        tablaPlayerSpecific.setToolTipText("");
        tablaPlayerSpecific.setAlignmentX(0.6F);
        tablaPlayerSpecific.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaPlayerSpecific.setEditingColumn(2);
        tablaPlayerSpecific.setEditingRow(2);
        tablaPlayerSpecific.setEnabled(false);
        tablaPlayerSpecific.setOpaque(false);
        tablaPlayerSpecific.setRowHeight(60);
        jScrollPane1.setViewportView(tablaPlayerSpecific);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 680, 260));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 150, 40));

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

        lblusername1.setText("jLabel1");
        jPanel1.add(lblusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 230, 90));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 290, 50));

        lbldescripcion.setText("jLabel2");
        jPanel1.add(lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 360, 80));

        txtresultado.setText("jLabel4");
        jPanel1.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 760, 330));

        btnBuscar.setText("jButton1");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 170, 80));

        LblTabla.setText("jLabel1");
        jPanel1.add(LblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 991, 686));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   Specific player");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 340, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1410, 720));
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            System.out.println("CAMBIANDO");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_POO;TrustServerCertificate=True", "sa", "123456");
            String query = "{CALL BuscarUsuario(?)}";
            CallableStatement stmt = con.prepareCall(query);

            // Parámetros de entrada
            stmt.setString(1, txtusername.getText());

            ResultSet rs = stmt.executeQuery();

            // Crear el modelo de tabla
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Alias");
            model.addColumn("Sexo");
            model.addColumn("Edad");

            // Agregar los datos al modelo
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String alias = rs.getString("alias");
                String sexo = rs.getString("sexo");
                String edad = rs.getString("edad");

                model.addRow(new Object[]{id, nombre, alias, sexo, edad});
            }

            // Asignar el modelo a la tabla
            tablaPlayerSpecific.setModel(model);

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private String obtenerContrincante(Connection conexion, String fechaInicio, String alias) throws SQLException {
        String sql = "SELECT alias FROM USUARIO WHERE imagen IN (SELECT imagen FROM FICHA WHERE id IN (SELECT id_ficha FROM DETALLECOMPETENCIA WHERE id_competencia IN (SELECT id FROM COMPETENCIA WHERE Fecha_inicio = ? AND ganador IS NOT NULL AND ganador <> ?)))";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, fechaInicio);
        stmt.setString(2, alias);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getString("alias");
        } else {
            return "Desconocido";
        }


    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JTable tablaPlayerSpecific;
    private javax.swing.JLabel txtresultado;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
