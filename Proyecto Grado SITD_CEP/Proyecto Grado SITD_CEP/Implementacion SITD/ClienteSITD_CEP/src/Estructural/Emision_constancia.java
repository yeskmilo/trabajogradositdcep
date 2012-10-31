/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Estructural;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kmilo
 * Clase estructural Emision_constancia
 */
public class Emision_constancia implements Serializable {

    private int id_constancia;
    private int cedula_persona;
    private int id_credito_docente;
    private Date fecha_emision;

    /**
     * Constructor de la clase Emision_constancia
     * @param id_constancia
     * @param cedula_persona
     * @param id_credito_docente
     * @param fecha_emision 
     */
    public Emision_constancia(int id_constancia, int cedula_persona, int id_credito_docente, Date fecha_emision) {
        this.id_constancia = id_constancia;
        this.cedula_persona = cedula_persona;
        this.id_credito_docente = id_credito_docente;
        this.fecha_emision = fecha_emision;
    }

    public int getCedula_persona() {
        return cedula_persona;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public int getId_constancia() {
        return id_constancia;
    }

    public int getId_credito_docente() {
        return id_credito_docente;
    }

    public void setCedula_persona(int cedula_persona) {
        this.cedula_persona = cedula_persona;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public void setId_constancia(int id_constancia) {
        this.id_constancia = id_constancia;
    }

    public void setId_credito_docente(int id_credito_docente) {
        this.id_credito_docente = id_credito_docente;
    }
}
