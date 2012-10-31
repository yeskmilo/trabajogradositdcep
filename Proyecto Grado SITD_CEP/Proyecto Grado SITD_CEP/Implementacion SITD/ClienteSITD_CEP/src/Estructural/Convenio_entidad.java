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
 * Clase estructural Convenio_entidad
 */
public class Convenio_entidad implements Serializable {

    private int id_convenio_entidad;
    private int numero_convenio;
    private String nit_entidad;

    /**
     * Constructor de la clase convenio entidad
     * @param id_convenio_entidad
     * @param numero_convenio
     * @param nit_entidad 
     */
    public Convenio_entidad(int id_convenio_entidad, int numero_convenio, String nit_entidad) {
        this.id_convenio_entidad = id_convenio_entidad;
        this.numero_convenio = numero_convenio;
        this.nit_entidad = nit_entidad;
    }

    public int getId_convenio_entidad() {
        return id_convenio_entidad;
    }

    public String getNit_entidad() {
        return nit_entidad;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public void setId_convenio_entidad(int id_convenio_entidad) {
        this.id_convenio_entidad = id_convenio_entidad;
    }

    public void setNit_entidad(String nit_entidad) {
        this.nit_entidad = nit_entidad;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }
}
