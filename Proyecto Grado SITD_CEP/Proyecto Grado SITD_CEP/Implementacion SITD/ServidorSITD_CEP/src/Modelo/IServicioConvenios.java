/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Modelo;

import Estructural.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public interface IServicioConvenios extends Remote {

  /**
   * Metodo para adicionar un nuevo convenio
   * @param convenio
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionarConvenio(Convenio convenio) throws RemoteException;

  /**
   * Metodo para adicionar una nueva acta
   * @param acta
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionActa(Actas acta) throws RemoteException;

  /**
   * Metodo para adicionar una nueva relacion entre convenio y entidad
   * @param entidadConvenio
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionConvenioEntidad(Convenio_entidad entidadConvenio) throws RemoteException;

  /**
   * Metodo para adicionar una nueva relación entre un vinculado y un convenio
   * @param vinculadoConvenio
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionConvenioVinculado(Convenio_vinculado vinculadoConvenio) throws RemoteException;

  /**
   * Metodo para adicionar una nueva entidad
   * @param entidad
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionEntidad(Entidad_convenio entidad) throws RemoteException;

  /**
   * Metodo que consulta entidades, opcional el numero de convenio para establecer la relacion
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Entidad_convenio> ConsultaEntidades(int numeroConvenio) throws RemoteException;

  /**
   * Adicion de una referencia a vista para ser actualizada ante un cambio
   * @param vista
   * @throws RemoteException 
   */
  public void AgregarVista(ICambioVista vista) throws RemoteException;

  /**
   * Metodo para consultar una entidad por su NIT
   * @param NIT
   * @return
   * @throws RemoteException 
   */
  public Entidad_convenio ConsultaEntidad(String NIT) throws RemoteException;

  /**
   * Metodo para eliminar el vinculo entre un convenio y una entidad
   * @param conveni_entidad
   * @return
   * @throws RemoteException 
   */
  public boolean EliminarConvenio_entidad(Convenio_entidad convenio_entidad) throws RemoteException;

  /**
   * Metodo para adicionar un aporte a un convenio hecho por una entidad
   * @param aporte
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionAporte(Aportes_convenio aporte) throws RemoteException;

  /**
   * Metodo que consulta los aportes de una entidad a un convenio
   * @param NIT
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Aportes_convenio> ConsultaAportesEntidadConvenio(String NIT, int numeroConvenio) throws RemoteException;

  /**
   * Metodo para adicionar el presupuesto de un convenio
   * @param presupuesto
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean AdicionPresupuesto(Presupuesto presupuesto) throws RemoteException;

  /**
   * Metodo para consultar el presupuesto vinculado a un convenio
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public Presupuesto PresupuestoPorConvenio(int numeroConvenio) throws RemoteException;

  /**
   * Metodo para adicionar un rubro presupuestal pertenenciente a un presupuesto que
   * esta relacionado a su vez con un convenio
   * @param rubro_presupuestal
   * @return int con id del rubro insertado
   * @throws RemoteException 
   */
  public int AgregarRubro_presupuestal(Rubro_presupuestal rubro_presupuestal) throws RemoteException;

  /**
   * Metodo para adicionar el aporte de una entidad en a un rubro de presupuesto de un convenioF
   * @param aporte_rubro_entidad
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean AgregarAporte_rubro_entidad(Aporte_rubro_entidad aporte_rubro_entidad) throws RemoteException;

  /**
   * Metodo para consultar los rubros presupuestales vinculados a un presupuesto, el cual esta vinculado a un convenio.
   * @param presupuesto
   * @return Arraylist con objetos Rubro_presupuestal
   * @throws RemoteException 
   */
  public ArrayList<Rubro_presupuestal> ConsultaRubrosPorPresupuesto(Presupuesto presupuesto) throws RemoteException;

  /**
   * Metodo que consulta los aportes hecho por una entidad en un rubro presupuestal
   * @param rubro_presupuestal
   * @return Arreglo de aportes por entidad
   * @throws RemoteException 
   */
  public ArrayList<Aporte_rubro_entidad> ConsultaAportesPorRubroEntidad(Rubro_presupuestal rubro_presupuestal) throws RemoteException;

  /**
   * Metodo que consulta un convenio por el numero del mismo
   * @param numeroConvenio
   * @return Objeto de tipo Convenio
   * @throws RemoteException 
   */
  public Convenio ConsultaConvenioNumero(int numeroConvenio) throws RemoteException;

  /**
   * Metodo que consulta ejecucuciones de presupuesto sobre un rubro presupuestal en especifico
   * @param id_rubro
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Ejecucion_presupuesto> ConsultaEjecucionPorRubro(int id_rubro) throws RemoteException;

  /**
   * Metodo que consulta un rubro presupuestal dado el id del rubro
   * @param id_rubro
   * @return Objeto de tipo Rubro presupuestal
   * @throws RemoteException 
   */
  public Rubro_presupuestal ConsultaRubroPorId_Rubro(int id_rubro) throws RemoteException;

  /**
   * Metodo que adiciona una ejecucion presupuestal basado en datos de rubros, que asu vez pertenecen a un presupuesto,
   * asignado a un convenio
   * @param ejecucion
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionEjecucion_Presupuesto(Ejecucion_presupuesto ejecucion) throws RemoteException;

  /**
   * Metodo para actualizar un rubro presupuestal
   * @param rubro
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean ActualizarRubro(Rubro_presupuestal rubro) throws RemoteException;

  /**
   * Metodo para actualizar los aportes de una entidad sobre un rubro
   * @param aporte
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean ActualizarAporte_rubro_entidad(Aporte_rubro_entidad aporte) throws RemoteException;

  /**
   * Metodo que elimina un rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarRubro_presupuestal(Rubro_presupuestal rubro) throws RemoteException;

  /**
   * Metodo que Eliminar el aportes de entidades dado el rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarAporte_rubro_entidad_PorRubro(Rubro_presupuestal rubro) throws RemoteException;

  /**
   * Metodo que Elimina ejecuciones presupuestales dado un rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarEjecucion_presupuesto_PorRubro(Rubro_presupuestal rubro) throws RemoteException;

  /**
   * Metodo para actualizar una Entidad
   * @param entidad
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean ActualizarEntidad_convenio(Entidad_convenio entidad) throws RemoteException;

  /**
   * Metodo para adicionar una variacion de tiempo de un convenio
   * @param variacion
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean AdicionarVariaciones_tiempo(Variaciones_tiempo variacion) throws RemoteException;

  /**
   * Metodo que consulta las variaciones de tiempo que se hayan ingresado para un convenio
   * @param convenio
   * @return ArrayList con objetos de la calse Variaciones_tiempo
   * @throws RemoteException 
   */
  public ArrayList<Variaciones_tiempo> ConsultaVariaciones_tiempoPorConvenio(Convenio convenio) throws RemoteException;

  /**
   * Metodo que actualiza un convenio
   * @param convenio
   * @return
   * @throws RemoteException 
   */
  public boolean ActualizarConvenio(Convenio convenio) throws RemoteException;
}
