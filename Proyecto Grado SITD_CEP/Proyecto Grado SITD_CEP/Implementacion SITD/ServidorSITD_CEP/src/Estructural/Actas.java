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
 * Clase estructural Actas
 */
public class Actas implements Serializable {

    private int id_actas;
    private Date fecha_acta;
    private String asunto_acta;
    private int numero_convenio;

    /**
     * Constructor de la clase Actas
     * @param id_actas
     * @param fecha_acta
     * @param asunto_acta
     * @param numero_convenio 
     */
    public Actas(int id_actas, Date fecha_acta, String asunto_acta, int numero_convenio) {
        this.id_actas = id_actas;
        this.fecha_acta = fecha_acta;
        this.asunto_acta = asunto_acta;
        this.numero_convenio = numero_convenio;
    }

    public String getAsunto_acta() {
        return asunto_acta;
    }

    public Date getFecha_acta() {
        return fecha_acta;
    }

    public int getId_actas() {
        return id_actas;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public void setAsunto_acta(String asunto_acta) {
        this.asunto_acta = asunto_acta;
    }

    public void setFecha_acta(Date fecha_acta) {
        this.fecha_acta = fecha_acta;
    }

    public void setId_actas(int id_actas) {
        this.id_actas = id_actas;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }
}
