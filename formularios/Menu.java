package formularios;

import javax.swing.*;
import java.awt.*;

public class Menu extends JDialog {
    private JButton salirButton;     //Botón que regresa a Inicio
    private JButton realizarVentaButton;   //Botón que lleva a la ventana de venta
    private JLabel menuText;
    public JPanel MenuPanel;
    private Inicio inicio;

    public Menu(Inicio owner) {
        super(owner);
        this.inicio = owner;
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
        salirButton.addActionListener(e -> {
            dispose();  // Cierra la ventana actual (Menu)
            inicio.setVisible(true);  // Abre la ventana de inicio
        });
        realizarVentaButton.addActionListener(e -> {
            // TODO: Abrir la ventana de venta
            // Venta venta = new Venta(this);
            // venta.setVisible(true);
        });
    }}
