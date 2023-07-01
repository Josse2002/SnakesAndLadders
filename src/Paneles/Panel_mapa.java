package Paneles;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import snakeandladders.Ventana_Tablero1;
import snakeandladders.Ventana_fichas;

public final class Panel_mapa extends javax.swing.JPanel {

//Variables globales
    private static int TURN = 1;
    private static int MODE_PLAYER = 2;
    private static int selectedMap = -1;
    private TypingEffect typingEffect;
    private Timer timer;

    private static String Ficha1;
    private static String Ficha2;
    private static String j1;
    private static String j2;
            
    
    public Panel_mapa() {
        initComponents();
        //Metodos y configuraciones del jFrame
        configurarTabla();
        obtenerMapas();
        configurandoBotonBack();
        configurandoBotonNext();
        configurarHeader();
        configurandoGuia();
        timer = new Timer(2, e -> {
            // Cambiar a la siguiente ventana (Ventana_mapa)
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            Ventana_fichas mp = new Ventana_fichas();
            Panel_ficha pf = new Panel_ficha();
            frame.dispose();
            mp.setVisible(true);
        });
        timer.setRepeats(false); // Para que el Timer solo se ejecute una vez

        
    }
    
    public void getPlayers(String p1, String p2){
        j1 = p1;
        j2=p2;
     
    };
    
    public void getFicha(String f1, String f2){
        Ficha1 = f1;
        Ficha2 = f2;
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

    public void obtenerMapas() {
         panelMapa.setLayout(new GridLayout(1, 3, 10, 10)); // 3 filas, 5 columnas, con margen interno de 10 píxeles
        String url = "jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_POO;TrustServerCertificate=True;";
        String usuario = "sa";
        String contraseña = "123456";
        try (Connection connection = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "{call getMapas}"; //Nombre del procedimiento almacenado
            CallableStatement callableStatement = connection.prepareCall(sql);

            boolean hasResults = callableStatement.execute();

            while (hasResults) {
                try (ResultSet resultSet = callableStatement.getResultSet()) {
                    // Recorre los resultados de la tabla devuelta por el procedimiento almacenado
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String imagen = resultSet.getString("imagen");
                        // Hacer algo con los valores recuperados...
                        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/Mapas/"+ imagen +".png")));
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                        label.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                          
                                selectedMap = id;
                            
                                MensajePollo.setText("Has seleccionado un mapa");
                            }
                        });

                        panelMapa.add(label);
                        panelMapa.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
                    }
                }
                hasResults = callableStatement.getMoreResults();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    private void configurandoBotonNext() {
        botonNext.setOpaque(false); // Hacer el botón transparente
        botonNext.setContentAreaFilled(false); // Establecer el área de contenido del botón como transparente
        botonNext.setBorderPainted(false);

        botonNext.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/next-button.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(botonNext.getWidth(), botonNext.getHeight(), Image.SCALE_SMOOTH);
                botonNext.setIcon(new ImageIcon(imagen));
            }
        });
    }

    public void configurarHeader() {
        lblHeader.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/header.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblHeader.getWidth(), lblHeader.getHeight(), Image.SCALE_SMOOTH);
                lblHeader.setIcon(new ImageIcon(imagen));
            }
        });
    }

    private void configurandoGuia() {

        lblPollo.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/pollito_1.gif"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblPollo.getWidth(), lblPollo.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon gifIcono = new ImageIcon(imagen);
                lblPollo.setIcon(gifIcono);
            }
        });

        lblComment.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/comment.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblComment.getWidth(), lblComment.getHeight(), Image.SCALE_SMOOTH);
                lblComment.setIcon(new ImageIcon(imagen));
            }
        });

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Fonts/Pixellari.ttf")); // Reemplaza "NombreDeTuFuente.ttf" con el nombre del archivo de tu fuente descargada
            font = font.deriveFont(Font.PLAIN, 17); // Cambia el tamaño de la fuente según tus necesidades
            MensajePollo.setFont(font);
            typingEffect = new TypingEffect(MensajePollo, "Es el turno de elegir un mapa", 7);
            typingEffect.start();
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }

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
        jLabel1 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelMapa = new javax.swing.JPanel();
        lblTabla = new javax.swing.JLabel();
        botonBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblPollo = new javax.swing.JLabel();
        MensajePollo = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        botonNext = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(590, 380));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setMaximumSize(new java.awt.Dimension(1350, 800));
        jPanel3.setOpaque(false);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your board");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 70));
        jPanel5.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 450, 80));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMapa.setOpaque(false);
        jPanel1.add(panelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 810, 490));
        jPanel1.add(lblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 890, 470));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1080, 500));

        botonBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBack.setBorder(null);
        botonBack.setBorderPainted(false);
        botonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackActionPerformed(evt);
            }
        });
        jPanel4.add(botonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, 110));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(lblPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 130));

        MensajePollo.setFont(new java.awt.Font("VT323", 1, 18)); // NOI18N
        MensajePollo.setForeground(new java.awt.Color(0, 0, 0));
        MensajePollo.setText("Ahora es el turno del jugador 2");
        jPanel6.add(MensajePollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 22, -1, 20));
        jPanel6.add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -20, 390, 150));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 510, 160));

        botonNext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonNext.setBorder(null);
        botonNext.setBorderPainted(false);
        botonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNextActionPerformed(evt);
            }
        });
        jPanel4.add(botonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 120, 110));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 1200, 690));

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-155, -5, 1350, 800));

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    //---------EVENTOS-------------
    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        MensajePollo.setText("Regresando...");
        timer.start();
        
    }//GEN-LAST:event_botonBackActionPerformed

    private void botonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNextActionPerformed
        if (selectedMap != -1) {
            MensajePollo.setText("Cargando...");
            System.out.println(j1 + "este dato se pasa mal");
            Panel_Tablero1 pt1 = new Panel_Tablero1();
            pt1.setFicha(Ficha1, Ficha2);
            pt1.setPlayers(j1, j2);
           
            pt1.setMap(selectedMap);
            
            Ventana_Tablero1 vtn = new Ventana_Tablero1();
            vtn.setVisible(true);
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            
            
        }
    }//GEN-LAST:event_botonNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MensajePollo;
    private javax.swing.JButton botonBack;
    private javax.swing.JButton botonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JPanel panelMapa;
    // End of variables declaration//GEN-END:variables

}
