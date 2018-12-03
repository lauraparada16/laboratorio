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
import edu.co.sergio.mundo.vo.Persona;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class PersonaDAO {
    
    /**
	 * Funcion que permite obtener una lista de los personas existentes en la base de datos
	 * @return List<Persona> Retorna la lista de personas existentes en la base de datos
	 */
	public List<Persona> findAll() {
		List<Persona> personas= null;
	    String query = "SELECT * FROM Persona";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int ID =0;
	    String Nombre = null;
            int Telefono = 0;
            String Correo = null;
	
	    while (rs.next()){
	    	if(personas == null){
	    		personas = new ArrayList<Persona>();
	    	}
	      
	        Persona registro= new Persona();
	        ID = rs.getInt("ID");
	        registro.setID(ID);
	        
	        Nombre = rs.getString("Nombre");
	        registro.setNombre(Nombre);
                
                Telefono = rs.getInt("Telefono");
	        registro.setTelefono(Telefono);
                
                Correo = rs.getString("Correo");
	        registro.setCorreo(Correo);
	        
	        personas.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Personas");
			e.printStackTrace();
		}
	    
	    return personas;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Persona
	 * @param Persona recibe un objeto de tipo Persona 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Persona persona) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Persona (ID,Nombre,Telefono,Correo)"  + " values (?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1,persona.getID());
                        preparedStmt.setString (2,persona.getNombre());
                        preparedStmt.setInt (3, persona.getTelefono());
			preparedStmt.setString (4,persona.getCorreo());
                        result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Persona
	 * @param Persona recibe un objeto de tipo persona 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Persona persona) {
		boolean result=false;
		Connection connection= null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
		String query = "update Persona set Nombre = ?, Telefono = ?, Correo = ? where ID = ?";
		PreparedStatement preparedStmt=null;
		try {
		    preparedStmt = connection.prepareStatement(query);
		    preparedStmt.setString(1, persona.getNombre());
                    preparedStmt.setInt   (2, persona.getTelefono());
                    preparedStmt.setString(3, persona.getCorreo());
                    preparedStmt.setInt   (4, persona.getID());
                    
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return result;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Persona
	 * @param Persona recibe un objeto de tipo persona 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Persona persona) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Persona where ID = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, persona.getID());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    
}
