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
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "SvEditUsuarios", urlPatterns = {"/SvEditUsuarios"})
public class SvEditUsuarios extends HttpServlet {

    private static Controladora control = Controladora.getInstance();
    private static Usuario usuario;
    private static HttpSession miSession;
    private static int id_usuario = (-1);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        SvEditUsuarios.id_usuario = Integer.parseInt(request.getParameter("usuario"));
        SvEditUsuarios.usuario = SvEditUsuarios.control.traerUsuario(id_usuario);
        
        SvEditUsuarios.miSession = request.getSession();
        SvEditUsuarios.miSession.setAttribute("usuarioEditar",  SvEditUsuarios.usuario);
        response.sendRedirect("editarUsuarios.jsp");
        
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
            SvEditUsuarios.control.editarUsuario(SvEditUsuarios.id_usuario, nombre_usu, contrasenia_usu, rol_usu);
        } else {
            System.out.println("Las contraseñas del usuario " + nombre_usu + "no coinciden!");
        }
        
        response.sendRedirect("SvUsuarios");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
