package com.company;

import Vista.Almacen;
import Vista.Producto;
import Vista.Proveedor;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Producto> listaProductos = new ArrayList<>();
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public static void main(String[] args) {

        crearProductos();
        crearProveedores();
        //mostrarProveedoresDeProductos();
        mostrarProductos();
        Almacen dialog = new Almacen();
        dialog.pack();
        dialog.setVisible(true);

    }

    public static void crearProductos(){
        listaProductos.add(new Producto("Leche",20,5.36f));
        listaProductos.add(new Producto("Pan",50,1.36f));
        listaProductos.add(new Producto("Yogur",20,2.36f));
        listaProductos.add(new Producto("Carne",10,9.36f));
        listaProductos.add(new Producto("Salsa",5,3.36f));
    }

    public static void crearProveedores(){
        ArrayList<Producto> cat1 = new ArrayList<>();
        cat1.add(listaProductos.get(0));
        cat1.add(listaProductos.get(1));

        ArrayList<Producto> cat2 = new ArrayList<>();
        cat2.add(listaProductos.get(2));
        cat2.add(listaProductos.get(3));

        ArrayList<Producto> cat3 = new ArrayList<>();
        cat3.add(listaProductos.get(2));
        cat3.add(listaProductos.get(4));


        Proveedor p1 = new Proveedor("Amazon",cat1);
        Proveedor p2 = new Proveedor("Ebay",cat2);
        Proveedor p3 = new Proveedor("AliBaba",cat3);

        listaProveedores.add(p1);
        listaProveedores.add(p2);
        listaProveedores.add(p3);

        listaProductos.get(0).setListaProveedor(listaProveedores);
        listaProductos.get(1).setListaProveedor(listaProveedores);
        listaProductos.get(2).setListaProveedor(listaProveedores);
        listaProductos.get(3).setListaProveedor(listaProveedores);
        listaProductos.get(4).setListaProveedor(listaProveedores);
    }

//    public static void mostrarProveedoresDeProductos(){
//        for (int i = 0; i < listaProductos.size();i++)
//        {
//            for (int j = 0;j< listaProductos.get(i).getListaProveedor().size();j++)
//            {
//                System.out.println(listaProductos.get(i).getListaProveedor().get(j).getNombre() + "\n");
//            }
//            System.out.println("====================================================================");
//        }
//    }

    public static void mostrarProductos(){
        for (int i=0;i< listaProductos.size();i++)
        {
            System.out.println(listaProductos.get(i).getNombre());
        }
    }

    public static boolean buscarProducto(String nombreP){
        int i;
        for (i = 0;i < listaProductos.size() && listaProductos.get(i).getNombre().compareToIgnoreCase(nombreP) !=0;i++) {}
        if(i == listaProductos.size())
        {
            System.out.println("producto no encontrado");

            return false;
        }
        else {
            System.out.println("producto encontrado");
            return true;
        }
    }
}
