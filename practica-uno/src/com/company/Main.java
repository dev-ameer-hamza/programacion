package com.company;

import Modelo.Persona;
import Vista.MostrarDatos;
import Vista.datosPerson;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
public static ArrayList<Persona> listaPersonas = new ArrayList<>();
public static JFrame frameText,frame;
    public static void main(String[] args) {

        frameText = new JFrame("ventanaMain");
        frameText.setContentPane(new datosPerson().getVentanaPersona());
        frameText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameText.setLocationRelativeTo(null);
        frameText.pack();
        frameText.setVisible(true);

    }

    public static void crearPersona(String nombre,String apel,String dni){
        listaPersonas.add(new Persona(nombre,apel,dni));
        System.out.println("objeto persona fue creado");
    }
    public static void mostrarPersonas(){

        frameText.dispose();
        String datos = "";
        for (int i=0;i < listaPersonas.size();i++)
        {
            datos += listaPersonas.get(i).toString() + "\n";

        }
        frame = new JFrame("mostrarDatos");
        frame.setContentPane(new MostrarDatos(datos).getMostrarDatos());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }
}
