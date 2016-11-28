/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17.tarea2;

import clase17.Clientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author emorel
 */
public class ConsultaClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        new ConsultaClientes();        
    }

    public ConsultaClientes() throws ClassNotFoundException, SQLException {
        Connection con = null;        
        try{
             con = BaseDatos.getConexion();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
        ArrayList<Clientes> resultado = new ArrayList<>();
        try {
            resultado = BaseDatos.ejecutarConsulta(con, "SELECT * FROM CLIENTES");
            System.out.println(resultado.size() + " clientes encontrados");
            for (Clientes res : resultado) {
                System.out.println( res );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        con.close();
    }
    
}
