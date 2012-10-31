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
 * Clase estructural Presupuesto
 */
public class Presupuesto implements Serializable {

    private int id_presupuesto;
    private Date fecha_elaboracion;
    private int numero_convenio;

    /**
     * Constructor de la clase Presupuesto
     * @param id_presupuesto
     * @param fecha_elaboracion
     * @param numero_convenio 
     */
    public Presupuesto(int id_presupuesto, Date fecha_elaboracion, int numero_convenio) {
        this.id_presupuesto = id_presupuesto;
        this.fecha_elaboracion = fecha_elaboracion;
        this.numero_convenio = numero_convenio;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public int getId_presupuesto() {
        return id_presupuesto;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public void setId_presupuesto(int id_presupuesto) {
        this.id_presupuesto = id_presupuesto;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }
}
