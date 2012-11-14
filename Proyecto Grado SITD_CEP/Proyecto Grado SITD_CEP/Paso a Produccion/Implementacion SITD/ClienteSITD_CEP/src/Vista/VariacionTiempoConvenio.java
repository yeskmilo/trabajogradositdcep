/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Vista;

import Estructural.Convenio;
import Modelo.ICambioVista;
import Modelo.IServicioConvenios;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kmilo
 */
public class VariacionTiempoConvenio extends UnicastRemoteObject implements Serializable, ICambioVista {

  private transient GUIVariacionTiempoConvenio guiVariacionTiempoConvenio;
  private IServicioConvenios servicioConvenios;
  private Convenio convenio;

  /**
   * Metodo constructor de la clase Variacion tiempo convenio, Que agregar y muestra variaciones de tiempo en un convenio
   * @param servicioGeneral
   * @throws RemoteException 
   */
  public VariacionTiempoConvenio(IServicioConvenios servicioConvenios, Convenio convenio) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
    this.convenio = convenio;
    AgregarVista();
  }

  private void AgregarVista() throws RemoteException {
    servicioConvenios.AgregarVista(this);
    guiVariacionTiempoConvenio = new GUIVariacionTiempoConvenio(servicioConvenios, convenio);
    guiVariacionTiempoConvenio.show();
  }

  @Override
  public void CambioVista() throws RemoteException {
    guiVariacionTiempoConvenio.CambioVista();
  }
}
