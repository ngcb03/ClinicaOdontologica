package com.clinicaodonto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


/*

RELACIONES: 

odontologo - turno (ok)
turno - odontologo (ok)
odontologo - horario (ok)
horario - odontologo (ok)
odontologo - usuario (ok)
usuario - odontologo (ok)

paciente - turno (ok)
turno - paciente (ok)
paciente - responsable (ok)
responsable - paciente (ok)


secretario - usuario (ok)
usuario - secretario (ok)

*/

/*

HERENCIA COMPLEJA:

    La herencia para las clases Odontologo, paciente, Responsable y Secretario 
    será especial puesto que heredan de la clase Persona

    Esto lo hacemos a través de la anotación Inheritance, la cual tiene varias
    formas de aplicarse:

        1era. Tanto la clase madre como sus hijas persisten
        2da. Persistan las clases hijas sin tener en cuenta la clase madre
        3ra. Persistan las clases hijas teniendo en cuenta los datos que
                heredan de la clase madre sin que esta persista 
                (esta es la que vamos a ocupar: 
                    (strategy = InheritanceType.TABLE_PER_CLASS) )

              Esta estrategia sugiere como buena práctica que el id lo tenga
              únicamente la clase madre con una estrategia de generación y que
              las hijas lo hereden

*/

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String dni;
    private String nombre;
    private String apellido;
    
    @Temporal (TemporalType.DATE)
    private Date fecha_nac;
    
    private String telefono;
    private String direccion;

    public Persona() {
    }

    public Persona(int id, String dni, String nombre, String apellido, Date fecha_nac, String telefono, String direccion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
