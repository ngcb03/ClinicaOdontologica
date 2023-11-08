package com.clinicaodonto.servlets;

import com.clinicaodonto.logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {

    private static Controladora control = Controladora.getInstance();
    private static HttpSession miSession;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if(request.getSession().getAttribute("sesionActiva") != null){
            SvLogin.miSession.setAttribute("sesionActiva", null);
            response.sendRedirect("login.jsp");
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre_usu = request.getParameter("nombre_usu");
        String contrasenia_usu = request.getParameter("contrasenia_usu");
        
        if(SvLogin.control.validarLogin(nombre_usu, contrasenia_usu)){
            SvLogin.miSession = request.getSession();
            SvLogin.miSession.setAttribute("sesionActiva", true);
            System.out.println("Sesión estado: " + request.getSession().getAttribute("sesionActiva"));
            SvLogin.miSession.setAttribute("usuario", nombre_usu);
            response.sendRedirect("index.jsp");
        } else{
            response.sendRedirect("loginError.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
