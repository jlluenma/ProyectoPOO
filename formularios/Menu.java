package formularios;

import javax.swing.*;
import java.awt.*;

public class Menu extends JDialog {
    private JButton salirButton;
    private JButton realizarVentaButton;
    private JLabel menuText;
    public JPanel MenuPanel;

    // Modificar el constructor para caeptar un Dialog
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

    private void initComponents() {
        salirButton.addActionListener(e -> dispose());
        // Configurar realizarVentaButton según sea necesario
    }
}


