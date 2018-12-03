/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import edu.co.sergio.mundo.vo.Vendedor;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class VendedorDAO {
    
        /**
	 * Funcion que permite obtener una lista de los vendedores existentes en la base de datos
	 * @return List<Vendedores> Retorna la lista de vendedores existentes en la base de datos
	 */
	public List<Vendedor> findAll() {
            List<Vendedor> vendedores= null;
	    String query = "SELECT * FROM Vendedor";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int IDvendedor =0;
	
	    while (rs.next()){
	    	if(vendedores == null){
	    		vendedores = new ArrayList<Vendedor>();
	    	}
	      
	        Vendedor registro= new Vendedor();
	        IDvendedor = rs.getInt("IDvendedor");
	        registro.setIDvendedor(IDvendedor);

	        
	       vendedores.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de vendedores");
			e.printStackTrace();
		}
	    
	    return vendedores;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Vendedores
	 * @param Vendedor recibe un objeto de tipo vendedor 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Vendedor vendedor) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Vendedor (IDvendedor)"  + " values (?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1, vendedor.getIDvendedor());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
        
    public boolean update(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Vendedor
	 * @param Vendedor recibe un objeto de tipo vendedor
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Vendedor vendedor) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Vendedor where IDvendedor = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, vendedor.getIDvendedor());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    
}
