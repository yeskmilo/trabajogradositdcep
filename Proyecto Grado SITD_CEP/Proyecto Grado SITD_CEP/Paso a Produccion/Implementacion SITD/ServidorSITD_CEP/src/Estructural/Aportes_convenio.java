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
 * Clase estructural Aportes_Convenio
 */
public class Aportes_convenio implements Serializable {

    private int id_aporte;
    private Date fecha_desembolso;
    private double monto_aporte;
    private String NIT_entidad;
    private int numeroConvenio;
    
    /**
     * Contructor de la clase Aportes_convenio
     * @param id_aporte
     * @param fecha_desembolso
     * @param monto_aporte
     * @param NIT_entidad
     * @param numeroConvenio 
     */

    public Aportes_convenio(int id_aporte, Date fecha_desembolso, double monto_aporte, String NIT_entidad, int numeroConvenio) {
        this.id_aporte = id_aporte;
        this.fecha_desembolso = fecha_desembolso;
        this.monto_aporte = monto_aporte;
        this.NIT_entidad = NIT_entidad;
        this.numeroConvenio = numeroConvenio;
    }

    public String getNIT_entidad() {
        return NIT_entidad;
    }

    public Date getFecha_desembolso() {
        return fecha_desembolso;
    }

    public int getId_aporte() {
        return id_aporte;
    }

    public double getMonto_aporte() {
        return monto_aporte;
    }

    public int getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNIT_entidad(String NIT_entidad) {
        this.NIT_entidad = NIT_entidad;
    }

    public void setFecha_desembolso(Date fecha_desembolso) {
        this.fecha_desembolso = fecha_desembolso;
    }

    public void setId_aporte(int id_aporte) {
        this.id_aporte = id_aporte;
    }

    public void setMonto_aporte(double monto_aporte) {
        this.monto_aporte = monto_aporte;
    }

    public void setNumeroConvenio(int numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }
}
