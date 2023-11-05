package com.clinicaodonto.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Responsable extends Persona{
    
    @Basic
    private String tipo_relacion;

    public Responsable() {
    }

    public Responsable(String tipo_relacion, int id, String dni, String nombre, String apellido, Date fecha_nac, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fecha_nac, telefono, direccion);
        this.tipo_relacion = tipo_relacion;
    }

    public String getTipo_relacion() {
        return tipo_relacion;
    }

    public void setTipo_relacion(String tipo_relacion) {
        this.tipo_relacion = tipo_relacion;
    }
    
}
