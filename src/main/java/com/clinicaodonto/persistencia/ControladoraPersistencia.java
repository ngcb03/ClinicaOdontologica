package com.clinicaodonto.persistencia;

import com.clinicaodonto.logica.Usuario;


public class ControladoraPersistencia {

    private static ControladoraPersistencia controlPersis = null;
    
    private static HorarioJpaController horarioJPA = HorarioJpaController.getInstance();
    private static OdontologoJpaController odontoJPA = OdontologoJpaController.getInstance();
    private static PacienteJpaController pacienteJPA = PacienteJpaController.getInstance();
    private static PersonaJpaController personJPA = PersonaJpaController.getInstance();
    private static ResponsableJpaController responJPA = ResponsableJpaController.getInstance();
    private static SecretarioJpaController secretJPA = SecretarioJpaController.getInstance();
    private static TurnoJpaController turnoJPA = TurnoJpaController.getInstance();
    private static UsuarioJpaController usuJPA = UsuarioJpaController.getInstance();
    
    private ControladoraPersistencia() {        
    }
    
    public static ControladoraPersistencia getInstance(){
        if(controlPersis == null){
            return controlPersis = new ControladoraPersistencia();
        } return null;
    }
    
    
     // CRUD HORARIO JPA
    
    
    
    // CRUD ODONTOLOGO JPA
    
    
    
    // CRUD PACIENTE JPA
    
    
    
    // CRUD  PERSONA JPA
    
    
    
    // CRUD RESPONSABLE JPA
    
    
    
    // CRUD SECRETARIO JPA
    
    
    
    // CRUD TURNO JPA
    
    
    
    // CRUD USUARIO JPA

    public void crearUsuario(Usuario usuario) {
        usuJPA.create(usuario);
    }
    
    
    
}
