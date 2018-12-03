/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Parada - Nicolás Amado
 */
public class CreateDataBase {
     public static void run(){
          String sql = "CREATE TABLE Cliente(IDcliente INTEGER NOT NULL PRIMARY KEY);";
          Connection connection = null;
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
           
          String sql1 = "CREATE TABLE Vendedor(IDvendedor INTEGER NOT NULL PRIMARY KEY);";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql1);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          String sql2 = "CREATE TABLE Administrador(IDadministrador INTEGER NOT NULL PRIMARY KEY);";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql2);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }

          String sql3 = "CREATE TABLE Persona(ID INTEGER NOT NULL PRIMARY KEY, Nombre VARCHAR(250) NOT NULL, Telefono INTEGER NOT NULL, Correo VARCHAR(250));";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql3);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }

          String sql4 = "CREATE TABLE Factura(IDfactura INTEGER NOT NULL PRIMARY KEY, FechaFactura VARCHAR(50) NOT NULL,  IDProducto INTEGER NOT NULL, NombreProducto VARCHAR(250) NOT NULL,  Cantidad INTEGER NOT NULL,"
                  + "PrecioUnitario DOUBLE NOT NULL, PrecioTotal DOUBLE NOT NULL, Efectivo DOUBLE NOT NULL, Cambio DOUBLE NOT NULL, InfoSuper VARCHAR(250), "
                  + "IDcliente INTEGER NOT NULL, IDvendedor INTEGER NOT NULL, FOREIGN KEY(IDcliente) REFERENCES Cliente(IDcliente), FOREIGN KEY(IDvendedor) REFERENCES Vendedor(IDvendedor) )";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql4);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(FacturaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }


          String sql5 = "CREATE TABLE Producto(IDProducto INTEGER NOT NULL PRIMARY KEY, NombreProducto VARCHAR(250) NOT NULL, Cantidad INTEGER NOT NULL,"
                  + "CodeBarra FLOAT NOT NULL, DateEntrada VARCHAR(50) NOT NULL, DateCadusidad VARCHAR(50) NOT NULL, Proveedor VARCHAR(250) NOT NULL,"
                  + "PrecioUnitario DOUBLE NOT NULL,  Estado INTEGER NOT NULL);";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql5);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }

          String sql6 = "CREATE TABLE Inventario(IDinventario INTEGER NOT NULL PRIMARY KEY, IDProducto INTEGER NOT NULL,"
                  + "Cantidad INTEGER NOT NULL, PrecioUnitario DOUBLE NOT NULL, PrecioTotal DOUBLE NOT NULL, FOREIGN KEY(IDProducto) REFERENCES Producto(IDProducto));";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql6);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }

       /*   String sql7 = "CREATE TABLE Caja(IDCaja INTEGER NOT NULL PRIMARY KEY, IDvendedor INTEGER NOT NULL, IDfactura INTEGER NOT NULL, IDProducto INTEGER NOT NULL,"
                  + "FOREIGN KEY(IDvendedor) REFERENCES Vendedor(IDvendedor), FOREIGN KEY(IDfactura) REFERENCES Factura(IDfactura), FOREIGN KEY(IDProducto) REFERENCES Producto(IDProducto));";
            try {
                connection = Conexion.getConnection();
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(sql7);
                
            } catch (URISyntaxException ex) {
                Logger.getLogger(CajaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
             Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }    */        
     }
}
