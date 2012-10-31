/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.*;
import Modelo.*;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlConvenio {

  private IServicioConvenios servicioConvenios;

  public ControlConvenio(IServicioConvenios servicioConvenios) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
  }

  public boolean AdicionConvenio(Convenio convenio) throws RemoteException {
    return servicioConvenios.AdicionarConvenio(convenio);
  }

  public boolean AdicionActa(Actas acta) throws RemoteException {
    return servicioConvenios.AdicionActa(acta);
  }

  /**
   * Metodo que consulta un convenio por el numero del mismo
   * @param numeroConvenio
   * @return Objeto de tipo Convenio
   * @throws RemoteException 
   */
  public Convenio ConsultaConvenioNumero(int numeroConvenio) throws RemoteException {
    return servicioConvenios.ConsultaConvenioNumero(numeroConvenio);
  }

  /**
   * Metodo que actualiza un convenio
   * @param convenio
   * @return
   * @throws RemoteException 
   */
  public boolean ActualizarConvenio(Convenio convenio) throws RemoteException {
    return servicioConvenios.ActualizarConvenio(convenio);
  }
}
