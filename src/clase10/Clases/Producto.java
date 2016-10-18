/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.Clases;

/**
 *
 * @author Eduardo
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private String tipo;
    private int precioCompra;
    private int descMaximo;
    private float utilidad;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, String tipo, int precioCompra, int descMaximo, float utilidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precioCompra = precioCompra;
        this.descMaximo = descMaximo;
        this.utilidad = utilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getDescMaximo() {
        return descMaximo;
    }

    public void setDescMaximo(int descMaximo) {
        this.descMaximo = descMaximo;
    }

    public float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", tipo=" + tipo + ", precioCompra=" + precioCompra + ", descMaximo=" + descMaximo + ", utilidad=" + utilidad + '}';
    }   
}
