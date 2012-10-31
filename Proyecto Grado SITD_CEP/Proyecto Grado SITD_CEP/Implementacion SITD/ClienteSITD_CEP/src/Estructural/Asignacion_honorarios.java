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
 * Clase estructural Asignacion_honorarios
 */
public class Asignacion_honorarios implements Serializable {

    private int id_honorarios;
    private Date fecha_pago;
    private double monto_honorarios;
    private int cedula_conferencista;

    /**
     * Constructor de la clase Asignacion_honorarios
     * @param id_honorarios
     * @param fecha_pago
     * @param monto_honorarios
     * @param cedula_conferencista 
     */
    public Asignacion_honorarios(int id_honorarios, Date fecha_pago, double monto_honorarios, int cedula_conferencista) {
        this.id_honorarios = id_honorarios;
        this.fecha_pago = fecha_pago;
        this.monto_honorarios = monto_honorarios;
        this.cedula_conferencista = cedula_conferencista;
    }

    public int getCedula_conferencista() {
        return cedula_conferencista;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public int getId_honorarios() {
        return id_honorarios;
    }

    public double getMonto_honorarios() {
        return monto_honorarios;
    }

    public void setCedula_conferencista(int cedula_conferencista) {
        this.cedula_conferencista = cedula_conferencista;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setId_honorarios(int id_honorarios) {
        this.id_honorarios = id_honorarios;
    }

    public void setMonto_honorarios(double monto_honorarios) {
        this.monto_honorarios = monto_honorarios;
    }
}
