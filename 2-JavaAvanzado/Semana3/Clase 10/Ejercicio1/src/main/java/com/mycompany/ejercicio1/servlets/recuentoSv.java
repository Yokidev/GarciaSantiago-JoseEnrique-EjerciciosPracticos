/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.ejercicio1.servlets;

import com.mycompany.ejercicio1.models.Controller;
import com.mycompany.ejercicio1.models.Partido;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jegs_
 */
@WebServlet(name = "recuentoSv", urlPatterns = {"/recuentoSv"})
public class recuentoSv extends HttpServlet {

    Controller control = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Partido> listaPartidos = control.listPartidos();
                
        HttpSession sesion= request.getSession();
        sesion.setAttribute("listaPartidos",listaPartidos);
        response.sendRedirect("verVotos.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String voto = request.getParameter("Votar");
        Partido partido;
        
        if (voto.equals("A")){
            partido = control.findPartido(1);
            int votos = partido.getVotes() + 1;
            
            control.editPartido(votos, partido);
            
        }
        if (voto.equals("B")){
            partido = control.findPartido(2);
            int votos = partido.getVotes() + 1;
            
            control.editPartido(votos, partido);
        }
        if (voto.equals("C")){
            partido = control.findPartido(3);
            int votos = partido.getVotes() + 1;
            
            control.editPartido(votos, partido);
        }
        
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
