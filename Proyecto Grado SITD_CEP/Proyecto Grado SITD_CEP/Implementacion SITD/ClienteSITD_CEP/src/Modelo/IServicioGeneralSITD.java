/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * Interfaz para Implementar los metodos abstractos
 */
package Modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 * Interface General del Sistema
 */
public interface IServicioGeneralSITD extends Remote {

  /**
   * Metodo para inicio de sesion devuelve un entero dependiendo el rol del usuario que
   * se loguea
   * @param usuario
   * @param contrasena
   * @return
   * @throws RemoteException 
   */
  public int InicioSesion(String usuario, String contrasena) throws RemoteException;

  /**
   * Generacion de una nueva instacia de la interfaz que maneja los metodos de convenio
   * @return
   * @throws RemoteException 
   */
  public IServicioConvenios InstanciaServicioConvenio() throws RemoteException;

  /**
   * Metodo que genera una interfaz con los metodos de la gestion profesoral
   * @return
   * @throws RemoteException 
   */
  public IServicioProfesoral InstanciaServicioProfesoral() throws RemoteException;
}
