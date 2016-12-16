/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

import java.util.Random;

/**
 *
 * @author emorel
 */
public class MainCajeraRunnable {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", getProductoTiempo());
	Cliente cliente2 = new Cliente("Cliente 2", getProductoTiempo());
        Cliente cliente3 = new Cliente("Cliente 3", getProductoTiempo());
	Cliente cliente4 = new Cliente("Cliente 4", getProductoTiempo());
		
	Cajera cajera1 = new Cajera("Cajera 1");
	Cajera cajera2 = new Cajera("Cajera 2");
        
        long initialTime = System.currentTimeMillis();
        
	Runnable proceso1 = new CajeraRunnable(cliente1, initialTime, cajera1.getNombre());
	Runnable proceso2 = new CajeraRunnable(cliente2, initialTime, cajera2.getNombre());
        Runnable proceso3 = new CajeraRunnable(cliente3, initialTime, cajera1.getNombre());
	Runnable proceso4 = new CajeraRunnable(cliente4, initialTime, cajera2.getNombre());
		
	new Thread(proceso1).start();
	new Thread(proceso2).start();
        new Thread(proceso3).start();
	new Thread(proceso4).start();        
    }
    
    public static int[] getProductoTiempo(){
        Random randomGen = new Random();
        int tiempoProducto;
        int cantProductos = randomGen.nextInt((10 - 1) + 1) + 1;        
        int[] numeros = new int[cantProductos];
        for (int x=0;x<numeros.length;x++){
            tiempoProducto = randomGen.nextInt((5 - 1) + 1) + 1;
            numeros[x] = tiempoProducto;
        }
        return numeros;        
    }
    
//    public static synchronized String atenderCliente(Cliente cliente, long initialTime, String cajera){
//        Runnable proceso = new CajeraRunnable(cliente, initialTime, cajera);
//        Thread thread = new Thread(proceso);
//        thread.start();
//        if(!thread.isAlive()){
//            System.out.println(cajera + " ESTA LIBRE.");
//            return "LIBRE";
//        }
//        return "OCUPADA";
//    }
    
}
