package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.*;
public class ventanaMain {
    private JPanel panelMain;
    private JLabel Titulo;
    private JLabel Nombre;
    private JTextField nombreCampo;
    private JButton aceptarButton;

    public ventanaMain() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hola!");
                // deberiamos validar los datos aqui
                Main.setDatos(nombreCampo.getText());
            }
        });
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ventanaMain");
        frame.setContentPane(new ventanaMain().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
