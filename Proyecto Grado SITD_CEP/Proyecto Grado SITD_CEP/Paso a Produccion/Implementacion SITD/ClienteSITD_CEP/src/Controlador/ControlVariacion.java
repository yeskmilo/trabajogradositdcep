/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Convenio;
import Estructural.Variaciones_tiempo;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public class ControlVariacion {

  private IServicioConvenios servicioConvenios;

  public ControlVariacion(IServicioConvenios servicioConvenios) {
    this.servicioConvenios = servicioConvenios;
  }

  /**
   * Metodo para adicionar una variacion de tiempo de un convenio
   * @param variacion
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean AdicionarVariaciones_tiempo(Variaciones_tiempo variacion) throws RemoteException {
    return servicioConvenios.AdicionarVariaciones_tiempo(variacion);
  }

  /**
   * Metodo que consulta las variaciones de tiempo que se hayan ingresado para un convenio
   * @param convenio
   * @return ArrayList con objetos de la calse Variaciones_tiempo
   * @throws RemoteException 
   */
  public ArrayList<Variaciones_tiempo> ConsultaVariaciones_tiempoPorConvenio(Convenio convenio) throws RemoteException {
    return servicioConvenios.ConsultaVariaciones_tiempoPorConvenio(convenio);
  }
}
