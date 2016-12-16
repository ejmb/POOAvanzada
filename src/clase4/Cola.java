/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author emorel
 */
public class Cola<E> implements Queue<E>{
    private int pos;
    private E[] cola;

    public Cola() {
        pos = 0;
        cola = (E[]) new Object[5];
    }
    
    @Override
    public boolean add(E e) {
        if (e==null) throw new NullPointerException("No puede ser NULL");
        if(pos<cola.length) {
            cola[pos++] = e;
            return true;
        }else{
            throw new IllegalStateException("La cola esta llena");
        }            
    }
    
    @Override
    public boolean offer(E e) {
        if (e==null) throw new NullPointerException("No puede ser NULL");
        if(pos==cola.length) {
           increaseCapacity();
        }
        cola[pos++] = e;
        return true; 
    }
    
    @Override
    public E peek() {
        if (isEmpty()) return null;
        else return cola[0];
    }
    
    @Override
    public E poll() {
        if (isEmpty()) return null;
        E aux = cola[0];
        for (int i = 0; i < pos; i++) {
            cola[i] = cola[i+1];
        }
        pos--;
        return aux;
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public boolean isEmpty() {
       return pos==0;
    }

    private void increaseCapacity() {
        E[] aux = (E[]) new Object[cola.length * 2];
        System.arraycopy(cola, 0, aux, 0, cola.length);
        cola = aux;
    }
    
    @Override
    public E element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
