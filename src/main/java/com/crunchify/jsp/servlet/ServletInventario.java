/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;


import edu.co.sergio.mundo.dao.InventarioDAO;
import edu.co.sergio.mundo.vo.Inventario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabian.giraldo
 */
public class ServletInventario extends  HttpServlet{
    
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String idInventario = request.getParameter("idInventario");
        String idProducto = request.getParameter("idProducto");
        String cantidad = request.getParameter("cantidad");
        String preciou = request.getParameter("punitario");
        String preciot = request.getParameter("ptotal");
        
        
        //Se debe incluir validaciones - Lo recuerda: Gestion de Excepciones.
        InventarioDAO dao = new InventarioDAO();
        
        Inventario inventario = new Inventario();
        inventario.setIDinventario(Integer.parseInt(idInventario));
        inventario.setIDProducto(Integer.parseInt(idProducto));
        inventario.setCantidad(Integer.parseInt(cantidad));
        inventario.setPrecioUnitario(Double.parseDouble(preciou));
        inventario.setPrecioTotal(Double.parseDouble(preciot));
        dao.insert(inventario);
        
        //Listando la informacion  
        List<Inventario> inventarios =  dao.findAll();
        request.setAttribute("Inventario", inventarios);
       
       
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        }
}
