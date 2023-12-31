package com.clinicaodonto.logica;

import com.clinicaodonto.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    private static Controladora control = null;
    private static ControladoraPersistencia controlPersis = ControladoraPersistencia.getInstance();
    
    private static Horario horario;
    private static Odontologo odontologo;
    private static Paciente paciente;
    private static Persona persona;
    private static Responsable responsable;
    private static Secretario secretario;
    private static Turno turno;
    private static Usuario usuario;

    private Controladora() {
    }
    
    public static Controladora getInstance(){
        if(Controladora.control == null){
            Controladora.control = new Controladora();
        } return Controladora.control;
    }
    
    // CRUD HORARIO 
    
    
    
    // CRUD ODONTOLOGO
    
    
    
    // CRUD PACIENTE
    
    
    
    // CRUD  PERSONA
    
    
    
    // CRUD RESPONSABLE
    
    
    
    // CRUD SECRETARIO
    
    
    
    // CRUD TURNO
    
    
    
    // CRUD USUARIO

    public void crearUsuario(String nombre_usu, String contrasenia_usu, String rol_usu) {
        Controladora.usuario = new Usuario();
        Controladora.usuario.setNombre(nombre_usu);
        Controladora.usuario.setContrasenia(contrasenia_usu);
        Controladora.usuario.setRol(rol_usu);
        
        Controladora.controlPersis.crearUsuario(Controladora.usuario);
    }

    public List<Usuario> traerUsuarios() {
        return Controladora.controlPersis.traerUsuarios();
    }

    public void eliminarUsuario(int id_usuario) {
        Controladora.controlPersis.eliminarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {
        return Controladora.controlPersis.traerUsuario(id_usuario);
    }

    public void editarUsuario(int id_usuario, String nombre_usu, String contrasenia_usu, String rol_usu) {
        Controladora.usuario = new Usuario();
        Controladora.usuario.setIdUsuario(id_usuario);
        Controladora.usuario.setNombre(nombre_usu);
        Controladora.usuario.setContrasenia(contrasenia_usu);
        Controladora.usuario.setRol(rol_usu);
        Controladora.controlPersis.editarUsuario(Controladora.usuario);
    }

    
    
    // COMPLEMENTOS Y VALIDACIONES
    
    public boolean validarLogin(String nombre_usu, String contrasenia_usu) {
        
        List<Usuario> listaUsuarios = Controladora.controlPersis.traerUsuarios();
        
        for(Usuario usuario: listaUsuarios){
            if(usuario.getNombre().equals(nombre_usu) && 
                    usuario.getContrasenia().equals(contrasenia_usu)){
                return true;
            }
        } return false;
        
    }
    
    
    
    
}
