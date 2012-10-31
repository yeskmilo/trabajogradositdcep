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
 * Clase estructural Modulo
 */
public class Modulo implements Serializable {

    private int id_modulo;
    private String nombre_modulo;
    private int duracion_modulo_horas;
    private Date fecha_inicio_modulo;
    private double valor_hora;
    private String cohorte_programa;
    private int cedula_conferencista;

    /**
     * Constructor de la clase Modulo
     * @param id_modulo
     * @param nombre_modulo
     * @param duracion_modulo_horas
     * @param fecha_inicio_modulo
     * @param valor_hora
     * @param cohorte_programa
     * @param cedula_conferencista 
     */
    public Modulo(int id_modulo, String nombre_modulo, int duracion_modulo_horas, Date fecha_inicio_modulo, double valor_hora, String cohorte_programa, int cedula_conferencista) {
        this.id_modulo = id_modulo;
        this.nombre_modulo = nombre_modulo;
        this.duracion_modulo_horas = duracion_modulo_horas;
        this.fecha_inicio_modulo = fecha_inicio_modulo;
        this.valor_hora = valor_hora;
        this.cohorte_programa = cohorte_programa;
        this.cedula_conferencista = cedula_conferencista;
    }

    public int getCedula_conferencista() {
        return cedula_conferencista;
    }

    public String getCohorte_programa() {
        return cohorte_programa;
    }

    public int getDuracion_modulo_horas() {
        return duracion_modulo_horas;
    }

    public Date getFecha_inicio_modulo() {
        return fecha_inicio_modulo;
    }

    public int getId_modulo() {
        return id_modulo;
    }

    public String getNombre_modulo() {
        return nombre_modulo;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setCedula_conferencista(int cedula_conferencista) {
        this.cedula_conferencista = cedula_conferencista;
    }

    public void setCohorte_programa(String cohorte_programa) {
        this.cohorte_programa = cohorte_programa;
    }

    public void setDuracion_modulo_horas(int duracion_modulo_horas) {
        this.duracion_modulo_horas = duracion_modulo_horas;
    }

    public void setFecha_inicio_modulo(Date fecha_inicio_modulo) {
        this.fecha_inicio_modulo = fecha_inicio_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public void setNombre_modulo(String nombre_modulo) {
        this.nombre_modulo = nombre_modulo;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
}
