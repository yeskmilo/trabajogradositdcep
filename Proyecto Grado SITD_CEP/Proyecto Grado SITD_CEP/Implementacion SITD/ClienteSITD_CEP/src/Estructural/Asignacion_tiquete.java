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
 * Clase estructural Asignacion_tiquete
 */
public class Asignacion_tiquete implements Serializable {

    private int id_tiquete;
    private Date fecha_solicitud;
    private Date fecha_salida;
    private Date fecha_regreso;
    private String ciudad_origen;
    private String ciudad_destino;
    private String aerolinea;
    private String cedula_conferencista;

    /**
     * Constructor de la clase Asignacion_tiquete
     * @param id_tiquete
     * @param fecha_solicitud
     * @param fecha_salida
     * @param fecha_regreso
     * @param ciudad_origen
     * @param ciudad_destino
     * @param aerolinea
     * @param cedula_conferencista 
     */
    public Asignacion_tiquete(int id_tiquete, Date fecha_solicitud, Date fecha_salida, Date fecha_regreso, String ciudad_origen, String ciudad_destino, String aerolinea, String cedula_conferencista) {
        this.id_tiquete = id_tiquete;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.aerolinea = aerolinea;
        this.cedula_conferencista = cedula_conferencista;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getCedula_conferencista() {
        return cedula_conferencista;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public Date getFecha_regreso() {
        return fecha_regreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public int getId_tiquete() {
        return id_tiquete;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setCedula_conferencista(String cedula_conferencista) {
        this.cedula_conferencista = cedula_conferencista;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public void setFecha_regreso(Date fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public void setId_tiquete(int id_tiquete) {
        this.id_tiquete = id_tiquete;
    }
}
