package formularios;

import clases.usuario;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegistrationForm extends javax.swing.JFrame {
    private JTextField tfnombres;
    private JTextField tfemail;
    private JTextField tftelefono;
    private JTextField tfusuario;
    private JPasswordField tfcontrasena;
    private JPasswordField tfconfirmarContrasena;
    private JButton okButton;
    private JButton cancelarButton;
    private JPanel registroPanel;
    private JLabel tituloRegistro;
    private JLabel jlNombres;
    private JLabel jlEmail;
    private JLabel jlTelefono;
    private JLabel jlUsuario;
    private JLabel jlContrasena;
    private JLabel jlCContrasena;
    private IniciarSesion iniciarSesion;

    public RegistrationForm() {
        initComponents();
    }

    private void initComponents() {
        registroPanel = new javax.swing.JPanel();
        tituloRegistro = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jlNombres = new javax.swing.JLabel();
        tfnombres = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContrasena = new javax.swing.JLabel();
        jlCContrasena = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        tftelefono = new javax.swing.JTextField();
        tfusuario = new javax.swing.JTextField();
        tfcontrasena = new javax.swing.JPasswordField();
        tfconfirmarContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloRegistro.setText("Registrar Usuario");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent event) {
                cancelarButtonActionPerformed(event);
            }
        });

        jlNombres.setText("Nombres");

        jlEmail.setText("Email");

        jlTelefono.setText("Phone");

        jlUsuario.setText("Nombre de Usuario");

        jlContrasena.setText("Contraseña");

        jlCContrasena.setText("Confirmar Contraseña");

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cancelarButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(148, 148, 148))
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(154, 154, 154)
                                                .addComponent(tituloRegistro))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(jlCContrasena)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(tfconfirmarContrasena))
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jlNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jlUsuario)
                                                                        .addComponent(jlContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(tfusuario, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tftelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfemail, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfnombres, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(tituloRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlNombres)
                                        .addComponent(tfnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlEmail)
                                        .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlTelefono)
                                        .addComponent(tftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlUsuario)
                                        .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlContrasena)
                                        .addComponent(tfcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlCContrasena)
                                        .addComponent(tfconfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(okButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarButton)
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        registrarUsuario();
    }

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent event) {
        iniciarSesion.setVisible(true);
        this.setVisible(false);
    }

    public void setIniciarSesion(IniciarSesion iniciarSesion){
        this.iniciarSesion = iniciarSesion;
    }

    private void registrarUsuario() {
        String nombre = tfnombres.getText();
        String email = tfemail.getText();
        String telefono = tftelefono.getText();
        String usuario = tfusuario.getText();
        String contrasena = String.valueOf(tfcontrasena.getPassword());
        String confirmarContrasena = String.valueOf(tfconfirmarContrasena.getPassword());
        if (nombre.isEmpty() || email.isEmpty() || telefono.isEmpty() || usuario.isEmpty()
        || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios",
                    "Intenta denuevo",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!contrasena.equals(confirmarContrasena)){
            JOptionPane.showMessageDialog(this,
                    "Las contraseñas no coinciden",
                    "Intenta denuevo",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario = agregarUserBD(nombre,email,telefono,usuario,contrasena);
        if (Usuario != null) {
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Registro Fallido",
                    "Intenta denuevo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public usuario Usuario;
    private usuario agregarUserBD(String nombre, String email, String telefono, String usuario, String contrasena){
        usuario USR = null;
        final String URL ="jdbc:sqlserver://LAPTOP-LBTTUPNM:1433;databaseName=KentuckyFriedChicken;encrypt=true;trustServerCertificate=true";
        final String USER = "sa";
        String PSWRD = "123456";

        try{
            Connection conn = DriverManager.getConnection(URL,USER,PSWRD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Usuario (nombre,email,telefono,usuario,contrasena)" +
                    "VALUES(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,nombre);
            pstmt.setString(2,email);
            pstmt.setString(3,telefono);
            pstmt.setString(4,usuario);
            pstmt.setString(5,contrasena);

            int addedRows = pstmt.executeUpdate();
            if (addedRows > 0) {
                USR = new usuario();
                USR.nombres = nombre;
                USR.email = email;
                USR.telefono = telefono;
                USR.usuario = usuario;
                USR.contrasena =  contrasena;
                //USR.confirmarContrasena = confirmarContrasena;
            }

            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return USR;
    }

    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }
}
