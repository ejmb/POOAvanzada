/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */

public class Veterinaria {
    
    public static void main(String[] args) {
        new Veterinaria();
        
    }

    public Veterinaria() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        mascotas.add(new Mascota("Pupi", 7, "Canina"));
        mascotas.add(1, new Mascota("Tom", 12, "Felina"));
        mascotas.add(new Mascota("Bud", 11, "Canina"));
        mascotas.add(2, new Mascota("Pancho", 15, "Ave"));
        mascotas.add(new Mascota("Patas", 2, "Anfibio"));
        
        Mascota m = new Mascota("Tomi", 13, "Canina");
        mascotas.add(mascotas.size(), m);
        
        System.out.println("Punto 9: ");
        System.out.println("Imprimir Lista: ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);            
        }
        
        System.out.println("\nPunto 10: ");
        System.out.println("Tamaño de la Lista: " + mascotas.size());
        System.out.println("Elemento en la Posicion 2: " + mascotas.get(1));
        System.out.println("Ultimo Elemento: " + mascotas.get(mascotas.size()-1));
        System.out.println("Lista Vacia?: " + mascotas.isEmpty());
        
        System.out.println("\nPunto 11: ");
        System.out.println("Borrado: " + mascotas.get(1));
        mascotas.remove(1);
        System.out.println("Borrado: " + mascotas.get(mascotas.size()-1));
        mascotas.remove(mascotas.size()-1);
       
        System.out.println("\nPunto 12: ");
        System.out.println("Imprimir Lista: ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);            
        }        
        System.out.println("Nuevo tamaño de la Lista: " + mascotas.size());
        
        System.out.println("\nPunto 14: ");
        System.out.println("Vaciar Lista Metodo clear(): ");
        mascotas.clear();
        System.out.println("Tamaño de la Lista: " + mascotas.size());
        System.out.println("Lista Vacia?: " + mascotas.isEmpty());
    }
    
}
