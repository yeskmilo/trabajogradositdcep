/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Entidad_convenio;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public class ControlEntidad {

  private IServicioConvenios servicioConvenios;

  public ControlEntidad(IServicioConvenios servicioConvenios) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
  }

  /**
   * Metodo para adicionar una nueva entidad
   * @param entidad
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionEntidad(Entidad_convenio entidad) throws RemoteException {
    return servicioConvenios.AdicionEntidad(entidad);
  }

  /**
   * Metodo para consultar entidades, opcional numero de convenio para establecer relacion
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Entidad_convenio> ConsultaEntidades(int numeroConvenio) throws RemoteException {
    return servicioConvenios.ConsultaEntidades(numeroConvenio);
  }

  public Entidad_convenio ConsultaEntidad(String NIT) throws RemoteException {
    return servicioConvenios.ConsultaEntidad(NIT);
  }

  /**
   * Metodo para actualizar una Entidad
   * @param entidad
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean ActualizarEntidad_convenio(Entidad_convenio entidad) throws RemoteException {
    return servicioConvenios.ActualizarEntidad_convenio(entidad);
  }
}
