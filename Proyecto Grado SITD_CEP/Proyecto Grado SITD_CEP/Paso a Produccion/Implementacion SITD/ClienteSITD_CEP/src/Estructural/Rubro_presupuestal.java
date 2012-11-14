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
 * Clase estructural Rubro_presupuestal
 */
public class Rubro_presupuestal implements Serializable {

    private int id_rubro;
    private String descripcion_rubro;
    private int cantidad;
    private double valor_unitario;
    private int id_presupuesto;

    /**
     * Constructor de la clase Rubro_presupuestal
     * @param id_rubro
     * @param descripcion_rubro
     * @param cantidad
     * @param valor_unitario
     * @param id_presupuesto 
     */
    public Rubro_presupuestal(int id_rubro, String descripcion_rubro, int cantidad, double valor_unitario, int id_presupuesto) {
        this.id_rubro = id_rubro;
        this.descripcion_rubro = descripcion_rubro;
        this.cantidad = cantidad;
        this.valor_unitario = valor_unitario;
        this.id_presupuesto = id_presupuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion_rubro() {
        return descripcion_rubro;
    }

    public int getId_presupuesto() {
        return id_presupuesto;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion_rubro(String descripcion_rubro) {
        this.descripcion_rubro = descripcion_rubro;
    }

    public void setId_presupuesto(int id_presupuesto) {
        this.id_presupuesto = id_presupuesto;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
