package Vista;

import com.company.Main;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Almacen extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
    private JButton buttonCancel;
    private JTextField nombreProducto;
    private JTextField unidades;
    private JPanel radioPanel;
    private JRadioButton comprasRadioButton;
    private JRadioButton ventasRadioButton;
    private JPanel datoCompra;
    private JTextField precioCompra;
    private JTextField importeCompra;
    private JComboBox comboBox1;
    private JPanel datoVenta;
    private JTextField precioVenta;
    private JTextField clienteVenta;
    private JPanel descuento;
    private JCheckBox porVolumenCheckBox;
    private JCheckBox porProntoPagoCheckBox;
    private JTextField importeVenta;
    private JLabel importe;
    private ButtonGroup btnGroup;

    public Almacen() {

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnAceptar);

        comboBox1.getSelectedItem();
        comboBox1.addItem("AliExpress");
        comboBox1.addItem("Amazon");
        comboBox1.addItem("Faire");
        comboBox1.addItem("Ebay");




        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        ventasRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                datoCompra.setVisible(false);
                datoVenta.setVisible(true);
            }
        });
        comprasRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                datoCompra.setVisible(true);
                datoVenta.setVisible(false);
            }
        });
        ventasRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                datoCompra.setVisible(false);
                datoVenta.setVisible(true);
            }
        });

        nombreProducto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("focus lost");
                super.focusLost(e);
                if (!Main.buscarProducto(nombreProducto.getText()))
                {
                    unidades.setEditable(false);
                }
                else
                {
                    unidades.setEditable(true);
                }
            }
        });
    }



    private void onOK() {
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public JTextField getImporteCompra() {
        return importeCompra;
    }

    public JTextField getPrecioVenta() {
        return precioVenta;
    }

    public static void main(String[] args) {

    }


}
