package com.clinicaodonto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Paciente extends Persona implements Serializable{
    
    @Basic
    private boolean tiene_obra_social;
    private String tipo_sangre;
    
    @OneToMany (mappedBy = "paciente")
    private List<Turno> listaTurnos;
    @OneToOne
    private Responsable responsable;

    public Paciente() {
    }

    public Paciente(boolean tiene_obra_social, String tipo_sangre, List<Turno> listaTurnos, Responsable responsable, int id, String dni, String nombre, String apellido, Date fecha_nac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fecha_nac, telefono, direccion);
        this.tiene_obra_social = tiene_obra_social;
        this.tipo_sangre = tipo_sangre;
        this.listaTurnos = listaTurnos;
        this.responsable = responsable;
    }

    public boolean isTiene_obra_social() {
        return tiene_obra_social;
    }

    public void setTiene_obra_social(boolean tiene_obra_social) {
        this.tiene_obra_social = tiene_obra_social;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    
    
}
