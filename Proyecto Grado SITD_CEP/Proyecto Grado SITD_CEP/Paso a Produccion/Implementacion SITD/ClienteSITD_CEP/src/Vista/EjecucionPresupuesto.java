/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Vista;

import Estructural.Rubro_presupuestal;
import Modelo.ICambioVista;
import Modelo.IServicioConvenios;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kmilo
 */
public class EjecucionPresupuesto extends UnicastRemoteObject implements Serializable, ICambioVista {

  private transient GUIEjecucionPresupuesto guiEjecucionPresupuesto;
  private IServicioConvenios servicioConvenios;
  private Rubro_presupuestal rubro;

  /**
   * Metodo constructor de la clase Ejecucion presupuesto que lanza la vista de ejecucion de presupuesto basado en
   * Ejecutar presupuesto de un Rubro
   * @param servicioConvenios
   * @param rubro
   * @throws RemoteException 
   */
  public EjecucionPresupuesto(IServicioConvenios servicioConvenios, Rubro_presupuestal rubro) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
    this.rubro = rubro;
    AgregarVista();
  }

  private void AgregarVista() throws RemoteException {
    servicioConvenios.AgregarVista(this);
    guiEjecucionPresupuesto = new GUIEjecucionPresupuesto(servicioConvenios, rubro);
    guiEjecucionPresupuesto.show();
  }

  @Override
  public void CambioVista() throws RemoteException {
    guiEjecucionPresupuesto.CambioVista();
  }
}
