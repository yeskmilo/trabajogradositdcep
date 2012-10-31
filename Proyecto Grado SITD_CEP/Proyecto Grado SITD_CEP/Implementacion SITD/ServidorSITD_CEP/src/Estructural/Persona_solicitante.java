/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Estructural;

import java.io.Serializable;

/**
 *
 * @author Kmilo
 * Clase estructural Persona_solicitante
 */
public class Persona_solicitante implements Serializable {

    private int id_persona;
    private int cedula_persona;
    private String nombres_persona;
    private String apellidos_persona;
    private String telefono_persona;
    private String celular_persona;

    /**
     * Constructor de la clase Persona_solicitante
     * @param id_persona
     * @param cedula_persona
     * @param nombres_persona
     * @param apellidos_persona
     * @param telefono_persona
     * @param celular_persona 
     */
    public Persona_solicitante(int id_persona, int cedula_persona, String nombres_persona, String apellidos_persona, String telefono_persona, String celular_persona) {
        this.id_persona = id_persona;
        this.cedula_persona = cedula_persona;
        this.nombres_persona = nombres_persona;
        this.apellidos_persona = apellidos_persona;
        this.telefono_persona = telefono_persona;
        this.celular_persona = celular_persona;
    }

    public String getApellidos_persona() {
        return apellidos_persona;
    }

    public int getCedula_persona() {
        return cedula_persona;
    }

    public String getCelular_persona() {
        return celular_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombres_persona() {
        return nombres_persona;
    }

    public String getTelefono_persona() {
        return telefono_persona;
    }

    public void setApellidos_persona(String apellidos_persona) {
        this.apellidos_persona = apellidos_persona;
    }

    public void setCedula_persona(int cedula_persona) {
        this.cedula_persona = cedula_persona;
    }

    public void setCelular_persona(String celular_persona) {
        this.celular_persona = celular_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombres_persona(String nombres_persona) {
        this.nombres_persona = nombres_persona;
    }

    public void setTelefono_persona(String telefono_persona) {
        this.telefono_persona = telefono_persona;
    }
}
