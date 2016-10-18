/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ejercicio1.Persona;

/**
 *
 * @author emorel
 */
public class POOAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona(258465, "Jose", "Gonzalez", 25);
        Persona p3 = new Persona(123456, "Maria", "Perez", 30, 'F', "Casada");
        
        p1.setCedula(2695031);
        p1.setNombre("Eduardo");
        p1.setApellido("Morel");
        p1.setEdad(28);
        p1.setSexo('M');
        p1.setEstadoCivil("Soltero");
        
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
        System.out.println("P3: "+p3);
        System.out.println("Cedula P1: "+p1.getCedula());
        System.out.println("Nombre P1: "+p1.getNombre());
        System.out.println("Apellido P1: "+p1.getApellido());
        System.out.println("Edad P1: "+p1.getEdad());
        System.out.println("Sexo P1: "+p1.getSexo());
        System.out.println("Estado Civil P1: "+p1.getEstadoCivil());
    }
    
}
