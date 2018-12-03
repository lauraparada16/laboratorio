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
import edu.co.sergio.mundo.vo.Administrador;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class AdministradorDAO implements IBaseDatos<Administrador>{
    
    /**
	 * Funcion que permite obtener una lista de los administradores existentes en la base de datos
	 * @return List<Administrador> Retorna la lista de administradores existentes en la base de datos
	 */
	public List<Administrador> findAll() {
            List<Administrador> administradores= null;
	    String query = "SELECT * FROM Administrador";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int IDadministrador =0;
	
	    while (rs.next()){
	    	if(administradores == null){
	    		administradores = new ArrayList<Administrador>();
	    	}
	      
	        Administrador registro= new Administrador();
	        IDadministrador = rs.getInt("IDadministrador");
	        registro.setIDadministrador(IDadministrador);

	        
	        administradores.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Administradores");
			e.printStackTrace();
		}
	    
	    return administradores;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Administrador
	 * @param Administrador recibe un objeto de tipo Administrador 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Administrador administrador) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Administrador (IDadministrador)"  + " values (?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1, administrador.getIDadministrador());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
        
    public boolean update(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Administrador
	 * @param Administrador recibe un objeto de tipo Administrador 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Administrador administrador) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Administrador where IDadministrador = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, administrador.getIDadministrador());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
}
