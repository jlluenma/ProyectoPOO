package formularios;

import clases.usuario;

import javax.swing.*;
import java.sql.*;

public class IniciarSesion extends javax.swing.JFrame {
    private JPanel loginPanel;
    private JLabel tituloInicio;
    private JTextField tfUser;
    private JPasswordField pfpassword;
    private JLabel usrName;
    private JLabel usrPw;
    private JButton entrarButton;
    private JButton registrarUsuarioButton;
    public usuario nuevoUsuario;

    public IniciarSesion() {
        initComponents();
    }

    private void initComponents() {
        loginPanel = new javax.swing.JPanel();
        tituloInicio = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        registrarUsuarioButton = new javax.swing.JButton();
        usrName = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        usrPw = new javax.swing.JLabel();
        pfpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setToolTipText("");

        tituloInicio.setText("Iniciar Sesión");

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        registrarUsuarioButton.setText("Registrar Usuario");
        registrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioButtonActionPerformed(evt);
            }
        });

        usrName.setText("Usuario");

        usrPw.setText("Contraseña");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tituloInicio)
                                                        .addComponent(entrarButton)))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(registrarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(usrName)
                                                        .addComponent(tfUser)
                                                        .addComponent(usrPw)
                                                        .addComponent(pfpassword))))
                                .addContainerGap(143, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tituloInicio)
                                .addGap(18, 18, 18)
                                .addComponent(usrName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usrPw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(entrarButton)
                                .addGap(18, 18, 18)
                                .addComponent(registrarUsuarioButton)
                                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //validar credenciales y enviar al Menu
        String usuario = tfUser.getText();
        String contrasena = String.valueOf(pfpassword.getPassword());

        nuevoUsuario = getAutenticador(usuario,contrasena);

        if(nuevoUsuario != null){
            dispose();
        }else{
            JOptionPane.showMessageDialog(IniciarSesion.this,
                    "Usuario o contraseña inválidos",
                    "Intenta de nuevo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private usuario getAutenticador(String usuario, String contrasena) {
        usuario nuevoUsuario = null;
        final String URL = "jdbc:sqlserver://LAPTOP-LBTTUPNM:1433;databaseName=KentuckyFriedChicken;encrypt=true;trustServerCertificate=true";
        final String USER = "sa";
        String PSWRD = "123456";

        try{
            Connection conn = DriverManager.getConnection(URL,USER,PSWRD);

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Usuario WHERE usuario=? AND contrasena=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,usuario);
            pstmt.setString(2,contrasena);

            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                nuevoUsuario = new usuario();
                //nuevoUsuario.nombres = resultSet.getString("nombres");
                //nuevoUsuario.email = resultSet.getString("email");
                //nuevoUsuario.telefono = resultSet.getString("telefono");
                nuevoUsuario.usuario = resultSet.getString("usuario");
                nuevoUsuario.contrasena =  resultSet.getString("contrasena");
                }
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevoUsuario;
    }

    private void registrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        RegistrationForm registro = new RegistrationForm();
        registro.setIniciarSesion(this);
        registro.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });

        IniciarSesion iniciarSesion = new IniciarSesion();
        usuario nuevoUsuario = iniciarSesion.nuevoUsuario;
        if(nuevoUsuario != null){
            System.out.println("Usuario encontrado: " + nuevoUsuario.usuario);
        }else{
            System.out.println("Usuario no encontrado");
        }
    }
}
