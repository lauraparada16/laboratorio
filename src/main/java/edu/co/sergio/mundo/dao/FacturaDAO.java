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
import edu.co.sergio.mundo.vo.Factura;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada
 */
public class FacturaDAO implements IBaseDatos<Factura>{
    
    /**
	 * Funcion que permite obtener una lista de los Factura existentes en la base de datos
	 * @return List<Factura> Retorna la lista de Facturas existentes en la base de datos
	 */
	public List<Factura> findAll() {
		List<Factura> facturas= null;
	    String query = "SELECT * FROM Factura";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(FacturaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int IDfactura =0;
	    String FechaFactura = null;
            int IDProducto =0;
            String NombreProducto=null;
            double Cantidad=0;
            double PrecioUnitario=0;
            double PrecioTotal=0;
            double Efectivo =0;
            double Cambio=0;
            String InfoSuper=null;
            int IDcliente=0;
            int IDvendedor=0;
	
	    while (rs.next()){
	    	if(facturas == null){
	    		facturas = new ArrayList<Factura>();
	    	}
	      
	        Factura registro= new Factura();
	        IDfactura = rs.getInt("IDfactura");
	        registro.setIDfactura(IDfactura);
	        
	        FechaFactura = rs.getString("FechaFactura");
	        registro.setFechaFactura(FechaFactura);
                
                IDProducto = rs.getInt("IDProducto");
	        registro.setIDProducto(IDProducto);
                
                NombreProducto = rs.getString("NombreProducto");
	        registro.setNombreProducto(NombreProducto);
                
                Cantidad = rs.getInt("Cantidad");
	        registro.setCantidad(IDfactura);
                
                PrecioUnitario = rs.getDouble("PrecioUnitario");
	        registro.setPrecioUnitario(PrecioUnitario);
                
                PrecioTotal = rs.getDouble("PrecioTotal");
	        registro.setPrecioTotal(PrecioTotal);
                
                Efectivo = rs.getDouble("Efectivo");
	        registro.setEfectivo(Efectivo);
                
                Cambio = rs.getDouble("Cambio");
	        registro.setCambio(Cambio);
                
                InfoSuper = rs.getString("InfoSuper");
	        registro.setInfoSuper(InfoSuper);
	        
                IDcliente = rs.getInt("IDcliente");
	        registro.setIDcliente(IDcliente);
                
                IDvendedor = rs.getInt("IDvendedor");
	        registro.setIDvendedor(IDvendedor);
                
	        facturas.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Facturas");
			e.printStackTrace();
		}
	    
	    return facturas;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla facturas
	 * @param Factura recibe un objeto de tipo Factura 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Factura factura) {
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(FacturaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Factura" + " values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setInt (1, factura.getIDfactura());
                        preparedStmt.setString (2, factura.getFechaFactura());
			preparedStmt.setInt (3, factura.getIDProducto());
                        preparedStmt.setString (4, factura.getNombreProducto());
                        preparedStmt.setInt (5, factura.getCantidad());
                        preparedStmt.setDouble(6, factura.getPrecioUnitario());
                        preparedStmt.setDouble(7, factura.getPrecioTotal());
                        preparedStmt.setDouble(8, factura.getEfectivo());
                        preparedStmt.setDouble(9, factura.getCambio());
                        preparedStmt.setString (10, factura.getInfoSuper());
                        preparedStmt.setInt (11, factura.getIDcliente());
                        preparedStmt.setInt (12, factura.getIDvendedor());
                        result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Departamento
	 * @param Departamento recibe un objeto de tipo Departamento 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Factura factura) {
		boolean result=false;
		Connection connection= null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(FacturaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
		String query = "update Factura set FechaFactura = ?, IDProducto = ?, "
                        + "NombreProducto = ?, Cantidad = ?, PrecioUnitario = ?, "
                        + "PrecioTotal = ?, Efectivo = ?, Cambio = ?, InfoSuper = ?, "
                        + "IDcliente = ?, IDvendedor = ? where IDfactura = ?";
		PreparedStatement preparedStmt=null;
		try {
		    preparedStmt = connection.prepareStatement(query);                    		    
                    preparedStmt.setString (1, factura.getFechaFactura());
                    preparedStmt.setInt (2, factura.getIDProducto());
                    preparedStmt.setString (3, factura.getNombreProducto());
                    preparedStmt.setInt (4, factura.getCantidad());
                    preparedStmt.setDouble(5, factura.getPrecioUnitario());
                    preparedStmt.setDouble(6, factura.getPrecioTotal());
                    preparedStmt.setDouble(7, factura.getEfectivo());
                    preparedStmt.setDouble(8, factura.getCambio());
                    preparedStmt.setString (9, factura.getInfoSuper());
                    preparedStmt.setInt (10, factura.getIDcliente());
                    preparedStmt.setInt (11, factura.getIDvendedor());
                    preparedStmt.setInt (12, factura.getIDfactura());
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return result;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Departamento
	 * @param Departamento recibe un objeto de tipo Departamento 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Factura factura) {
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(FacturaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Factura where IDfactura = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, factura.getIDfactura());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    
}
