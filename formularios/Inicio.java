package formularios;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JDialog {
    private JTextField tfuser;               //Nombre de usuario
    private JButton entrarButton;
    private JPasswordField pfpassword;       //Contraseña
    private JLabel usrName;
    private JLabel usrPw;
    private JPanel loginPanel;
    private JButton registrarUsuarioButton;

    public Inicio(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450, 450));
        setModal(true); //Hace la ventana modal
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //Cierra los recursos al cerrar ventana

        entrarButton.addActionListener(e -> {
            //TODO: Verificación de Usuario y contraseña para ingresar a Menu.
            Menu menu = new Menu(this);
            menu.setVisible(true);
            dispose();
        });

        registrarUsuarioButton.addActionListener(e -> {
            // Botón que envía a Registro.java
            Registro registro = new Registro(this);
            registro.setVisible(true);
            dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Inicio myInicio = new Inicio(null);
    }
}
