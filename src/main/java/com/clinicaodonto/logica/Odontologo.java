package com.clinicaodonto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Odontologo extends Persona implements Serializable {
    
    @Basic
    private String especialidad;
    
    @OneToMany (mappedBy = "odontologo")
    private List<Turno> listaTurnos;
    @OneToOne
    private Horario horario;
    @OneToOne
    private Usuario usuario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Horario horario, Usuario usuario, int id, String dni, String nombre, String apellido, Date fecha_nac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fecha_nac, telefono, direccion);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.horario = horario;
        this.usuario = usuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
