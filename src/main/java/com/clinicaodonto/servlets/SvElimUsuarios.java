package com.clinicaodonto.servlets;

import com.clinicaodonto.logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SvElimUsuarios", urlPatterns = {"/SvElimUsuarios"})
public class SvElimUsuarios extends HttpServlet {

    private static Controladora control = Controladora.getInstance();
    private static int id_usuario = (-1);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        SvElimUsuarios.id_usuario = Integer.parseInt(request.getParameter("id_usuario_sub2"));
        SvElimUsuarios.control.eliminarUsuario(SvElimUsuarios.id_usuario);
        
        response.sendRedirect("SvUsuarios");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
