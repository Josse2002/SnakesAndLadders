/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import snakeandladders.Ventana_Registro;
import snakeandladders.Ventana_fichas;
import snakeandladders.Ventana_inicio;

/**
 *
 * @author Admin
 */
public class Panel_multiplayer extends javax.swing.JPanel {

    private TypingEffect typingEffect;

    public Panel_multiplayer() {
        initComponents();
        //TrabsparentButton FieldText 
        setTransparentBackground(txtnombre1);
        setTransparentBackground(txtnombre2);
        //setTransparentBackground(txtsex);
        //ResizedImage   
        setResizedImageIcon(LblTabla, "/Imagenes/Tabla.png");
        setResizedImageIcon(lblusername1, "/Imagenes/username.png");
        setResizedImageIcon(lblusernameWrite1, "/Imagenes/usernameWrite.png");
        setResizedImageIcon(lblusername2, "/Imagenes/username.png");
        setResizedImageIcon(lblusernameWrite2, "/Imagenes/usernameWrite.png");
        setResizedImageIconForButton(btnlogin2, "/Imagenes/login.png");
        setResizedImageIcon(lblcheck, "/Imagenes/check.png");
        lblcheck.setVisible(false);
        setResizedImageIconForButton(btnback, "/Imagenes/back-button.png");
        setResizedImageIconForButton(btnregister, "/Imagenes/registrer.png");
        addgif(lblpollito, "/Imagenes/pollito_1.gif");
        setResizedImageIcon(lblmensaje, "/Imagenes/comment.png");
        addgif(lblgato, "/Imagenes/GatoBongo.gif");
        setResizedImageIcon(lblmensajeg, "/Imagenes/comment.png");

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Fonts/Pixellari.ttf")); // Reemplaza "NombreDeTuFuente.ttf" con el nombre del archivo de tu fuente descargada
            font = font.deriveFont(Font.PLAIN, 17); // Cambia el tamaño de la fuente según tus necesidades
            MensajePollo.setFont(font);
            typingEffect = new TypingEffect(Mensajegato, "Ingrese el nombre del usuario", 7);
            typingEffect.start();

            typingEffect = new TypingEffect(MensajePollo, "      . . .      ", 7);
            typingEffect.start();
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();

        }
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
        lbldescripcion1 = new javax.swing.JLabel();
        lblusername1 = new javax.swing.JLabel();
        txtnombre2 = new javax.swing.JTextField();
        lblusernameWrite1 = new javax.swing.JLabel();
        lbldescripcion2 = new javax.swing.JLabel();
        lblusername2 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        lblusernameWrite2 = new javax.swing.JLabel();
        lbldescripcionlogin = new javax.swing.JLabel();
        lblcheck = new javax.swing.JLabel();
        btnlogin2 = new javax.swing.JButton();
        lbldescripcionregistro = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        lblpollito = new javax.swing.JLabel();
        MensajePollo = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        lblgato = new javax.swing.JLabel();
        Mensajegato = new javax.swing.JLabel();
        lblmensajeg = new javax.swing.JLabel();
        LblTabla = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldescripcion1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbldescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        lbldescripcion1.setText("Username player 1");
        jPanel1.add(lbldescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 240, 40));

        lblusername1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jPanel1.add(lblusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 480, 80));

        txtnombre2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        txtnombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre2.setBorder(null);
        txtnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 500, 50));
        jPanel1.add(lblusernameWrite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 620, 90));

        lbldescripcion2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbldescripcion2.setForeground(new java.awt.Color(255, 255, 255));
        lbldescripcion2.setText("Username player 2");
        jPanel1.add(lbldescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 250, 40));

        lblusername2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jPanel1.add(lblusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 490, 80));

        txtnombre1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        txtnombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre1.setBorder(null);
        txtnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 500, 50));
        jPanel1.add(lblusernameWrite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 620, 90));

        lbldescripcionlogin.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        lbldescripcionlogin.setForeground(new java.awt.Color(255, 255, 255));
        lbldescripcionlogin.setText("login");
        jPanel1.add(lbldescripcionlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 140, 40));
        jPanel1.add(lblcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 70, 70));

        btnlogin2.setText("jButton1");
        btnlogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 360, 110));

        lbldescripcionregistro.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        lbldescripcionregistro.setForeground(new java.awt.Color(255, 255, 255));
        lbldescripcionregistro.setText("Register");
        jPanel1.add(lbldescripcionregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 190, 40));

        btnregister.setText("jButton1");
        btnregister.setBorder(null);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 410, 130));
        jPanel1.add(lblpollito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 190, 150));

        MensajePollo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MensajePollo.setText("Ingrese el nombre del usuario");
        jPanel1.add(MensajePollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 310, 80));

        lblmensaje.setText("jLabel1");
        jPanel1.add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 420, 180));
        jPanel1.add(lblgato, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 190, 150));

        Mensajegato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mensajegato.setText("   Ingrese el nombre del usuario");
        jPanel1.add(Mensajegato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 400, 80));

        lblmensajeg.setText("jLabel1");
        jPanel1.add(lblmensajeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 480, 180));

        LblTabla.setText("jLabel1");
        jPanel1.add(LblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 991, 686));

        btnback.setText("jButton1");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 170, 150));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1410, 740));
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

    public static void addgif(JLabel label, String rutaImagen) {
        label.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource(rutaImagen));
                Image imagen = imagenIcono.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon icono = new ImageIcon(imagen);
                label.setIcon(icono);
            }
        });
    }

    //setTransparentBackground
    private void setTransparentBackground(JComponent component) {
        component.setOpaque(false);
        component.setBackground(new Color(0, 0, 0, 0));
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


    private void txtnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre1ActionPerformed

    private void btnlogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin2ActionPerformed
        // Declaración de variables
    String usuario1 = txtnombre1.getText();
    String usuario2 = txtnombre2.getText();
    boolean aliasCorrectos = false;

    if (usuario1.isEmpty() || usuario2.isEmpty()) {
        // Mostrar mensaje de error si falta ingresar algún usuario
        typingEffect = new TypingEffect(MensajePollo, "Debes ingresar el nombre del usuario", 7);
        typingEffect.start();
    } else {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_POO;TrustServerCertificate=True;",
                    "sa", "123456");
            String consulta = "SELECT COUNT(*) AS existe FROM USUARIO WHERE alias = ? OR alias = ?";

            PreparedStatement sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, usuario1);
            sentencia.setString(2, usuario2);
            ResultSet resultado = sentencia.executeQuery();

            if (resultado.next()) {
                int existe = resultado.getInt("existe");

                if (existe == 2) {
                    aliasCorrectos = true;
                    // Mostrar mensaje de inicio de sesión exitoso
                    typingEffect = new TypingEffect(Mensajegato, "Inicio de sesión exitoso", 7);
                    typingEffect.start();
                } else {
                    // Mostrar mensaje de usuario no registrado
                    typingEffect = new TypingEffect(Mensajegato, "El Usuario no está registrado", 7);
                    typingEffect.start();
                }
            }

            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    // Verificar el valor de aliasCorrectos y mostrar/ocultar lblcheck en consecuencia
    if (aliasCorrectos) {
        // Hacer visible el lblcheck
        lblcheck.setVisible(true);

        // Crear la instancia de Panel_ficha y Ventana_fichas
       Panel_ficha pf = new Panel_ficha();
        pf.getGameMode(2);
        pf.getPlayers(usuario1, usuario2);

        Ventana_fichas vf = new Ventana_fichas();
        vf.setVisible(true);

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
    } else {
        // Ocultar el lblcheck
        lblcheck.setVisible(false);
    }

    }//GEN-LAST:event_btnlogin2ActionPerformed

    private void txtnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre2ActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene la referencia al JFrame actual
        Ventana_Registro Va = new Ventana_Registro();
//        Panel_registro Pr = new Panel_registro();
//        Pr.setback(1);
        Va.setVisible(true);
        frame.dispose(); // Cierra el JFrame actual

    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Obtiene la referencia al JFrame actual
        Ventana_inicio VI = new Ventana_inicio();

        VI.setVisible(true);
        frame.dispose(); // Cierra el JFrame actual
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTabla;
    private javax.swing.JLabel MensajePollo;
    private javax.swing.JLabel Mensajegato;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogin2;
    private javax.swing.JButton btnregister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcheck;
    private javax.swing.JLabel lbldescripcion1;
    private javax.swing.JLabel lbldescripcion2;
    private javax.swing.JLabel lbldescripcionlogin;
    private javax.swing.JLabel lbldescripcionregistro;
    private javax.swing.JLabel lblgato;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensajeg;
    private javax.swing.JLabel lblpollito;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JLabel lblusername2;
    private javax.swing.JLabel lblusernameWrite1;
    private javax.swing.JLabel lblusernameWrite2;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    // End of variables declaration//GEN-END:variables
}
