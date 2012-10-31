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
 * Clase estructural Ejecucion_presupuesto
 */
public class Ejecucion_presupuesto implements Serializable {

  private int id_ejecucion;
  private double monto_ejecutado;
  private Date fecha_ejecucion;
  private String descripcion_ejecucion;
  private int id_rubro;

  /**
   * Constructor de la clase Ejecucion_presupuesto
   * @param id_ejecucion
   * @param monto_ejecutado
   * @param fecha_ejecucion
   * @param descripcion_ejecucion
   * @param id_rubro 
   */
  public Ejecucion_presupuesto(int id_ejecucion, double monto_ejecutado, Date fecha_ejecucion, String descripcion_ejecucion, int id_rubro) {
    this.id_ejecucion = id_ejecucion;
    this.monto_ejecutado = monto_ejecutado;
    this.fecha_ejecucion = fecha_ejecucion;
    this.descripcion_ejecucion = descripcion_ejecucion;
    this.id_rubro = id_rubro;
  }

  public String getDescripcion_ejecucion() {
    return descripcion_ejecucion;
  }

  public Date getFecha_ejecucion() {
    return fecha_ejecucion;
  }

  public int getId_ejecucion() {
    return id_ejecucion;
  }

  public int getId_rubro() {
    return id_rubro;
  }

  public double getMonto_ejecutado() {
    return monto_ejecutado;
  }

  public void setDescripcion_ejecucion(String descripcion_ejecucion) {
    this.descripcion_ejecucion = descripcion_ejecucion;
  }

  public void setFecha_ejecucion(Date fecha_ejecucion) {
    this.fecha_ejecucion = fecha_ejecucion;
  }

  public void setId_ejecucion(int id_ejecucion) {
    this.id_ejecucion = id_ejecucion;
  }

  public void setId_rubro(int id_rubro) {
    this.id_rubro = id_rubro;
  }

  public void setMonto_ejecutado(double monto_ejecutado) {
    this.monto_ejecutado = monto_ejecutado;
  }
}
