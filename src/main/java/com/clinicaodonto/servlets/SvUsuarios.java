package com.clinicaodonto.servlets;

import com.clinicaodonto.logica.Controladora;
import com.clinicaodonto.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    private static Controladora control = Controladora.getInstance();
    
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
        
        String nombre_usu = request.getParameter("nombre_usu");
        String contrasenia_usu = request.getParameter("contrasenia_usu");
        String contrasenia_usu2 = request.getParameter("contrasenia_usu2");
        String rol_usu = request.getParameter("rol_usu");
        
        if(contrasenia_usu.equals(contrasenia_usu2)){
            SvUsuarios.control.crearUsuario(nombre_usu, contrasenia_usu, rol_usu);
        } else {
            
        }
                
        response.sendRedirect("altaUsuarios.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
