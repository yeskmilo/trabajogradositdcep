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
 * Clase estructural Entidad_convenio
 */
public class Entidad_convenio implements Serializable {

    private int id_entidad;
    private String NIT_entidad;
    private String nombre_entidad;
    private String descripcion_entidad;
    
    /**
     * Constructor de la clase Entidad Convenio
     * @param id_entidad
     * @param NIT_entidad
     * @param nombre_entidad
     * @param descripcion_entidad 
     */

    public Entidad_convenio(int id_entidad, String NIT_entidad, String nombre_entidad, String descripcion_entidad) {
        this.id_entidad = id_entidad;
        this.NIT_entidad = NIT_entidad;
        this.nombre_entidad = nombre_entidad;
        this.descripcion_entidad = descripcion_entidad;
    }

    public String getNIT_entidad() {
        return NIT_entidad;
    }

    public String getDescripcion_entidad() {
        return descripcion_entidad;
    }

    public int getId_entidad() {
        return id_entidad;
    }

    public String getNombre_entidad() {
        return nombre_entidad;
    }

    public void setNIT_entidad(String NIT_entidad) {
        this.NIT_entidad = NIT_entidad;
    }

    public void setDescripcion_entidad(String descripcion_entidad) {
        this.descripcion_entidad = descripcion_entidad;
    }

    public void setId_entidad(int id_entidad) {
        this.id_entidad = id_entidad;
    }

    public void setNombre_entidad(String nombre_entidad) {
        this.nombre_entidad = nombre_entidad;
    }
}
