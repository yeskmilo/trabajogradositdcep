/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Vista;

import Modelo.ICambioVista;
import Modelo.IServicioConvenios;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kmilo
 */
public class ConsultaConvenioNumero extends UnicastRemoteObject implements Serializable, ICambioVista{

  private transient GUIConsultaConvenioNumero guiConsultaConvenioNumero;
  private IServicioConvenios servicioConvenios;

  /**
   * Metodo constructor de la clase consulta convenio numero, que registra la interfaz y  lanza la vista del usuario
   * @param servicioGeneral
   * @throws RemoteException 
   */
  public ConsultaConvenioNumero (IServicioConvenios servicioConvenios) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
    AgregarVista();
  }

  private void AgregarVista() throws RemoteException {
    servicioConvenios.AgregarVista(this);
    guiConsultaConvenioNumero = new GUIConsultaConvenioNumero(servicioConvenios);
    guiConsultaConvenioNumero.show();
  }

  @Override
  public void CambioVista() throws RemoteException {
    guiConsultaConvenioNumero.CambioVista();
  }
}
