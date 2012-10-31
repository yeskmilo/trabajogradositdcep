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

import Estructural.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kmilo
 */
public interface IServicioProfesoral extends Remote {

  /**
   * Metodo para adicionar un nuevo conferencista en el sistema
   * @param conferencista
   * @return
   * @throws RemoteException 
   */
  public boolean IngresarConferencista(Conferencista conferencista) throws RemoteException;

  /**
   * Consulta de convenio por numero de convenio para vincular a un programa
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public Convenio ConsultaConvenio(int numeroConvenio) throws RemoteException;

  /**
   * Metodo para adicionar un nuevo programa con relacion o no a un convenio
   * @param programa
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionPrograma(Programa programa) throws RemoteException;

  /**
   * Adicion de una referencia a vista para ser actualizada ante un cambio
   * @param vista
   * @throws RemoteException 
   */
  public void AgregarVista(ICambioVista vista) throws RemoteException;

  /**
   * Busqueda de programas dada la cohorte del mismo
   * @param cohorte
   * @return
   * @throws RemoteException 
   */
  public Programa ConsultarPrograma(String cohorte) throws RemoteException;
}
