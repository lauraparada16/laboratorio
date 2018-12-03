/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;


import edu.co.sergio.mundo.dao.FacturaDAO;
import edu.co.sergio.mundo.vo.Factura;
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
 * @author Laura Parada
 */
public class ServletFactura extends  HttpServlet{
    
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String idFactura = request.getParameter("idFactura");
        String FechaFactura = request.getParameter("FechaFactura");
        String idProducto = request.getParameter("idProducto");
        String nombreProducto = request.getParameter("nombreProducto");
        String cantidad = request.getParameter("cantidad");
        String preciou = request.getParameter("punitario");
        String preciot = request.getParameter("ptotal");
        String efectivo= request.getParameter("efectivo");
        String cambio = request.getParameter("cambio");
        String InfoSuper = request.getParameter("InfoSuper");
        String idCliente = request.getParameter("idCliente");
        String idVendedor = request.getParameter("idVendedor");
        
        
        //Se debe incluir validaciones - Lo recuerda: Gestion de Excepciones.
        FacturaDAO dao = new FacturaDAO();
        
        Factura factura = new Factura();
        factura.setIDfactura(Integer.parseInt(idFactura));
        factura.setFechaFactura(FechaFactura);
        factura.setIDProducto(Integer.parseInt(idProducto));
        factura.setNombreProducto(nombreProducto);
        factura.setCantidad(Integer.parseInt(cantidad));
        factura.setPrecioUnitario(Double.parseDouble(preciou));
        factura.setPrecioTotal(Double.parseDouble(preciot));
        factura.setEfectivo(Double.parseDouble(efectivo));
        factura.setCambio(Double.parseDouble(cambio));
        factura.setInfoSuper(InfoSuper);
        factura.setIDcliente(Integer.parseInt(idCliente));
        factura.setIDvendedor(Integer.parseInt(idVendedor));
        dao.insert(factura);
        
        //Listando la informacion  
        List<Factura> facturas =  dao.findAll();
        request.setAttribute("Factura ", facturas);
       
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        }
}
