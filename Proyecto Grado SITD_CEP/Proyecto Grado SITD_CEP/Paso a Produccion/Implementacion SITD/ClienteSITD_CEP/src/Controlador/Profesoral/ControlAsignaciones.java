/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Estructural.Asignacion_honorarios;
import Estructural.Asignacion_tiquete;
import Estructural.Asignacion_viaticos;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public class ControlAsignaciones {

  private IServicioProfesoral servicioProfesoral;

  /**
   * Constructor de la clase controladora ControlAsignaciones
   * @param servicioProfesoral 
   */
  public ControlAsignaciones(IServicioProfesoral servicioProfesoral) {
    this.servicioProfesoral = servicioProfesoral;
  }

  /**
   * Adicion de una nueva asignacion de Viaticos
   * @param modulo
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionViaticos(Asignacion_viaticos asignacionViaticos) throws RemoteException {
    return servicioProfesoral.AgregarAsignacionViaticos(asignacionViaticos);
  }

  /**
   * Adición de una nueva asignación de Tiquetes
   * @param asignacionTiquete
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionTiquete(Asignacion_tiquete asignacionTiquete) throws RemoteException {
    return servicioProfesoral.AgregarAsignacionTiquete(asignacionTiquete);
  }

  /**
   * Adición de una nueva asignación de Honorarios
   * @param asignacionHonorarios
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionHonorarios(Asignacion_honorarios asignacionHonorarios) throws RemoteException {
    return servicioProfesoral.AgregarAsignacionHonorarios(asignacionHonorarios);
  }

  /**
   * Busqueda de asignaciones de viaticos, una vez recibido como parametro el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_viaticos> BuscarAsignacionViaticos(int id_modulo) throws RemoteException {
    return servicioProfesoral.BuscarAsignacionViaticos(id_modulo);
  }

  /**
   * Edicion de una asignacion de viaticos
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionViatico(Asignacion_viaticos asignacion) throws RemoteException {
    return servicioProfesoral.EditarAsignacionViatico(asignacion);
  }

  /**
   * Busqueda de Asignaciones de tiquetes, basado en el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_tiquete> BuscarAsignacionTiquetes(int id_modulo) throws RemoteException {
    return servicioProfesoral.BuscarAsignacionTiquetes(id_modulo);
  }

  /**
   * Edicion de una asignacion de tiquetes
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionTiquete(Asignacion_tiquete asignacion) throws RemoteException {
    return servicioProfesoral.EditarAsignacionTiquete(asignacion);
  }

  /**
   * Busqueda de asignación de honorarios, dado el id del modulo
   * @param id_modulo
   * @return
   * @throws RemoteException 
   */
  public ArrayList<Asignacion_honorarios> BuscarAsignacionHonorario(int id_modulo) throws RemoteException {
    return servicioProfesoral.BuscarAsignacionHonorario(id_modulo);
  }

  /**
   * Edicion de una asignacion de Honorarios
   * @param asignacion
   * @return
   * @throws RemoteException 
   */
  public boolean EditarAsignacionHonorario(Asignacion_honorarios asignacion) throws RemoteException {
    return servicioProfesoral.EditarAsignacionHonorario(asignacion);
  }
}
