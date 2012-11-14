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
 * Clase estructural Asignacion_viaticos
 */
public class Asignacion_viaticos implements Serializable {

    private int id_viaticos;
    private Date fecha_pago;
    private double monto_viaticos;
    private int id_modulo;

    /**
     * Constructor de la clase Asignacion_viaticos
     * @param id_viaticos
     * @param fecha_pago
     * @param monto_viaticos
     * @param id_modulo 
     */
    public Asignacion_viaticos(int id_viaticos, Date fecha_pago, double monto_viaticos, int id_modulo) {
        this.id_viaticos = id_viaticos;
        this.fecha_pago = fecha_pago;
        this.monto_viaticos = monto_viaticos;
        this.id_modulo = id_modulo;
    }

    public int getid_modulo() {
        return id_modulo;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public int getId_viaticos() {
        return id_viaticos;
    }

    public double getMonto_viaticos() {
        return monto_viaticos;
    }

    public void setid_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setId_viaticos(int id_viaticos) {
        this.id_viaticos = id_viaticos;
    }

    public void setMonto_viaticos(double monto_viaticos) {
        this.monto_viaticos = monto_viaticos;
    }
}
