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
import edu.co.sergio.mundo.vo.Producto;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class ProductoDAO {
    
    /**
	 * Funcion que permite obtener una lista de los productos existentes en la base de datos
	 * @return List<Producto> Retorna la lista de productos existentes en la base de datos
	 */
	public List<Producto> findAll() {
		List<Producto> productos= null;
	    String query = "SELECT * FROM Producto";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int IDProducto=0;
	    String NombreProducto = null;
            int Cantidad=0;
            float CodeBarra=0;
            String DateEntrada= null;
            String DateCaducidad=null;
            String Proveedor=null;
            double PrecioUnitario=0;
            int Estado=0;
	
	    while (rs.next()){
	    	if(productos == null){
	    		productos= new ArrayList<Producto>();
	    	}
	      
	        Producto registro= new Producto();
	        IDProducto = rs.getInt("IDProducto");
	        registro.setIDroducto(IDProducto);
	        
	        NombreProducto = rs.getString("NombreProducto");
	        registro.setNombreProducto(NombreProducto);
                
                Cantidad = rs.getInt("Cantidad");
	        registro.setCantidad(Cantidad);
                
                CodeBarra = rs.getFloat("CodeBarra");
	        registro.setCodeBarra(CodeBarra);
                
                DateEntrada = rs.getString("DateEntrada");
	        registro.setDATEentrada(DateEntrada);
                
                DateCaducidad = rs.getString("DateCaducidad");
	        registro.setDATEcadusidad(DateCaducidad);
                
                Proveedor = rs.getString("Proveedor");
	        registro.setProveedor(Proveedor);
                
                PrecioUnitario= rs.getDouble("PrecioUnitario");
	        registro.setPrecioUnitario(PrecioUnitario);
                
                Estado = rs.getInt("Estado");
	        registro.setEstado(Estado);
	        
	        productos.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Productos");
			e.printStackTrace();
		}
	    
	    return productos;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Productos
	 * @param Producto recibe un objeto de tipo productos 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Producto producto) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Producto"  + " values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1, producto.getIDroducto());
                        preparedStmt.setString (2, producto.getNombreProducto());
                        preparedStmt.setInt (3, producto.getCantidad());
                        preparedStmt.setFloat (4, producto.getCodeBarra());
                        preparedStmt.setString (5, producto.getDATEentrada());
                        preparedStmt.setString (6, producto.getDATEcadusidad());
                        preparedStmt.setString (7, producto.getProveedor());
                        preparedStmt.setDouble (8, producto.getPrecioUnitario());
                        preparedStmt.setInt (9, producto.getEstado());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Producto
	 * @param Producto recibe un objeto de tipo productos 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Producto producto) {
		boolean result=false;
		Connection connection= null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
		String query = "update Producto set NombreProducto = ?, Cantidad = ?, CodeBarra = ?, DateEntrada = ?,"
                        + "DateCaducidad = ?, Proveedor = ?, PrecioUnitario = ?, Estado = ? where IDProducto = ?";
		PreparedStatement preparedStmt=null;
		try {
		    preparedStmt = connection.prepareStatement(query);
		    preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setString (1, producto.getNombreProducto());
                    preparedStmt.setInt (2, producto.getCantidad());
                    preparedStmt.setFloat (3, producto.getCodeBarra());
                    preparedStmt.setString (4, producto.getDATEentrada());
                    preparedStmt.setString (5, producto.getDATEcadusidad());
                    preparedStmt.setString (6, producto.getProveedor());
                    preparedStmt.setDouble (7, producto.getPrecioUnitario());
                    preparedStmt.setInt (8, producto.getEstado());
                    preparedStmt.setInt (9, producto.getIDroducto());
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return result;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Producto
	 * @param Producto recibe un objeto de tipo Producto 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Producto producto) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Producto where IDProducto = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, producto.getIDroducto());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    
}
