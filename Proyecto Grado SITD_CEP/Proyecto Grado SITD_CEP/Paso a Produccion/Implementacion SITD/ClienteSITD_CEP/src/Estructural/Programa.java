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
 * Clase estructural Programa
 */
public class Programa implements Serializable {

  private int id_programa;
  private String cohorte_programa;
  private String nombre_programa;
  private Date fecha_inicio_programa;
  private double valor;
  private int participantes;
  private String estado;
  private int numero_convenio;

  /**
   * Constructor de la clase Programa
   * @param id_programa
   * @param cohorte_programa
   * @param nombre_programa
   * @param fecha_inicio_programa
   * @param valor
   * @param participantes
   * @param estado
   * @param numero_convenio 
   */
  public Programa(int id_programa, String cohorte_programa, String nombre_programa, Date fecha_inicio_programa, double valor, int participantes, String estado, int numero_convenio) {
    this.id_programa = id_programa;
    this.cohorte_programa = cohorte_programa;
    this.nombre_programa = nombre_programa;
    this.fecha_inicio_programa = fecha_inicio_programa;
    this.valor = valor;
    this.participantes = participantes;
    this.estado = estado;
    this.numero_convenio = numero_convenio;
  }

  public String getCohorte_programa() {
    return cohorte_programa;
  }

  public String getEstado() {
    return estado;
  }

  public Date getFecha_inicio_programa() {
    return fecha_inicio_programa;
  }

  public int getId_programa() {
    return id_programa;
  }

  public String getNombre_programa() {
    return nombre_programa;
  }

  public int getNumero_convenio() {
    return numero_convenio;
  }

  public int getParticipantes() {
    return participantes;
  }

  public double getValor() {
    return valor;
  }

  public void setCohorte_programa(String cohorte_programa) {
    this.cohorte_programa = cohorte_programa;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setFecha_inicio_programa(Date fecha_inicio_programa) {
    this.fecha_inicio_programa = fecha_inicio_programa;
  }

  public void setId_programa(int id_programa) {
    this.id_programa = id_programa;
  }

  public void setNombre_programa(String nombre_programa) {
    this.nombre_programa = nombre_programa;
  }

  public void setNumero_convenio(int numero_convenio) {
    this.numero_convenio = numero_convenio;
  }

  public void setParticipantes(int participantes) {
    this.participantes = participantes;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
