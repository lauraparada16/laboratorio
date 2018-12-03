/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;

import edu.co.sergio.mundo.dao.PersonaDAO;
import edu.co.sergio.mundo.vo.Persona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Laura Parada
 */
public class ServletPersona extends  HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        
        
        //Se debe incluir validaciones - Lo recuerda: Gestion de Excepciones.
        PersonaDAO dao = new PersonaDAO();
        
        Persona persona = new Persona();
        persona.setID(Integer.parseInt(id));
        persona.setNombre(nombre);
        persona.setTelefono(Integer.parseInt(telefono));
        persona.setCorreo(correo);
        dao.insert(persona);
        
        //Listando la informacion  
        List<Persona> personas =  dao.findAll();
        request.setAttribute("Personas", personas);
       
       
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        }
}
