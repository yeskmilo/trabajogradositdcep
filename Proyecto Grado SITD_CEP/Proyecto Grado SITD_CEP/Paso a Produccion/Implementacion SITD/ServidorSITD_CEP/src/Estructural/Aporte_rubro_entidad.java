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
 */
public class Aporte_rubro_entidad implements Serializable {

    private int id_aporte_rubro;
    private String NIT_entidad;
    private double monto_aporte_rubro;
    private int id_rubro;
    
    /**
     * Metodo constructor de la clase Aporte_rubro_entidad que funciona para especificar
     * el aporte de una entidad en cada uno de los rubros de un presupuesto
     * @param id_aporte_rubro
     * @param NIT_entidad
     * @param monto_aporte_rubro
     * @param id_rubro 
     */

    public Aporte_rubro_entidad(int id_aporte_rubro, String NIT_entidad, double monto_aporte_rubro, int id_rubro) {
        this.id_aporte_rubro = id_aporte_rubro;
        this.NIT_entidad = NIT_entidad;
        this.monto_aporte_rubro = monto_aporte_rubro;
        this.id_rubro = id_rubro;
    }

    public String getNIT_entidad() {
        return NIT_entidad;
    }

    public int getId_aporte_rubro() {
        return id_aporte_rubro;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public double getMonto_aporte_rubro() {
        return monto_aporte_rubro;
    }

    public void setNIT_entidad(String NIT_entidad) {
        this.NIT_entidad = NIT_entidad;
    }

    public void setId_aporte_rubro(int id_aporte_rubro) {
        this.id_aporte_rubro = id_aporte_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public void setMonto_aporte_rubro(double monto_aporte_rubro) {
        this.monto_aporte_rubro = monto_aporte_rubro;
    }
}
