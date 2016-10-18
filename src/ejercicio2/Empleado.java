/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio1.Persona;

/**
 *
 * @author emorel
 */
public class Empleado extends Persona{
    
    private int salario;
    private float horasExtras;
    public static final int SUELDO_MINIMO = 1824000;
    
    public Empleado(){
        super();
    }
    
    public Empleado(int cedula, String nombre, String apellido, int edad){
        super(cedula, nombre, apellido, edad);
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }
    
}
