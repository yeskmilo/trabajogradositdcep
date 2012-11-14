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
 * Clase estructural Credito_docente
 */
public class Credito_docente implements Serializable {

    private int id_credito_docente;
    private int id_credito;
    private int cedula_docente;

    /**
     * Constructor de la clase Credito_docente
     * @param id_credito_docente
     * @param id_credito
     * @param cedula_docente 
     */
    public Credito_docente(int id_credito_docente, int id_credito, int cedula_docente) {
        this.id_credito_docente = id_credito_docente;
        this.id_credito = id_credito;
        this.cedula_docente = cedula_docente;
    }

    public int getCedula_docente() {
        return cedula_docente;
    }

    public int getId_credito() {
        return id_credito;
    }

    public int getId_credito_docente() {
        return id_credito_docente;
    }

    public void setCedula_docente(int cedula_docente) {
        this.cedula_docente = cedula_docente;
    }

    public void setId_credito(int id_credito) {
        this.id_credito = id_credito;
    }

    public void setId_credito_docente(int id_credito_docente) {
        this.id_credito_docente = id_credito_docente;
    }
}
