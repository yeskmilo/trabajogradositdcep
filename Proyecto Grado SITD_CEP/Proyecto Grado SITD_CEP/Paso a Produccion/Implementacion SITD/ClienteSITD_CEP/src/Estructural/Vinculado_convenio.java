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
 * Clase estructural Vinculado_convenio
 */
public class Vinculado_convenio implements Serializable {

    private int id_vinculado;
    private String NIT_vinculado;
    private int cedula_vinculado;
    private double asignacion_salarial;
    private Date fecha_vinculacion;
    private int duracion_vinculacion_dias;
    private String nombres_vinculado;
    private String apellidos_vinculado;
    private String correo_vinculado;
    private String telefono_vinculado;
    private String genero_vinculado;
    private String estado_vinculado;
    private int numero_convenio;

    /**
     * Constructor de la clase Vinculado_convenio
     * @param id_vinculado
     * @param NIT_vinculado
     * @param cedula_vinculado
     * @param asignacion_salarial
     * @param fecha_vinculacion
     * @param duracion_vinculacion_dias
     * @param nombres_vinculado
     * @param apellidos_vinculado
     * @param correo_vinculado
     * @param telefono_vinculado
     * @param genero_vinculado
     * @param estado_vinculado
     * @param numero_convenio 
     */
    public Vinculado_convenio(int id_vinculado, String NIT_vinculado, int cedula_vinculado, double asignacion_salarial, Date fecha_vinculacion, int duracion_vinculacion_dias, String nombres_vinculado, String apellidos_vinculado, String correo_vinculado, String telefono_vinculado, String genero_vinculado, String estado_vinculado, int numero_convenio) {
        this.id_vinculado = id_vinculado;
        this.NIT_vinculado = NIT_vinculado;
        this.cedula_vinculado = cedula_vinculado;
        this.asignacion_salarial = asignacion_salarial;
        this.fecha_vinculacion = fecha_vinculacion;
        this.duracion_vinculacion_dias = duracion_vinculacion_dias;
        this.nombres_vinculado = nombres_vinculado;
        this.apellidos_vinculado = apellidos_vinculado;
        this.correo_vinculado = correo_vinculado;
        this.telefono_vinculado = telefono_vinculado;
        this.genero_vinculado = genero_vinculado;
        this.estado_vinculado = estado_vinculado;
        this.numero_convenio = numero_convenio;
    }

    public String getNIT_vinculado() {
        return NIT_vinculado;
    }

    public String getApellidos_vinculado() {
        return apellidos_vinculado;
    }

    public double getAsignacion_salarial() {
        return asignacion_salarial;
    }

    public int getCedula_vinculado() {
        return cedula_vinculado;
    }

    public String getCorreo_vinculado() {
        return correo_vinculado;
    }

    public int getDuracion_vinculacion_dias() {
        return duracion_vinculacion_dias;
    }

    public String getEstado_vinculado() {
        return estado_vinculado;
    }

    public Date getFecha_vinculacion() {
        return fecha_vinculacion;
    }

    public String getGenero_vinculado() {
        return genero_vinculado;
    }

    public int getId_vinculado() {
        return id_vinculado;
    }

    public String getNombres_vinculado() {
        return nombres_vinculado;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public String getTelefono_vinculado() {
        return telefono_vinculado;
    }

    public void setNIT_vinculado(String NIT_vinculado) {
        this.NIT_vinculado = NIT_vinculado;
    }

    public void setApellidos_vinculado(String apellidos_vinculado) {
        this.apellidos_vinculado = apellidos_vinculado;
    }

    public void setAsignacion_salarial(double asignacion_salarial) {
        this.asignacion_salarial = asignacion_salarial;
    }

    public void setCedula_vinculado(int cedula_vinculado) {
        this.cedula_vinculado = cedula_vinculado;
    }

    public void setCorreo_vinculado(String correo_vinculado) {
        this.correo_vinculado = correo_vinculado;
    }

    public void setDuracion_vinculacion_dias(int duracion_vinculacion_dias) {
        this.duracion_vinculacion_dias = duracion_vinculacion_dias;
    }

    public void setEstado_vinculado(String estado_vinculado) {
        this.estado_vinculado = estado_vinculado;
    }

    public void setFecha_vinculacion(Date fecha_vinculacion) {
        this.fecha_vinculacion = fecha_vinculacion;
    }

    public void setGenero_vinculado(String genero_vinculado) {
        this.genero_vinculado = genero_vinculado;
    }

    public void setId_vinculado(int id_vinculado) {
        this.id_vinculado = id_vinculado;
    }

    public void setNombres_vinculado(String nombres_vinculado) {
        this.nombres_vinculado = nombres_vinculado;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }

    public void setTelefono_vinculado(String telefono_vinculado) {
        this.telefono_vinculado = telefono_vinculado;
    }
}
