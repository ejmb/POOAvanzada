/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Palindroma {

    /**
     * @param args the command line arguments
     */
    String frase;
    Cola<Character> cola;
    Stack<Character> pila;  
    int simbolos = 0;
    int palabras = 0;
    int consonantes = 0;
    int vocales = 0;
    
    public Palindroma() {
        frase = leerFrase();
        if(frase != null){
            procesarFrase();
            palabras = contarPalabras(frase);
            if (palabras < 2) {
                JOptionPane.showMessageDialog(null, "Ingrese una frase con MIN. 2 palabras" );
                return;
            }
            cola = new Cola();
            pila = new Stack();
            cargarEstructuras();
            boolean esPalindromo = verificarPalindromo();
            mostrarResultados(esPalindromo);
        }
    }  

    private String leerFrase() {
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese la frase");
        if(respuesta == null) {
            JOptionPane.showMessageDialog(null, "Ok. Cancelado");
        }
        return respuesta;
    }
    
    private void procesarFrase() {
        frase = frase.toLowerCase();
        frase = frase.replaceAll("á", "a");
        frase = frase.replaceAll("é", "e");
        frase = frase.replaceAll("í", "i");
        frase = frase.replaceAll("ó", "o");
        frase = frase.replaceAll("ú", "u");
    }

    private void cargarEstructuras() {
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if( Character.isLetter( c )) {
                cola.offer(c);
                pila.push(c);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) vocales++;
                else consonantes++;
            }
            else {
                simbolos++;
            }
        }
    }

    private boolean verificarPalindromo() {
        boolean ret = true;
        int tam = cola.size() / 2;
        for (int i = 0; i < tam; i++) {
            char a = cola.poll();
            char b = pila.pop();
            if(a != b) {
                ret = false;
                break;
            }
        }
        return ret;
    }
    
    private  int contarPalabras(String respuesta) {
        String[] palabras = respuesta.split(" ");
        return palabras.length;
    }

    private void mostrarResultados(boolean esPalindromo) {
        String resultado = (esPalindromo ? "Frase Palindroma" : "NO es Palindroma");
        resultado += "\nCantidad de palabras: " + palabras;
        resultado += "\nCantidad de vocales: " + vocales;
        resultado += "\nCantidad de consonantes: " + consonantes;
        resultado += "\nCantidad de simbolos: " + simbolos;
        JOptionPane.showMessageDialog(null, resultado,"Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        new Palindroma();
    }  
}
