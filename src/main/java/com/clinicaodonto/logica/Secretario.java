package com.clinicaodonto.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Secretario extends Persona{
    
    @Basic
    private String sector;
    
    @OneToOne
    private Usuario usuario;
 
    public Secretario() {
    }

    public Secretario(String sector, Usuario usuario, int id, String dni, String nombre, String apellido, Date fecha_nac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fecha_nac, telefono, direccion);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
    
}
