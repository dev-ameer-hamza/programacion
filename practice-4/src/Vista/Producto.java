package Vista;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private int unidades;
    private float oprecio;

    private ArrayList<Proveedor> listaProveedor = new ArrayList<>();

    public Producto(String nombre, int unidades, float oprecio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.oprecio = oprecio;
    }

    public ArrayList<Proveedor> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(ArrayList<Proveedor> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getOprecio() {
        return oprecio;
    }

    public void setOprecio(float oprecio) {
        this.oprecio = oprecio;
    }
}
