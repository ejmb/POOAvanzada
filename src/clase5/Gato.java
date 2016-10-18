/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import clase3.Mascota;

/**
 *
 * @author Eduardo
 */
public class Gato extends Mascota{
    private int codigo;

    public Gato() {
        super();
    }

    public Gato(String nombre, int edad, String raza, int cod) {
        super(nombre, edad, raza);
        codigo = cod;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    

    @Override
    public String toString() {
        return "Gato: " + super.toString() + ", codigo=" + codigo;
    }

    @Override
    public String comer(String comida, float cant) {
        return super.comer(comida, cant);
    }
    
    public String jugar(){
        return " jugando";
    }
    
}
