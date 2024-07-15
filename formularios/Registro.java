package formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nombres;
    private JTextField email;
    private JTextField phone;
    private JTextField nUsuario;
    private JPasswordField contraseña;
    private JPasswordField confimarContra;

    public Registro(Dialog owner) {

        super(owner);
        setTitle("Menu de Registro");
        setMinimumSize(new Dimension(500, 500));
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        setVisible(true);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            } //llama al método onOK
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onCancel();} //Llama al método onCancel
        });
    }

    private void initComponents() {
        // Configurar realizarVentaButton según sea necesario
    }

    private void onOK() {
        // Botón que llevará al inicio, insertará los datos en la base de datos y mostrará mensaje de registro exitoso
        dispose();
    }

    private void onCancel() {
        // Botón que llevará al inicio sin realizar ningún registro y llevará al inicio
        dispose();
    }
}
