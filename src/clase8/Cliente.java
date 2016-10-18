/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;
/**
 *
 * @author emorel
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String ruc;
    private String direccion;
    private float descuento;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String ruc, String direccion, float descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente: \n" + "Codigo = " + codigo + "\nNombre = " + nombre + 
                "\nRUC = " + ruc + "\nDireccion = " + direccion + 
                "\nDescuento = " + descuento;
    }    
}
