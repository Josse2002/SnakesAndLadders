/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;
import javax.swing.JFrame;
import snakeandladders.Ventana_inicio;

/**
 *
 * @author Dell
 */
public class Panel_Tablero2OnePlayer extends javax.swing.JPanel {

    private Image image;

    //  1,   2,   3,   4,   5,   6,   7,   8,   9,  10,   11,  12,  13,  14,  15,  16,  17, 18,  19,  20,  21,  22,  23,  24,  25,  26,  27,  28,  29,  30,  31,  32,  33,  34,  35,  36,  37,  38,  39,  40,  41,   42          
    int[] CasillasEnX = {40, 210, 310, 410, 510, 615, 715, 820, 820, 715, 615, 510, 410, 310, 210, 210, 310, 410, 510, 615, 715, 820, 820, 715, 615, 510, 410, 310, 210, 210, 310, 410, 510, 615, 715, 820, 820, 715, 615, 510, 410, 310, 210};
    int[] CasillasEnY = {280, 580, 580, 580, 580, 580, 580, 580, 480, 480, 480, 480, 480, 480, 480, 390, 390, 390, 390, 390, 390, 390, 290, 290, 290, 290, 290, 290, 290, 195, 195, 195, 195, 195, 195, 195, 100, 100, 100, 100, 100, 100, 100, 100};
    int PosicionPasadaP1 = 0;
    int PosicionNuevaP1 = 0;
    int P1Tiros = 0;
    int P1Escalera = 0;
    int P1Serpiente = 0;
    int P1Desbanco = 0;
    String NombreGanador;
    private TypingEffect typingEffect;
    int turno = 0;
    private static String Name_P1;
    String fechaHoraInicioString;
    String fechaHoraFinalString;
    private static int tableroId;
    private static int idFicha = 2;
    int id_competencia;
    private static String j1;

    String url = "jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_POO;TrustServerCertificate=True";
    String username = "sa";
    String password = "123456";

    public Panel_Tablero2OnePlayer() {

        initComponents();
        System.out.println(Name_P1);
        System.out.println(j1);
        panelGanador1.setVisible(false);
        NamePGanador.setVisible(false);
        MenuPGanador.setVisible(false);

        LocalDateTime fechaHoraInicio = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        fechaHoraInicioString = fechaHoraInicio.format(formatter);

        lblPollito.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/pollito_1.gif"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblPollito.getWidth(), lblPollito.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon gifIcono = new ImageIcon(imagen);
                lblPollito.setIcon(gifIcono);
            }
        });

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Fonts/Pixellari.ttf")); // Reemplaza "NombreDeTuFuente.ttf" con el nombre del archivo de tu fuente descargada
            font = font.deriveFont(Font.PLAIN, 17); // Cambia el tamaño de la fuente según tus necesidades
            MensajePollo.setFont(font);
            typingEffect = new TypingEffect(MensajePollo, "Dale click al dado " + Name_P1 + " :D", 7);
            typingEffect.start();
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace();
        }

        lblComment.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/comment.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(lblComment.getWidth(), lblComment.getHeight(), Image.SCALE_SMOOTH);
                lblComment.setIcon(new ImageIcon(imagen));
            }
        });

        P1.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource(j1));
                Image imagen = imagenIcono.getImage().getScaledInstance(P1.getWidth(), P1.getHeight(), Image.SCALE_SMOOTH);
                P1.setIcon(new ImageIcon(imagen));
            }

        });


        Jugador_1.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource(j1));
                Image imagen = imagenIcono.getImage().getScaledInstance(Jugador_1.getWidth(), Jugador_1.getHeight(), Image.SCALE_SMOOTH);
                Jugador_1.setIcon(new ImageIcon(imagen));
            }

        });



        BackButtonLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/back-button.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(BackButtonLabel.getWidth(), BackButtonLabel.getHeight(), Image.SCALE_SMOOTH);
                BackButtonLabel.setIcon(new ImageIcon(imagen));
            }

        });

        TableroLbl.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/Tablero2.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(TableroLbl.getWidth(), TableroLbl.getHeight(), Image.SCALE_SMOOTH);
                TableroLbl.setIcon(new ImageIcon(imagen));
            }

        });

        INICIO.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/Imagenes/CasillaInicio2.png"));
                Image imagen = imagenIcono.getImage().getScaledInstance(INICIO.getWidth(), INICIO.getHeight(), Image.SCALE_SMOOTH);
                INICIO.setIcon(new ImageIcon(imagen));
            }

        });

        NameP1.setText(Name_P1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPGanador = new javax.swing.JLabel();
        NamePGanador = new javax.swing.JLabel();
        panelGanador1 = new Paneles.PanelGanador();
        Dado1 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        INICIO = new javax.swing.JLabel();
        lblPollito = new javax.swing.JLabel();
        MensajePollo = new javax.swing.JLabel();
        NameP1 = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        TableroLbl = new javax.swing.JLabel();
        Jugador_1 = new javax.swing.JLabel();
        JugadorLabel1 = new javax.swing.JLabel();
        BackButtonLabel = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(590, 380));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPGanador.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        MenuPGanador.setForeground(new java.awt.Color(255, 255, 255));
        MenuPGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPGanador.setText("MEnu Principal");
        MenuPGanador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPGanadorMouseClicked(evt);
            }
        });
        add(MenuPGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 510, 120));

        NamePGanador.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        NamePGanador.setForeground(new java.awt.Color(255, 255, 255));
        NamePGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePGanador.setText("GuadalupeGooood");
        add(NamePGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 510, 120));

        panelGanador1.setOpaque(false);
        add(panelGanador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -30, 1380, 830));

        Dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado1.png"))); // NOI18N
        Dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dado1MouseClicked(evt);
            }
        });
        add(Dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, 170, 170));

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Character2.png"))); // NOI18N
        add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 70));

        INICIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Character2.png"))); // NOI18N
        add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 110));
        add(lblPollito, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 150, 130));

        MensajePollo.setFont(new java.awt.Font("VT323", 1, 18)); // NOI18N
        MensajePollo.setForeground(new java.awt.Color(0, 0, 0));
        MensajePollo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(MensajePollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 310, 50));

        NameP1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        NameP1.setForeground(new java.awt.Color(255, 255, 255));
        NameP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(NameP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 200, 70));
        add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 410, 190));
        add(TableroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -1, 715, 660));

        Jugador_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Character2.png"))); // NOI18N
        add(Jugador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, 120, 100));

        JugadorLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LabelCharacter2.png"))); // NOI18N
        add(JugadorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 320, 110));
        add(BackButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 120, 110));
    }// </editor-fold>//GEN-END:initComponents

    public void setFicha(String urlFicha1) {
        j1 = urlFicha1;
    }

    public void setMap(int map) {
        tableroId = map;
    }

    public void setPlayers(String player1) {
        Name_P1 = player1;
    }
    
    
    private void Dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dado1MouseClicked
        int numDado = (int) (Math.random() * 6) + 1;

        Icon uno = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado1.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado2.png"));
        Icon tres = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado3.png"));
        Icon cuatro = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado4.png"));
        Icon cinco = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado5.png"));
        Icon seis = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dado6.png"));

        switch (numDado) {
            case 1:
                Dado1.setIcon(uno);
                break;
            case 2:
                Dado1.setIcon(dos);
                break;
            case 3:
                Dado1.setIcon(tres);
                break;
            case 4:
                Dado1.setIcon(cuatro);
                break;
            case 5:
                Dado1.setIcon(cinco);
                break;
            case 6:
                Dado1.setIcon(seis);
                break;

        }

        if (turno == 0) {
            PonerTextoAPollo("Es el turno de " + Name_P1 + "!!");
            P1Tiros += 1;
            PosicionPasadaP1 = PosicionNuevaP1;
            PosicionNuevaP1 = PosicionPasadaP1 + numDado;

            //Condiciones para las casillas donde hay escaleras
            if (PosicionNuevaP1 == 2) {
                PosicionNuevaP1 = 18;
                P1Escalera += 1;
                PonerTextoAPollo(Name_P1 + " subio una escalera ");
            }
            if (PosicionNuevaP1 == 21) {
                PosicionNuevaP1 = 33;
                P1Escalera += 1;
                PonerTextoAPollo(Name_P1 + " subio una escalera ");
            }
            if (PosicionNuevaP1 == 16) {
                PosicionNuevaP1 = 28;
                P1Escalera += 1;
                PonerTextoAPollo(Name_P1 + " subio una escalera ");
            }

            //Condiciones para las casillas donde hay serpientes
            if (PosicionNuevaP1 == 15) {
                PosicionNuevaP1 = 11;
                P1Serpiente += 1;
                PonerTextoAPollo(Name_P1 + " cayo en una planta :(");
            }
            if (PosicionNuevaP1 == 19) {
                PosicionNuevaP1 = 6;
                P1Serpiente += 1;
                PonerTextoAPollo(Name_P1 + " cayo en una planta :(");
            }
            if (PosicionNuevaP1 == 37) {
                PosicionNuevaP1 = 31;
                P1Serpiente += 1;
                PonerTextoAPollo(Name_P1 + " cayo en una planta :(");
            }

            //Condiciones para la casilla ganadora
            if (PosicionNuevaP1 > 42) {
                PosicionNuevaP1 = PosicionPasadaP1;
            }
            if (PosicionNuevaP1 == 38) {
                if (numDado == 6 || numDado == 5) {
                    PonerTextoAPollo("Debes caer exacto para ganar");
                    PosicionNuevaP1 = 38;

                }
            }

            if (PosicionNuevaP1 == 39) {
                if (numDado == 6 || numDado == 5 || numDado == 4) {
                    PonerTextoAPollo("Debes caer exacto para ganar");
                }
            }
            if (PosicionNuevaP1 == 40) {
                if (numDado == 6 || numDado == 5 || numDado == 4 || numDado == 3) {
                    PonerTextoAPollo("Debes caer exacto para ganar");
                }
            }
            if (PosicionNuevaP1 == 41) {
                if (numDado == 6 || numDado == 5 || numDado == 4 || numDado == 3 || numDado == 2) {
                    PonerTextoAPollo("Debes caer exacto para ganar");
                }
            }
            if (PosicionNuevaP1 == 42) {
                TablaGanador(Name_P1);
                LocalDateTime fechaHoraFinal = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                fechaHoraFinalString = fechaHoraFinal.format(formatter);
                NombreGanador = Name_P1;
                enviarCompetencia();
                enviarDetalleCompetenciaP1();
            }

            

            P1.setLocation(CasillasEnX[PosicionNuevaP1], CasillasEnY[PosicionNuevaP1]);

        }


    }//GEN-LAST:event_Dado1MouseClicked

    private void MenuPGanadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPGanadorMouseClicked
        Ventana_inicio vtnI = new Ventana_inicio();
        vtnI.setVisible(true);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
    }//GEN-LAST:event_MenuPGanadorMouseClicked

    
     
     public void enviarCompetencia() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO COMPETENCIA (ganador, id_tablero, FechaHoraInicio, FechaHora) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            // Configurar los valores de los parámetros
            statement.setString(1, NombreGanador);
            statement.setInt(2, tableroId);
            statement.setString(3, fechaHoraInicioString);
            statement.setString(4, fechaHoraFinalString);

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int lastInsertedId = generatedKeys.getInt(1);
                id_competencia = lastInsertedId;
                // Aquí puedes hacer lo que necesites con el último ID insertado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     //PONEEEEEEEEEEEEEEEEER LO DE USUARIO EN LA BD
    public void enviarDetalleCompetenciaP1() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROYECTO_POO;TrustServerCertificate=True", "sa", "123456");
            String query = "INSERT INTO DETALLECOMPETENCIA (tiros, AcanceEscalera, RetrocesoSerpiente, Desbancos, id_ficha, id_competencia, idUsuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
            String obtenerIDUsuarioQuery = "{CALL ObtenerIDUsuario(?, ?)}";
            CallableStatement obtenerIDUsuarioStmt = con.prepareCall(obtenerIDUsuarioQuery);

            // Parámetros de entrada
            obtenerIDUsuarioStmt.setString(1, Name_P1);

            // Parámetros de salida
            obtenerIDUsuarioStmt.registerOutParameter(2, java.sql.Types.INTEGER);

            obtenerIDUsuarioStmt.execute();
            int idUsuario = obtenerIDUsuarioStmt.getInt(2);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, P1Tiros);
            ps.setInt(2, P1Escalera);
            ps.setInt(3, P1Serpiente);
            ps.setInt(4, P1Desbanco);
            ps.setInt(5, idFicha);
            ps.setInt(6, id_competencia);
            ps.setInt(7, idUsuario);

            ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

    public void PonerTextoAPollo(String msg) {
        MensajePollo.setText(msg);

        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                P1.setLocation(CasillasEnX[PosicionNuevaP1], CasillasEnY[PosicionNuevaP1]);
            }
        });

        timer.setRepeats(false);
        timer.start();
    }

    public void TablaGanador(String NameGanador) {
        panelGanador1.setVisible(true);
        NamePGanador.setVisible(true);
        MenuPGanador.setVisible(true);

        NamePGanador.setText(NameGanador);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButtonLabel;
    private javax.swing.JLabel Dado1;
    private javax.swing.JLabel INICIO;
    private javax.swing.JLabel JugadorLabel1;
    private javax.swing.JLabel Jugador_1;
    private javax.swing.JLabel MensajePollo;
    private javax.swing.JLabel MenuPGanador;
    private javax.swing.JLabel NameP1;
    private javax.swing.JLabel NamePGanador;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel TableroLbl;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblPollito;
    private Paneles.PanelGanador panelGanador1;
    // End of variables declaration//GEN-END:variables

}
