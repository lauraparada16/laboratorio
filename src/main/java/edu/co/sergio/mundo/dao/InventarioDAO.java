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
import edu.co.sergio.mundo.vo.Inventario;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class InventarioDAO implements IBaseDatos<Inventario>{
    
    /**
	 * Funcion que permite obtener una lista de los inventario existentes en la base de datos
	 * @return List<Inventario> Retorna la lista de inventario existentes en la base de datos
	 */
	public List<Inventario> findAll() {
		List<Inventario> inventarios= null;
	    String query = "SELECT * FROM Inventario";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
            
	    int IDinventario =0;
            int IDProducto =0;
            int Cantidad =0;
            double PrecioUnitario=0;
            double PrecioTotal=0;

	
	    while (rs.next()){
	    	if(inventarios == null){
	    		inventarios = new ArrayList<Inventario>();
	    	}
	      
	        Inventario registro= new Inventario();
	        IDinventario = rs.getInt("IDinventario");
	        registro.setIDinventario(IDinventario);
                
                IDProducto = rs.getInt("IDProducto");
	        registro.setIDProducto(IDProducto);
	        
                Cantidad = rs.getInt("Cantidad");
	        registro.setCantidad(Cantidad);
                
                PrecioUnitario = rs.getDouble("PrecioUnitario");
	        registro.setPrecioUnitario(PrecioUnitario);
                
                PrecioTotal = rs.getDouble("PrecioTotal");
	        registro.setPrecioUnitario(PrecioTotal);
                
	        inventarios.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Inventarios");
			e.printStackTrace();
		}
	    
	    return inventarios;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Inventarios
	 * @param Inventario recibe un objeto de tipo inventario 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Inventario inventario) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Inventario "  + " values (?,?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt(1, inventario.getIDinventario());
                        preparedStmt.setInt(2, inventario.getIDProducto());
                        preparedStmt.setInt(3, inventario.getIDProducto());
                        preparedStmt.setDouble(4, inventario.getPrecioUnitario());
                        preparedStmt.setDouble(5, inventario.getPrecioTotal());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Inventario
	 * @param Inventario recibe un objeto de tipo inventario 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Inventario inventario) {
		boolean result=false;
		Connection connection= null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
		String query = "update Inventario set IDProducto = ?, Cantidad = ?, PrecioUnitario = ?, PrecioTotal = ? where IDinventario = ?";
		PreparedStatement preparedStmt=null;
		try {
		    preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setInt(1, inventario.getIDProducto());
                    preparedStmt.setInt(2, inventario.getIDProducto());
                    preparedStmt.setDouble(3, inventario.getPrecioUnitario());
                    preparedStmt.setDouble(4, inventario.getPrecioTotal());
                    preparedStmt.setInt(5, inventario.getIDinventario());
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return result;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Inventario
	 * @param Inventario recibe un objeto de tipo inventario 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Inventario inventario) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Inventario where IDinventario = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, inventario.getIDinventario());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}

}
