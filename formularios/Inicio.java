package formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JDialog {
    private JTextField tfuser;
    private JButton entrarButton;
    private JPasswordField pfpassword;
    private JLabel usrName;
    private JLabel usrPw;
    private JPanel loginPanel;
    private JButton registrarUsuarioButton;

    public Inicio(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450, 450));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        entrarButton.addActionListener(e -> {
            // Simplemente muestra la ventana Menu sin verificar usuario y contraseña
            Menu menu = new Menu(this);
            menu.setVisible(true);
            dispose();
        });

        setVisible(true);
        registrarUsuarioButton.addActionListener(e ->  {
                //Botón que envía a Registro.java
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
