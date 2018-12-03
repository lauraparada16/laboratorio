/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.co.sergio.mundo.vo.Cliente;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class ClienteDAO implements IBaseDatos<Cliente>{
    
    /**
	 * Funcion que permite obtener una lista de los clientes existentes en la base de datos
	 * @return List<Cliente> Retorna la lista de clientes existentes en la base de datos
	 */
	public List<Cliente> findAll() {
		List<Cliente> clientes= null;
	    String query = "SELECT * FROM Cliente";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int IDcliente =0;
	
	    while (rs.next()){
	    	if(clientes == null){
	    		clientes = new ArrayList<Cliente>();
	    	}
	      
	        Cliente registro= new Cliente();
	        IDcliente = rs.getInt("IDcliente");
	        registro.setIDcliente(IDcliente);
	        
	        clientes.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de clientes");
			e.printStackTrace();
		}
	    
	    return clientes;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Cliente
	 * @param Cliente recibe un objeto de tipo Cliente 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Cliente cliente) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Cliente (IDcliente)"  + " values (?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1, cliente.getIDcliente());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Cliente
	 * @param Cliente recibe un objeto de tipo Cliente 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Cliente cliente) {
            return false;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Cliente
	 * @param Cliente recibe un objeto de tipo Cliente 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Cliente cliente) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Cliente where IDcliente = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, cliente.getIDcliente());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    
}
