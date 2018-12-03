/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;


import edu.co.sergio.mundo.dao.FacturaDAO;
import edu.co.sergio.mundo.vo.Autenticacion;
import edu.co.sergio.mundo.vo.Factura;
import java.io.IOException;
import java.io.PrintWriter;
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
public class IniciarSesion extends  HttpServlet{
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        Autenticacion aut = new Autenticacion();
        
        if(aut.autenticacion(usuario, clave)){
            response.sendRedirect("administrador.jsp");
        }else{
            response.sendRedirect("administrador.jsp");
        }
        
        
        
    }
        
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input

        
        }
}
