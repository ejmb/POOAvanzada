/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13.Clases;

/**
 *
 * @author Eduardo
 */
import java.io.*;

public class ProcesarArchivo {
	
	private RandomAccessFile file;
	
	public void abrir () throws IOException {
		file = new RandomAccessFile("./data/agenda.dat", "rw");
	}
	
	public void cerrar () throws IOException {
		if (file != null)
			file.close();
	}
}
