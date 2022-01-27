package Vista;

import Modelo.Persona;

import javax.swing.*;
import java.util.ArrayList;

public class MostrarDatos {
    private JPanel mostrarDatos;
    public  JTextArea areaPersona;
    public String datos;
    public static JFrame frame = new JFrame("mostrarDatos");

    public static void main(String[] args) {

//        frame.setContentPane(new MostrarDatos().mostrarDatos);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
    }

    public MostrarDatos(String datos ) {
        this.datos = datos;
        this.areaPersona.setText(datos);
    }



    public JPanel getMostrarDatos() {
        return mostrarDatos;
    }
}
