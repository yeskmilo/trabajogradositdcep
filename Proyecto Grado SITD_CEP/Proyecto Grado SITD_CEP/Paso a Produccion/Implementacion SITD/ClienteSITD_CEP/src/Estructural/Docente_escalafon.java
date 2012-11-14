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
 * Clase estructural Docente_escalafon
 */
public class Docente_escalafon implements Serializable {

    private int id_docente;
    private int cedula_docente;
    private String nombres_docente;
    private String apellidos_docente;
    private String municipio_docente;
    private String genero_docente;
    private String telefono_docente;

    /**
     * Constructor de la clase Docente_escalafon
     * @param id_docente
     * @param cedula_docente
     * @param nombres_docente
     * @param apellidos_docente
     * @param municipio_docente
     * @param genero_docente
     * @param telefono_docente 
     */
    public Docente_escalafon(int id_docente, int cedula_docente, String nombres_docente, String apellidos_docente, String municipio_docente, String genero_docente, String telefono_docente) {
        this.id_docente = id_docente;
        this.cedula_docente = cedula_docente;
        this.nombres_docente = nombres_docente;
        this.apellidos_docente = apellidos_docente;
        this.municipio_docente = municipio_docente;
        this.genero_docente = genero_docente;
        this.telefono_docente = telefono_docente;
    }

    public String getApellidos_docente() {
        return apellidos_docente;
    }

    public int getCedula_docente() {
        return cedula_docente;
    }

    public String getGenero_docente() {
        return genero_docente;
    }

    public int getId_docente() {
        return id_docente;
    }

    public String getMunicipio_docente() {
        return municipio_docente;
    }

    public String getNombres_docente() {
        return nombres_docente;
    }

    public String getTelefono_docente() {
        return telefono_docente;
    }

    public void setApellidos_docente(String apellidos_docente) {
        this.apellidos_docente = apellidos_docente;
    }

    public void setCedula_docente(int cedula_docente) {
        this.cedula_docente = cedula_docente;
    }

    public void setGenero_docente(String genero_docente) {
        this.genero_docente = genero_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public void setMunicipio_docente(String municipio_docente) {
        this.municipio_docente = municipio_docente;
    }

    public void setNombres_docente(String nombres_docente) {
        this.nombres_docente = nombres_docente;
    }

    public void setTelefono_docente(String telefono_docente) {
        this.telefono_docente = telefono_docente;
    }
}
