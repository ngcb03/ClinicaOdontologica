package com.clinicaodonto.persistencia;

import com.clinicaodonto.logica.Usuario;
import com.clinicaodonto.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        if(null == ControladoraPersistencia.controlPersis){
            ControladoraPersistencia.controlPersis = new ControladoraPersistencia();
        } return ControladoraPersistencia.controlPersis;
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
        ControladoraPersistencia.usuJPA.create(usuario);
    }

    public List<Usuario> traerUsuarios() {
        return ControladoraPersistencia.usuJPA.findUsuarioEntities();
    }

    public void eliminarUsuario(int id_usuario) {
        try {
            ControladoraPersistencia.usuJPA.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
