/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author emorel
 */
public class Persona {

    //:::   1) Atributos
    int cedula;
    String nombre;
    String apellido;
    int edad;
    char sexo;
    String estadoCivil;
    
    //:::   2.1) Constructor sin Parametros
    public Persona() {
    }
    
    //:::   2.2) Constructor con Param cedula, nombre, apellido y edad
    public Persona(int cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = 'M';
        this.estadoCivil = "Soltero";
    }
    
    //:::   2.3) Constructor con todos los Parametros
    public Persona(int cedula, String nombre, String apellido, int edad, char sexo, String estadoCivil) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    //:::   3) Metodos Getter y Setter
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    //::: 4) Metodo toString
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + '}';
    }
        
}
