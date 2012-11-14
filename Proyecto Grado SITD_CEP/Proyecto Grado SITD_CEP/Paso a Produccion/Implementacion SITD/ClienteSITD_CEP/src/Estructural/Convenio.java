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
 * Clase estructural Convenio
 */
public class Convenio implements Serializable {

    private int id_convenio;
    private int numero_convenio;
    private Date fecha_inicio_convenio;
    private int duracion_convenio_dias;
    private String saldos_sociales;
    private String saldos_pedagogicos;
    private String resumen_convenio;
    private String objeto_convenio;
    private String estado_convenio;

    /**
     * Constructor de la clase Convenio
     * @param id_convenio
     * @param numero_convenio
     * @param fecha_inicio_convenio
     * @param duracion_convenio_dias
     * @param saldos_sociales
     * @param saldos_pedagogicos
     * @param resumen_convenio
     * @param objeto_convenio
     * @param estado_convenio 
     */
    public Convenio(int id_convenio, int numero_convenio, Date fecha_inicio_convenio, int duracion_convenio_dias, String saldos_sociales, String saldos_pedagogicos, String resumen_convenio, String objeto_convenio, String estado_convenio) {
        this.id_convenio = id_convenio;
        this.numero_convenio = numero_convenio;
        this.fecha_inicio_convenio = fecha_inicio_convenio;
        this.duracion_convenio_dias = duracion_convenio_dias;
        this.saldos_sociales = saldos_sociales;
        this.saldos_pedagogicos = saldos_pedagogicos;
        this.resumen_convenio = resumen_convenio;
        this.objeto_convenio = objeto_convenio;
        this.estado_convenio = estado_convenio;
    }

    public int getDuracion_convenio_dias() {
        return duracion_convenio_dias;
    }

    public String getEstado_convenio() {
        return estado_convenio;
    }

    public Date getFecha_inicio_convenio() {
        return fecha_inicio_convenio;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public String getObjeto_convenio() {
        return objeto_convenio;
    }

    public String getResumen_convenio() {
        return resumen_convenio;
    }

    public String getSaldos_pedagogicos() {
        return saldos_pedagogicos;
    }

    public String getSaldos_sociales() {
        return saldos_sociales;
    }

    public void setDuracion_convenio_dias(int duracion_convenio_dias) {
        this.duracion_convenio_dias = duracion_convenio_dias;
    }

    public void setEstado_convenio(String estado_convenio) {
        this.estado_convenio = estado_convenio;
    }

    public void setFecha_inicio_convenio(Date fecha_inicio_convenio) {
        this.fecha_inicio_convenio = fecha_inicio_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }

    public void setObjeto_convenio(String objeto_convenio) {
        this.objeto_convenio = objeto_convenio;
    }

    public void setResumen_convenio(String resumen_convenio) {
        this.resumen_convenio = resumen_convenio;
    }

    public void setSaldos_pedagogicos(String saldos_pedagogicos) {
        this.saldos_pedagogicos = saldos_pedagogicos;
    }

    public void setSaldos_sociales(String saldos_sociales) {
        this.saldos_sociales = saldos_sociales;
    }
}
