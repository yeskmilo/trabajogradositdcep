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
 * Clase estructural Variaciones_tiempo
 */
public class Variaciones_tiempo implements Serializable {

  private int id_variacion;
  private Date fecha_variacion;
  private String descripcion_variacion;
  private int duracion_variacion_dias;
  private int numero_convenio;

  /**
   * Constructor de la clase Variaciones_tiempo
   * @param id_variacion
   * @param fecha_variacion
   * @param descripcion_variacion
   * @param duracion_variacion_dias
   * @param numero_convenio 
   */
  public Variaciones_tiempo(int id_variacion, Date fecha_variacion, String descripcion_variacion, int duracion_variacion_dias, int numero_convenio) {
    this.id_variacion = id_variacion;
    this.fecha_variacion = fecha_variacion;
    this.descripcion_variacion = descripcion_variacion;
    this.duracion_variacion_dias = duracion_variacion_dias;
    this.numero_convenio = numero_convenio;
  }

  public String getDescripcion_variacion() {
    return descripcion_variacion;
  }

  public int getDuracion_variacion_dias() {
    return duracion_variacion_dias;
  }

  public Date getFecha_variacion() {
    return fecha_variacion;
  }

  public int getId_variacion() {
    return id_variacion;
  }

  public int getNumero_convenio() {
    return numero_convenio;
  }

  public void setDescripcion_variacion(String descripcion_variacion) {
    this.descripcion_variacion = descripcion_variacion;
  }

  public void setDuracion_variacion_dias(int duracion_variacion_dias) {
    this.duracion_variacion_dias = duracion_variacion_dias;
  }

  public void setFecha_variacion(Date fecha_variacion) {
    this.fecha_variacion = fecha_variacion;
  }

  public void setId_variacion(int id_variacion) {
    this.id_variacion = id_variacion;
  }

  public void setNumero_convenio(int numero_convenio) {
    this.numero_convenio = numero_convenio;
  }
}
