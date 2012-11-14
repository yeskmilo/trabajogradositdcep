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
 * Clase estructural Credito_escalafon
 */
public class Credito_escalafon implements Serializable {

    private int id_credito;
    private int numero_creditos;
    private Date fecha_inicio;
    private Date fecha_final;
    private int numero_horas;
    private String resolucion;
    private String nombre_credito;

    /**
     * Constructor de la clase Credito_escalafon
     * @param id_credito
     * @param numero_creditos
     * @param fecha_inicio
     * @param fecha_final
     * @param numero_horas
     * @param resolucion
     * @param nombre_credito 
     */
    public Credito_escalafon(int id_credito, int numero_creditos, Date fecha_inicio, Date fecha_final, int numero_horas, String resolucion, String nombre_credito) {
        this.id_credito = id_credito;
        this.numero_creditos = numero_creditos;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.numero_horas = numero_horas;
        this.resolucion = resolucion;
        this.nombre_credito = nombre_credito;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public int getId_credito() {
        return id_credito;
    }

    public String getNombre_credito() {
        return nombre_credito;
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setId_credito(int id_credito) {
        this.id_credito = id_credito;
    }

    public void setNombre_credito(String nombre_credito) {
        this.nombre_credito = nombre_credito;
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
