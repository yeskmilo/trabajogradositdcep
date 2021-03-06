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
import java.util.ArrayList;

/**
 *
 * @author kmilo
 */
public interface IServicioProfesoral extends Remote {

  /**
   * Metodo para adicionar un nuevo conferencista en el sistema
   *
   * @param conferencista
   * @return
   * @throws RemoteException
   */
  public boolean IngresarConferencista(Conferencista conferencista) throws RemoteException;

  /**
   * Consulta de convenio por numero de convenio para vincular a un programa
   *
   * @param numeroConvenio
   * @return
   * @throws RemoteException
   */
  public Convenio ConsultaConvenio(int numeroConvenio) throws RemoteException;

  /**
   * Metodo para adicionar un nuevo programa con relacion o no a un convenio
   *
   * @param programa
   * @return
   * @throws RemoteException
   */
  public boolean AdicionPrograma(Programa programa) throws RemoteException;

  /**
   * Adicion de una referencia a vista para ser actualizada ante un cambio
   *
   * @param vista
   * @throws RemoteException
   */
  public void AgregarVista(ICambioVista vista) throws RemoteException;

  /**
   * Busqueda de programas dada la cohorte del mismo
   *
   * @param cohorte
   * @return
   * @throws RemoteException
   */
  public Programa ConsultarPrograma(String cohorte) throws RemoteException;

  /**
   * Edicion de datos de conferencista
   *
   * @param conferencista
   * @return
   * @throws RemoteException
   */
  public boolean EditarConferencista(Conferencista conferencista) throws RemoteException;

  /**
   * Busqueda de conferencista dada la cedula del mismo
   * @param cedula
   * @return
   * @throws RemoteException
   */
  public Conferencista BuscarConferencistaCedula(int cedula) throws RemoteException;

  /**
   * Adicion de un nuevo modulo vinculado a un programa y asignadole un conferencista
   * @param modulo
   * @return
   * @throws RemoteException 
   */
  public int AgregarModuloPrograma(Modulo modulo) throws RemoteException;

  /**
   * Adicion de una nueva asignacion de Viaticos
   * @param modulo
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionViaticos(Asignacion_viaticos asignacionViaticos) throws RemoteException;

  /**
   * Busqueda de modulos dada la cohorte del programa al que pertenecen
   * @param cohorte
   * @return un arreglo con los modulos encontrados
   * @throws RemoteException 
   */
  public ArrayList<Modulo> BuscarModuloPrograma(String cohorte) throws RemoteException;

  /**
   * Edicion de un programa
   * @param programa
   * @return boolean true or false
   * @throws RemoteException 
   */
  public boolean EditarPrograma(Programa programa) throws RemoteException;

  /**
   * Adición de una nueva asignación de Tiquetes
   * @param asignacionTiquete
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionTiquete(Asignacion_tiquete asignacionTiquete) throws RemoteException;

  /**
   * Adición de una nueva asignación de Honorarios
   * @param asignacionHonorarios
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionHonorarios(Asignacion_honorarios asignacionHonorarios) throws RemoteException;

  /**
   * Busqueda General de Programas
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Programa> BuscarProgramas() throws RemoteException;

  /**
   * Busqueda de asignaciones de viaticos, una vez recibido como parametro el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_viaticos> BuscarAsignacionViaticos(int id_modulo) throws RemoteException;

  /**
   * Edicion de una asignacion de viaticos
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionViatico(Asignacion_viaticos asignacion) throws RemoteException;

  /**
   * Busqueda de Asignaciones de tiquetes, basado en el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_tiquete> BuscarAsignacionTiquetes(int id_modulo) throws RemoteException;

  /**
   * Edicion de una asignacion de tiquetes
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionTiquete(Asignacion_tiquete asignacion) throws RemoteException;

  /**
   * Busqueda de asignación de honorarios, dado el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_honorarios> BuscarAsignacionHonorario(int id_modulo) throws RemoteException;

  /**
   * Edicion de una asignacion de Honorarios
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionHonorario(Asignacion_honorarios asignacion) throws RemoteException;
}
