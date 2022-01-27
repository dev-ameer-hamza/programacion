package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.*;
public class datosPerson {
    private JLabel nombre;
    private JTextField textFieldNombre;
    private JLabel apellido;
    private JTextField textFieldApellido;
    private JLabel dni;
    private JTextField textField1;
    private JButton aceptar;
    private JButton salirButton;
    private JPanel ventanaPersona;

    public static void main(String[] args) {

        JFrame frame = new JFrame("ventanaMain");
        frame.setContentPane(new datosPerson().ventanaPersona);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getVentanaPersona() {
        return ventanaPersona;
    }

    public datosPerson() {
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.crearPersona(textFieldNombre.getText(),textFieldApellido.getText(),textField1.getText());
                textFieldNombre.setText("");
                textFieldApellido.setText("");
                textField1.setText("");
                textFieldNombre.requestFocus();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mostrarPersonas();
            }
        });
    }
}
