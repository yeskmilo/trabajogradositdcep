/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Aporte_rubro_entidad;
import Estructural.Presupuesto;
import Estructural.Rubro_presupuestal;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Implementacion del controlador para inserciones de rubros y aportes por rubros de cada entidad
 * @author Kmilo
 */
public class ControlRubros {

  private IServicioConvenios servicioConvenios;
  private ArrayList<ArrayList> rubrosCategoria = new ArrayList<ArrayList>();

  public ControlRubros(IServicioConvenios servicioConvenios) throws RemoteException {
    this.servicioConvenios = servicioConvenios;
    SetCategorias();
  }

  /**
   * Metodo para adicionar un rubro presupuestal pertenenciente a un presupuesto que
   * esta relacionado a su vez con un convenio
   * @param rubro_presupuestal
   * @return int con id del rubro insertado
   * @throws RemoteException 
   */
  public int AgregarRubro_presupuestal(Rubro_presupuestal rubro_presupuestal) throws RemoteException {
    return servicioConvenios.AgregarRubro_presupuestal(rubro_presupuestal);
  }

  /**
   * Metodo para adicionar el aporte de una entidad en a un rubro de presupuesto de un convenioF
   * @param aporte_rubro_entidad
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean AgregarAporte_rubro_entidad(Aporte_rubro_entidad aporte_rubro_entidad) throws RemoteException {
    return servicioConvenios.AgregarAporte_rubro_entidad(aporte_rubro_entidad);
  }

  /**
   * Metodo para consultar los rubros presupuestales vinculados a un presupuesto, el cual esta vinculado a un convenio.
   * @param presupuesto
   * @return Arraylist con objetos Rubro_presupuestal
   * @throws RemoteException 
   */
  public ArrayList<Rubro_presupuestal> ConsultaRubrosPorPresupuesto(Presupuesto presupuesto) throws RemoteException {
    return servicioConvenios.ConsultaRubrosPorPresupuesto(presupuesto);
  }

  /**
   * Metodo que consulta los aportes hecho por una entidad en un rubro presupuestal
   * @param rubro_presupuestal
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Aporte_rubro_entidad> ConsultaAportesPorRubroEntidad(Rubro_presupuestal rubro_presupuestal) throws RemoteException {
    return servicioConvenios.ConsultaAportesPorRubroEntidad(rubro_presupuestal);
  }

  /**
   * Metodo que consulta un rubro presupuestal dado el id del rubro
   * @param id_rubro
   * @return Objeto de tipo Rubro presupuestal
   * @throws RemoteException 
   */
  public Rubro_presupuestal ConsultaRubroPorId_Rubro(int id_rubro) throws RemoteException {
    return servicioConvenios.ConsultaRubroPorId_Rubro(id_rubro);
  }

  /**
   * Metodo para actualizar un rubro presupuestal
   * @param rubro
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean ActualizarRubro(Rubro_presupuestal rubro) throws RemoteException {
    return servicioConvenios.ActualizarRubro(rubro);
  }

  /**
   * Metodo para actualizar los aportes de una entidad sobre un rubro
   * @param aporte
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean ActualizarAporte_rubro_entidad(Aporte_rubro_entidad aporte) throws RemoteException {
    return servicioConvenios.ActualizarAporte_rubro_entidad(aporte);
  }

  /**
   * Metodo que elimina un rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarRubro_presupuestal(Rubro_presupuestal rubro) throws RemoteException {
    return servicioConvenios.EliminarRubro_presupuestal(rubro);
  }

  /**
   * Metodo que Eliminar el aportes de entidades dado el rubro presupuestal
   * @param rubro
   * @return boolean True or False
   * @throws RemoteException 
   */
  public boolean EliminarAporte_rubro_entidad_PorRubro(Rubro_presupuestal rubro) throws RemoteException {
    return servicioConvenios.EliminarAporte_rubro_entidad_PorRubro(rubro);
  }

  /**
   * Metodo para establecer las categorias por defecto
   */
  private void SetCategorias() {
    ArrayList personal = new ArrayList();
    rubrosCategoria.add(personal);
    ArrayList materiales = new ArrayList();
    rubrosCategoria.add(materiales);
    ArrayList gastosViaje = new ArrayList();
    rubrosCategoria.add(gastosViaje);
    ArrayList otros = new ArrayList();
    rubrosCategoria.add(otros);
    SetRubros();
  }

  private void SetRubros() {
    /**
     * Definicion de los rubros vinculados a la categoria Personal
     */
    rubrosCategoria.get(0).add("Director del Proyecto");
    rubrosCategoria.get(0).add("Supervisor");
    rubrosCategoria.get(0).add("Profesionales de apoyo");
    rubrosCategoria.get(0).add("Técnicos de apoyo");
    rubrosCategoria.get(0).add("Talleristas");
    rubrosCategoria.get(0).add("Estudiantes apoyo");
    rubrosCategoria.get(0).add("Apoyo Facultad de");
    /**
     * Definicion de los rubros vinculados a la categoria Materiales y Equipos
     */
    rubrosCategoria.get(1).add("Fotocopias");
    rubrosCategoria.get(1).add("Diseño de materiales para cualificación");
    rubrosCategoria.get(1).add("Fotocopias materiales cualificación");
    rubrosCategoria.get(1).add("Otros diseños");
    rubrosCategoria.get(1).add("Otros materiales");
    rubrosCategoria.get(1).add("Revisión y calificación pruebas entrega resultados");
    rubrosCategoria.get(1).add("Sistematización de la experiencia");
    rubrosCategoria.get(1).add("Salones y equipos");
    rubrosCategoria.get(1).add("Informe resultados");
    rubrosCategoria.get(1).add("Procesamiento estadístico de datos");
    rubrosCategoria.get(1).add("Diseño publicación");
    rubrosCategoria.get(1).add("Corrección de estilo");
    rubrosCategoria.get(1).add("Publicación");
    /**
     * Definición de los rubros vinculados a la categoria Gastos de viaje y manutención
     */
    rubrosCategoria.get(2).add("Transporte Nacional");
    rubrosCategoria.get(2).add("Transporte intermunicipal");
    rubrosCategoria.get(2).add("Transporte local");
    rubrosCategoria.get(2).add("Alimentación");
    rubrosCategoria.get(2).add("Hospedaje");
    rubrosCategoria.get(2).add("Refrigerios");
    /**
     * Definición de los rubros vinculados a la categoria Otros
     */
    rubrosCategoria.get(3).add("Administración Académica");
    rubrosCategoria.get(3).add("Administración financiera");
    rubrosCategoria.get(3).add("Oficina y equipos");
    rubrosCategoria.get(3).add("Certificados a docentes participantes");
    rubrosCategoria.get(3).add("Gastos bancarios");
    rubrosCategoria.get(3).add("Socialización");
    rubrosCategoria.get(3).add("Imprevistos");
  }

  /**
   * Metodo que devuelve las cateogrias con sus respectivos rubros definidos
   * @return 
   */
  public ArrayList<ArrayList> getRubrosCategorias() {
    return rubrosCategoria;
  }
}
