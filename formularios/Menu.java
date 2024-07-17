package formularios;

import javax.swing.*;
import java.awt.*;

public class Menu extends JDialog {
    private JButton salirButton;     //Botón que regresa a Inicio
    private JButton realizarVentaButton;   //Botón que lleva a la ventana de venta
    private JLabel menuText;
    public JPanel MenuPanel;

    public Menu(Dialog owner) {
        super(owner);
        setTitle("Menú Principal");
        setContentPane(MenuPanel);
        setMinimumSize(new Dimension(500, 500));
        setModal(true);
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        initComponents();

        setVisible(true);
    }

    private void initComponents() {     //Botón Salir
        //TODO: Regresar a la ventana de Inicio
        salirButton.addActionListener(e -> dispose());
    }

    //TODO: Configurar el botón que lleve a Venta
}
