package com.company;

import Vista.ventanaMain;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaMain");
        frame.setContentPane(new ventanaMain().getPanelMain());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void setDatos(String d){
        // Persona p = new Persona(con datos del constructor);
        System.out.println(d);
    }
}
