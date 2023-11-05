package com.clinicaodonto.logica;

import com.clinicaodonto.persistencia.ControladoraPersistencia;


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
        if(control == null){
            return control = new Controladora();
        } return null;
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
    
    
    
}
