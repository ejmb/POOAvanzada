/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17.tarea2;

import clase17.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author emorel
 */
public class BaseDatos {
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/";
            Connection con = DriverManager.getConnection(url + "UAA", "uaa", "uaa");
            return con;
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    public static ArrayList<Clientes> ejecutarConsulta(Connection con, String query)
        throws SQLException{
        ArrayList<Clientes> clientes = new ArrayList<>();
        try{
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                clientes.add( new Clientes(
                                rs.getInt("CODIGO"),
                                rs.getString("NOMBRE"),
                                rs.getString("RUC"),
                                rs.getString("DIRECCION"),
                                rs.getFloat("DESCUENTO") ));
            }
            rs.close();
            s.close();
        }catch(SQLException ex){
            throw ex;
        }
        return clientes;
    }
    
}
