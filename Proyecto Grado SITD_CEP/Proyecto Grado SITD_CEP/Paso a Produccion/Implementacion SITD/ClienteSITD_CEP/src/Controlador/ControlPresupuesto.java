/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Ejecucion_presupuesto;
import Estructural.Presupuesto;
import Estructural.Rubro_presupuestal;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public class ControlPresupuesto {

  private IServicioConvenios servicioConvenios;

  public ControlPresupuesto(IServicioConvenios servicioConvenios) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
  }

  /**
   * Metodo para adicionar el presupuesto de un convenio
   * @param presupuesto
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean AdicionPresupuesto(Presupuesto presupuesto) throws RemoteException {
    return servicioConvenios.AdicionPresupuesto(presupuesto);
  }

  /**
   * Metodo para consultar el presupuesto vinculado a un convenio
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public Presupuesto PresupuestoPorConvenio(int numeroConvenio) throws RemoteException {
    return servicioConvenios.PresupuestoPorConvenio(numeroConvenio);
  }

  /**
   * Metodo que consulta ejecucuciones de presupuesto sobre un rubro presupuestal en especifico
   * @param id_rubro
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Ejecucion_presupuesto> ConsultaEjecucionPorRubro(int id_rubro) throws RemoteException {
    return servicioConvenios.ConsultaEjecucionPorRubro(id_rubro);
  }

  /**
   * Metodo que adiciona una ejecucion presupuestal basado en datos de rubros, que asu vez pertenecen a un presupuesto,
   * asignado a un convenio
   * @param ejecucion
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionEjecucion_Presupuesto(Ejecucion_presupuesto ejecucion) throws RemoteException {
    return servicioConvenios.AdicionEjecucion_Presupuesto(ejecucion);
  }

  /**
   * Metodo que Elimina ejecuciones presupuestales dado un rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarEjecucion_presupuesto_PorRubro(Rubro_presupuestal rubro) throws RemoteException {
    return servicioConvenios.EliminarEjecucion_presupuesto_PorRubro(rubro);
  }
}
