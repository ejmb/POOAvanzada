/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author emorel
 */
public class CajeraRunnable extends Cajera implements Runnable{
    private Cliente cliente;
    private long initialTime;

    public CajeraRunnable(Cliente cliente, long initialTime, String nombre) {
        super(nombre);
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {        
        super.procesarCompra(this.cliente, this.initialTime);
    }    
}
