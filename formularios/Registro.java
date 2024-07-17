package formularios;

import Clases.Acceso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;       //Botón que realiza el registro y manda un mensaje de registro exitoso
    private JButton buttonCancel;   //Botón que cancela y regresa a Inicio
    //Datos del usuario
    private JTextField nombres;
    private JTextField email;
    private JTextField phone;
    private JTextField nUsuario;
    private JPasswordField contra;
    private JPasswordField confimarContra;
    private Acceso acces;   //Istancia de la clase Acceso

    public Registro(Window owner) {

        super(owner, "Menu de Registro", ModalityType.APPLICATION_MODAL);
        setContentPane(contentPane);
        setMinimumSize(new Dimension(500, 500));
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getRootPane().setDefaultButton(buttonOK);
        setVisible(true);
        acces = new Acceso(); //Inicializa la instancia de Acceso

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarUsuario(); //Registra el usuario con el método
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO: Regresar al Inicio
                //Inicio inicio = new Inicio();
                //inicio.setVisible(true);
                System.out.println("Cancelado");
                //dispose(); // Cierra el diálogo
            }
        });
    }

    private void registrarUsuario() {
        //TODO: Cambiar de nombre del método por similitud con el método de Acceso
        //Guarda en variables los datos del usuario
        String nombre =nombres.getText();
        String correo = email.getText();
        String telefono = phone.getText();
        String usuario = nUsuario.getText();
        String contraseña = new String(contra.getPassword());
        String confirmarContraseña = new String(confimarContra.getPassword());

        //Verifica que los campos estén llenos
        if (usuario.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty() ||
                nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.beep();
            System.out.println("Algún campo está vacío!");
            return;
        }else{
            //Verifica que las constraseñas coincidan
            if (!contraseña.equals(confirmarContraseña)) {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                toolkit.beep();
                System.out.println("Las contraseñas no coinciden!");
                return;
            }else{
                // Si está corecto registra al usuario llamando al método y llenando los parámetros correspondientes
                acces.registrarUsuario(nombre, correo, telefono,contraseña,usuario);

                // En caso el registro falle por otro motivo
                if (acces.isRegistroFallido()) {
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    toolkit.beep();
                    System.out.println("Registro fallido! :(");
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Registro dialog = new Registro(frame);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
